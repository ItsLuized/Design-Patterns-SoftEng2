package facade;

public class PointCarte {
    private double x, y;

    public PointCarte(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
