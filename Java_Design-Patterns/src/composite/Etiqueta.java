package composite;

public class Etiqueta implements Componente {

    /**
     * Vamos a usar el atributo nombre para identificar el componente
     * con el cual estamos trabajando
     */
    private String nombre;

    public Etiqueta() {
        this.nombre = "";
    }

    public Etiqueta(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Implementamos el método pintar de la interface Componente.
     * El método nos indica simplemente que este componente se pinto con el
     * color que se nos indicó.
     * El mensaje es para asegurar esta acción.
     *
     * @param color El componente se pinta de este color
     */
    @Override
    public void pintar(String color) {
        System.out.println("Se pinto a " + nombre + " de color " + color);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
