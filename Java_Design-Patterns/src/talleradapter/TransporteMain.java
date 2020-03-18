package talleradapter;

import javax.swing.*;

public class TransporteMain {

    public static void main(String[] args) {

        double costo = 0;
        String horario = "";

        MedioTransporte mt = new Tren();
        costo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el costo del Tren?"));
        mt.setCosto(costo);
        horario = JOptionPane.showInputDialog("¿Cuál es el horario por el que pasa el tren?");
        mt.setHorario(horario);
        JOptionPane.showMessageDialog(null, "Horario: " + mt.getHorario() + "\n" +
                "Costo:   " + mt.getCosto(), "Información Tren", JOptionPane.INFORMATION_MESSAGE);



        mt = new Bus();
        costo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el costo del Bus?"));
        mt.setCosto(costo);
        horario = JOptionPane.showInputDialog("¿Cuál es el horario por el que pasa el Bus?");
        mt.setHorario(horario);
        JOptionPane.showMessageDialog(null, "Horario: " + mt.getHorario() + "\n" +
                "Costo:   " + mt.getCosto(), "Información Bus", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Horario: " + mt.getHorario() + "\n" +
                "Costo:   " + mt.getCosto());

        mt = new WheelsAdapter();
        costo = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál es el costo del Wheels?"));
        mt.setCosto(costo);
        horario = JOptionPane.showInputDialog("¿Cuál es el horario por el que pasa el Wheels?");
        mt.setHorario(horario);
        JOptionPane.showMessageDialog(null, "Horario: " + mt.getHorario() + "\n" +
                "Costo:   " + mt.getCosto(), "Información Wheels", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Horario: " + mt.getHorario() + "\n" +
                "Costo:   " + mt.getCosto());

    }

}
