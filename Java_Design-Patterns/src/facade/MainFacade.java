package facade;

public class MainFacade {

    public static void main(String[] args) {
        // 3. Client uses Facade
        Line line1 = new Line(new Point(2, 4), new Point(5, 7));
        line1.move(-2, -4);
        System.out.println("After move: " + line1);
        line1.rotate(45);
        System.out.println("After rotate: " + line1);
        Line line2 = new Line(new Point(2, 1), new Point(2.866, 1.5));
        line2.rotate(30);
        System.out.println("30 to 60 degrees: " + line2);
    }

}
