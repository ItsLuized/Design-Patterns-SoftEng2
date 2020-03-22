package singleton;

public class Singleton {

    private String currentUser = "";
    private static Singleton instance = null;

    public Singleton() {
    }

    public static Singleton constructor() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getInstance(){
        return instance;
    }
}
