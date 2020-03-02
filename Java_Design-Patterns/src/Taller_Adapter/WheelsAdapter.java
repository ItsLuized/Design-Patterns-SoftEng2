package Taller_Adapter;

public class WheelsAdapter extends MedioTransporte{

    private Wheels wheels;

    public WheelsAdapter() {
        super();
        this.wheels = new Wheels();
        System.out.println("Adaptando Wheels");
    }

    public double getCosto() {
        return wheels.getPrecio();
    }

    public void setCosto(double costo) {
        wheels.setPrecio(costo);
    }

    public String getHorario() {
        return wheels.getHoras();
    }

    public void setHorario(String horario) {
        wheels.setHoras(horario);
    }
}
