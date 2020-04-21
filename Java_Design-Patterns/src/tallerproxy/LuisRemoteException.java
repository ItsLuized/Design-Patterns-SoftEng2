package tallerproxy;

public class LuisRemoteException extends java.rmi.RemoteException {
    String str;

    public LuisRemoteException(String s) {
        this.str = s;
    }

    @Override
    public String toString() {
        return "RemoteException{" +
                "str='" + str + '\'' +
                '}';
    }
}
