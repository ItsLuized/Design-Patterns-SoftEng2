package flyweight;

public class FlyweightMain {

    public static void main(String[] args) {
        AlienFactory factory = new AlienFactory();
        factory.saveAlien(0, new LargeAlien());
        factory.saveAlien(1, new SmallAlien());

        //Now Access the FlyWeight Objects
        IAlien a = factory.getAlien(0);
        IAlien b = factory.getAlien(1);

        //show intrinsic state, all accessed in memory without calculation
        System.out.println("Showing intrinsic states:");
        System.out.println("Alien of type 0 is: " + a.Shape());
        System.out.println("Alien of type 0 is: " + b.Shape());

        //show extrinsic states, need calculations
        System.out.println("Showing extrinsic states");
        System.out.println("Alien of type 0 is: " + a.getColor(0));
        System.out.println("Alien of type 0 is: " + a.getColor(1));
        System.out.println("Alien of type 1 is: " + b.getColor(0));
        System.out.println("Alien of type 1 is: " + b.getColor(1));
    }
}
