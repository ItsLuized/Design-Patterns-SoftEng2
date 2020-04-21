package tallerproxy;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class ProxySystem implements ILogin {
    private static ProxySystem instance = null;
    private Map<String, User> users;
    private FacadeSystem facadeSystem;
    private SymetricKey symetricKey;


    private ProxySystem() {
        this.users = new HashMap();
        this.facadeSystem = FacadeSystem.getInstance();
        this.symetricKey = new SymetricKey("00000000000000000000000000000000");
    }

    //Initialization-on-demand
    /*private static class LazyHolder{
        static final ProxySystem INSTANCE = new ProxySystem();
    }

    public static ProxySystem getInstance() {
        return LazyHolder.INSTANCE;
    }*/

    public static ProxySystem getInstance() {
        if (instance == null) {
            instance = new ProxySystem();
        }
        return instance;
    }

    public void registerUser(User user) {
        if (!this.users.containsKey(user.getUserName()))
            this.users.put(user.getUserName(), user);
    }

    public String accederSistema(User user) throws LuisRemoteException, Exception {
        if (!this.users.containsKey(user.getUserName())) throw new LuisRemoteException("User not registered");
        User userDB = this.users.get(user.getUserName());

        if (!userDB.getPassword().equals(user.getPassword())) throw new LuisRemoteException("Invalid credentials");

        BigInteger nonceInt = BigInteger.probablePrime(256, new SecureRandom());
        this.facadeSystem.registrarSesion(nonceInt, user);
        System.out.println("Nonce no encriptado: " + nonceInt);
        String nonce = symetricKey.encrypt(nonceInt.toString());
        return nonce;
    }
}
