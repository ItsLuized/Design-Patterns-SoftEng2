package facade;

public class Point {
    private PointCarte pc; // 2. Design a "wrapper" class

    public Point(double x, double y) {
        this.pc = new PointCarte(x, y);
    }

    @Override
    public String toString() {
        return pc.toString();
    }

    // 4. Wrapper maps
    public void move(double dx, double dy) {
        pc.move(dx, dy);
    }

    public void rotate(int angle, Point point) {
        double x = pc.getX() - point.pc.getX();
        double y = pc.getY() - point.pc.getY();
        PointPolar pp = new PointPolar(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)), Math.atan2(y, x) * 180 / Math.PI);

        // 4. Wrapper maps
        pp.rotate(angle);
        System.out.println("PointPolar is " + pp);
        String str = pp.toString();
        int i = str.indexOf("@");
        double r = Double.parseDouble(str.substring(1, i));
        double a = Double.parseDouble(str.substring(i + 1, str.length() - 1));

        pc = new PointCarte(r * Math.cos(a * Math.PI / 180) + point.pc.getX(),
                            r * Math.sin(a * Math.PI / 180) + point.pc.getY());
    }
}
