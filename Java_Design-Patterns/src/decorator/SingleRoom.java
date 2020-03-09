package decorator;

public class SingleRoom implements Room {

    @Override
    public String showRoom() {
        return "Normal Room";
    }
}
