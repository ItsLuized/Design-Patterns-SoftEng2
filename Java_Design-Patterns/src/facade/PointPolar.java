package facade;

public class PointPolar {
    public double angle;
    private double radius;

    public PointPolar(double r, double a) {
        this.radius = r;
        this.angle = a;
    }

    public void rotate(int angle) {
        this.angle += angle % 360;
    }

    public String toString() {
        return "[" + this.radius + "@" + this.angle + "]";
    }

    public double getAngle() {
        return angle;
    }

    public double getRadius() {
        return radius;
    }
}
