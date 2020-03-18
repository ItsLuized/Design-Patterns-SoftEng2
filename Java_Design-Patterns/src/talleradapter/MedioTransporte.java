package talleradapter;

public abstract class MedioTransporte {

    protected double costo;
    protected String horario;

    abstract public double getCosto();

    abstract public void setCosto(double costo);

    abstract public String getHorario();

    abstract public void setHorario(String horario);
}
