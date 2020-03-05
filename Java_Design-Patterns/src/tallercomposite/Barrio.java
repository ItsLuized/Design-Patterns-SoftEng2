package tallercomposite;

import java.util.ArrayList;
import java.util.List;

public class Barrio implements Componente {
    private String nombre;
    private String ciudad;
    private List<Componente> lista;

    public Barrio() {
        this.nombre = "";
        this.ciudad = "";
        this.lista = new ArrayList<>();
    }

    public Barrio(String nombre) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.lista = new ArrayList<>();
    }

    public void add(Componente componente) {
        this.lista.add(componente);
    }

    public List<Componente> getLista() {
        return lista;
    }

    public void setLista(List<Componente> lista) {
        this.lista = lista;
    }

    @Override
    public void lugar(String ciudad) {
        this.ciudad = ciudad;
        for (Componente componente: this.lista) {
            componente.lugar(ciudad);
        }
        System.out.println("Ellos viven en el barrio " + this.nombre + " que esta en la ciudad " + this.ciudad + "\n");
    }

}
