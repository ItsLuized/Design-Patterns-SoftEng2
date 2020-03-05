package tallercomposite;

public class compositeMain {

    public static void main(String[] args) {

        Componente p1 = new Persona("Luis", "Av. Chilacos", "1234", "luis@algo.com", "320282");
        Componente p2 = new Persona("Nicole", "127", "Continelli", "nicole@algo.com", "310340");
        Componente p3 = new Persona("Mateo", "Av. Chilacos", "Bravo", "mateo@algo.com", "310340");
        Componente p4 = new Persona("Nicolas", "127", "Fracica", "correonicolas@algo.com", "310340");
        Componente p5 = new Persona("Mariajose", "127", "Rangel", "Majo@algo.com", "310340");
        Componente p6 = new Persona("Javier", "Av. Chilacos", "Francisco", "wolo@algo.com", "310340");


        Barrio b1 = new Barrio("BosaInterna");
        Barrio b2 = new Barrio("Bosa");
        Barrio b3 = new Barrio("Pradilla");

        b1.add(p4);
        b1.add(p2);
        b1.add(p5);

        b2.add(b1);

        b2.lugar("Bogotá");

        b3.add(p1);
        b3.add(p3);
        b3.add(p6);
        b3.lugar("Chia");
    }

}
