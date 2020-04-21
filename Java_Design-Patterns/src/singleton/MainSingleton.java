package singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.setCurrentUser("Luis");
        System.out.println(singleton);
    }
}
