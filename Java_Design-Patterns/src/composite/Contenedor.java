package composite;

import java.util.ArrayList;
import java.util.List;

public class Contenedor implements Componente {

    private String nombre;
    private List<Componente> contenedor;

    public Contenedor() {
        this.nombre = "";
        this.contenedor = new ArrayList<>();
    }

    public Contenedor(String nombre) {
        this.nombre = nombre;
        this.contenedor = new ArrayList<>();
    }

    @Override
    public void pintar(String color) {
        for (Componente componente : this.contenedor) {
            componente.pintar(color);
        }
        System.out.println("Se pinto a " + nombre + " de color " + color);
    }

    public List<Componente> getContenedor() {
        return contenedor;
    }

    public void setContenedor(List<Componente> contenedor) {
        this.contenedor = contenedor;
    }

    public void add(Componente componente) {
        this.contenedor.add(componente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
