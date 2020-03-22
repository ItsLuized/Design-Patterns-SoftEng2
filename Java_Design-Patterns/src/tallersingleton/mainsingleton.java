package tallersingleton;

public class mainsingleton {

    public static void main(String[] args) {
        UserManager um = UserManager.constructor();

        um.add(new User("Luis", "luis@algo.com", "contrasena", "chia", "320", "168850"));
        um.add(new User("Nicole", "nicole@algo.com", "contrasena", "Bogota", "320", "172820"));

        um.buscarUsuario("168850");

        um.actualizarUsuario("168850", new User("Luis", "luisnuevo@algo.com", "contrasena", "chia", "320", "168850"));

        String imprimir = "";
        for (User usuario : um.getTodos()) {
            imprimir += usuario +", ";
        }

        System.out.println(imprimir);

        um.borrarUsuario("1688850");

        imprimir = "";
        for (User usuario : um.getTodos()) {
            imprimir += usuario +", ";
        }

        System.out.println(imprimir);
    }
}
