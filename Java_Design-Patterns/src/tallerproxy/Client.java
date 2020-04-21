package tallerproxy;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Client {

    public Client() {
        char opcion = '\u0000';
        boolean created = false;
        do {
            opcion = JOptionPane.showInputDialog("====MENU====\n" +
                    "1. Crear un usuario\n" +
                    "2. Authentificarse\n" +
                    "0. Salir.").charAt(0);
            switch (opcion) {
                case '0':
                    System.exit(0);
                    break;
                case '1':
                    try {
                        createUser();
                        created = true;
                    } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    break;
                case '2':
                    if (!created) {
                        JOptionPane.showMessageDialog(null, "Necesita crear un usuario", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    try {
                        authentificate();
                    } catch (LuisRemoteException e) {
                        e.printStackTrace();
                        System.out.println(e);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case '3':
                    try {
                        String msg = JOptionPane.showInputDialog("mensaje a encriptar");
                        this.mensajeEncriptado(msg);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
            }
        } while (opcion != 0);
    }

    public static void main(String[] args) {
        new Client();
    }

    public void createUser() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        //ProxySystem proxySystem = ProxySystem.getInstance();
        String nombre = "";
        String password = "";
        nombre = JOptionPane.showInputDialog("Nombre del usuario");
        password = JOptionPane.showInputDialog("contraseña: ");
        User user = new User(nombre, password);
        Method metodoRegistroProxy = ProxySystem.class.getDeclaredMethod("registerUser", User.class);
        metodoRegistroProxy.invoke(ProxySystem.getInstance(), user);
        //proxySystem.registerUser(user);
    }

    public void authentificate() throws LuisRemoteException, Exception {
        //ProxySystem proxySystem = ProxySystem.getInstance();
        Method metodoAccederProxy = ProxySystem.class.getDeclaredMethod("accederSistema", User.class);
        String nombre = "";
        String password = "";
        nombre = JOptionPane.showInputDialog("Nombre del usuario");
        password = JOptionPane.showInputDialog("contraseña: ");
        User user = new User(nombre, password);
        //String nonce = proxySystem.accederSistema(user);
        String nonce = metodoAccederProxy.invoke(ProxySystem.getInstance(), user).toString();
        System.out.println("Nonce encriptado: " + nonce + "\n");

        //FacadeSystem facadeSystem = FacadeSystem.getInstance();
        //String resp = facadeSystem.elaborarOperacion(nonce);
        Method elaborarOperacion = FacadeSystem.class.getDeclaredMethod("elaborarOperacion", String.class);
        String resp = elaborarOperacion.invoke(FacadeSystem.getInstance(), nonce).toString();
        JOptionPane.showMessageDialog(null, resp);
    }

    public void mensajeEncriptado(String msg) throws Exception {
        System.out.println(msg);
        SymetricKey symetricKey = new SymetricKey("00000000000000000000000000000000");
        System.out.println(symetricKey.encrypt(msg));
    }

    public void register(String email, String password, String nombre, String direccion, String telefono, String ciudad) {
    }
}
