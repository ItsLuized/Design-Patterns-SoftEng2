package adapter;

public class MotorElectricoAdapter extends Motor {

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter(){
        super();
        this.motorElectrico = new MotorElectrico();
    }

    public void encender(){
        this.motorElectrico.conectar();
        this.motorElectrico.activar();
    }

    public void acelerar(){
        this.motorElectrico.moverMasRapido();
    }

    public void apagar(){
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }

}
