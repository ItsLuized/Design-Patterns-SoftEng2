package facade;

public class Line {
    private Point origin;
    private Point end;

    public Line(Point origin, Point end) {
        this.origin = origin;
        this.end = end;
    }

    public void move(double dx, double dy) {
        this.origin.move(dx, dy);
        this.end.move(dx, dy);
    }

    public void rotate(int angle) {
        this.end.rotate(angle, this.origin);
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "origin is " + this.origin + ", end is " + this. end;
    }
}
