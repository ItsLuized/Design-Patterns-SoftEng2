package adapter;

public class Adapter {

    public static void main(String[] args) {
        Motor motor = new MotorGastalon();
        motor.encender();
        motor.acelerar();
        motor.apagar();

        motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();

        motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
