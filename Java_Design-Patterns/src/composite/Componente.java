package composite;

public interface Componente {
    /**
     * El componente se pintara de alguna forma dependiendo de la clase que la implemente.
     * El color a pintar el componente será el parámetro que recibe el método.
     */

    void pintar(String color);

}