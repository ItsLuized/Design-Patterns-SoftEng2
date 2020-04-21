package tallerproxy;


import java.math.BigInteger;
import java.util.HashMap;

public class FacadeSystem implements ILogin {
    private static FacadeSystem instance = null;
    private HashMap<BigInteger, User> users;
    private SymetricKey symetricKey;

    private FacadeSystem() {
        this.users = new HashMap();
        this.symetricKey = new SymetricKey("00000000000000000000000000000000");
    }

    //Initialization-on-demand
    /*private static class LazyHolder{
        static final FacadeSystem INSTANCE = new FacadeSystem();
    }

    public static FacadeSystem getInstance() {
        return LazyHolder.INSTANCE;
    }*/

    public static FacadeSystem getInstance() {
        if (instance == null) {
            instance = new FacadeSystem();
        }
        return instance;
    }


    public void registrarSesion(BigInteger nonce, User user) {
        this.users.put(nonce, user);
    }

    public String elaborarOperacion(String nonce) throws LuisRemoteException, Exception {
        BigInteger nonceInt = new BigInteger(this.symetricKey.decrypt(nonce));
        if (!this.users.containsKey(nonceInt)) throw new LuisRemoteException("User not authorized");
        return ("Bienvenido " + this.users.get(nonceInt).getUserName());
    }

    @Override
    public String accederSistema(User user) throws LuisRemoteException, Exception {
        return null;
    }
}
