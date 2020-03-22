package tallerdecorator;

import javax.swing.*;

public class TallerDecorator {

    public static void main(String[] args) {

        String conductor = JOptionPane.showInputDialog("Quien es el conductor del bus?");
        String ruta = JOptionPane.showInputDialog("Cual es la ruta del bus?");
        String placa = JOptionPane.showInputDialog("Cual es la placa del bus?");
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Cual es la capacidad del bus?"));
        String marca = JOptionPane.showInputDialog("Cual es la marca del bus?");
        //String parametros = conductor + "," + ruta + "," + placa + "," + capacidad + "," + marca;

        Bus bus = new BusConductor( new BusRuta(new UnBus(placa,  capacidad, marca), ruta), conductor);
        System.out.println(bus.getTodo());
    }
}
