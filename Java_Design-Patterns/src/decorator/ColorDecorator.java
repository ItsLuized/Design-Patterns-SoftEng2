package decorator;

public class ColorDecorator extends RoomDecorator {

    public ColorDecorator(Room specialRoom) {
        super(specialRoom);
    }

    @Override
    public String showRoom() {
        return specialRoom.showRoom() + addColor();
    }

    public String addColor(){
        return " + Blue Color";
    }

}
