package decorator;


public class MainDecorator {

    public static void main(String[] args) {
        Room room = new CurtainDecorator(new ColorDecorator(new SingleRoom())); //El objeto que implementa la interfaz, es el que será el ultimo o más especifico
        System.out.println(room.showRoom());
    }
}
