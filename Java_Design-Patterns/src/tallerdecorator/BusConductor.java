package tallerdecorator;

public class BusConductor extends BusInfo {

    private String conductor;
    private String[] parametros;

    public BusConductor(Bus busInfo, String conductor) {
        super(busInfo);
        this.conductor = conductor;
    }

    /*
    public BusConductor(Bus busInfo, String parametros) {

        super(busInfo);
        this.parametros = parametros.split(",");
        this.conductor = this.parametros[0];
    }
    */

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
