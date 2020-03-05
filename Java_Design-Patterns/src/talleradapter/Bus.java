package TallerAdapter;

public class Bus extends MedioTransporte {

    private double costo;
    private String horario;

    public Bus() {
        super();
        System.out.println("Creando Bus");
    }

    @Override
    public double getCosto() {
        return costo;
    }

    @Override
    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String getHorario() {
        return horario;
    }

    @Override
    public void setHorario(String horario) {
        this.horario = horario;
    }
}
