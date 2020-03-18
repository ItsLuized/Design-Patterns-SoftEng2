package tallerdecorator;

public class BusConductor extends BusInfo {

    private String conductor;

    public BusConductor(Bus busInfo, String conductor) {
        super(busInfo);
        this.conductor = conductor;
    }

    @Override
    public String getTodo() {
        return busInfo.getTodo() + addConductor(this.conductor);
    }

    @Override
    public void setTodo(String placa, int capacidad, String marca) {
        busInfo.setTodo(placa, capacidad, marca);
    }

    public String addConductor(String conductor){
        return ", Conductor: " + conductor;
    }
}
