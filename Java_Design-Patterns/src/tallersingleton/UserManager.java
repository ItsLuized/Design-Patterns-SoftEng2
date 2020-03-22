package tallersingleton;

import singleton.Singleton;

import java.util.ArrayList;
import java.util.HashMap;

public class UserManager {

    private HashMap<String, User> usuarios;
    private static UserManager instance;

    private UserManager() {
        this.usuarios = new HashMap<>();
    }

    public static UserManager constructor() {
        if (instance == null){
            instance = new UserManager();
        }
        return instance;
    }

    public void add(User usuario) {
        this.usuarios.put(usuario.getId(), usuario);
    }

    public User buscarUsuario(String id){
        return this.usuarios.get(id);
    }

    public void borrarUsuario(String id){
        this.usuarios.remove(id);
    }

    public void actualizarUsuario(String idAntiguo, User nuevoUsuario){
        this.usuarios.remove(idAntiguo);
        this.usuarios.put(nuevoUsuario.getId(), nuevoUsuario);
    }

    public ArrayList<User> getTodos(){
         return new ArrayList<>(this.usuarios.values());
    }
}
