package tallerproxy;


public interface ILogin {

    String accederSistema(User user) throws LuisRemoteException, Exception;
}
