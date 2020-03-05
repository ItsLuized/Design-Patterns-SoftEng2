package composite;

public class TestComponents {

    public static void main(String[] args) {

        Componente c1 = new Etiqueta("et 1");
        Componente c2 = new Etiqueta("et 2");
        Componente c3 = new Etiqueta("et 3");
        Componente c4 = new Etiqueta("et 4");
        Componente c5 = new Etiqueta("et 5");
        Componente c6 = new Etiqueta("et 6");

        Contenedor a = new Contenedor("Panel 1");
        Contenedor b = new Contenedor("Panel 2");
        Contenedor c = new Contenedor("Panel 3");

        a.add(c1);
        a.add(c2);
        a.add(c3);

        b.add(a);

        b.pintar("Anaranjado");

        c.add(c4);
        c.add(c5);
        c.add(c6);
        c.pintar("Verde");

    }
}
