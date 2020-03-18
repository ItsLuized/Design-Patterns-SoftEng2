package tallerdecorator;

abstract class BusInfo implements Bus {

    protected Bus busInfo;

    public BusInfo(Bus busInfo) {
        this.busInfo = busInfo;
    }


    @Override
    public String getTodo() {
        return busInfo.getTodo();
    }

    public String getTodo(String string){
        return busInfo.getTodo();
    }

    @Override
    public void setTodo(String placa, int capacidad, String marca) {
        busInfo.setTodo(placa, capacidad, marca);
    }
}
