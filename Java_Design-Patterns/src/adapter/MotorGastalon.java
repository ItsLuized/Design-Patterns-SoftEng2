package adapter;

public class MotorGastalon extends Motor {

    public MotorGastalon() {
        super();
        System.out.println("Creando el motor gastalon");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor gaston");
    }

    @Override
    public void acelerar() {
        System.out.println("Buuuuuuuuuuuuuum, acelerando y gastando muuuucho gas");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor gaston");
    }
}
