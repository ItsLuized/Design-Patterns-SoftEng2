package singleton;

public class Singleton {

    private String currentUser = "";
    private static Singleton instance = null;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void setCurrentUser(String usuario){
        this.currentUser = usuario;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "currentUser='" + currentUser + '\'' +
                '}';
    }
}
