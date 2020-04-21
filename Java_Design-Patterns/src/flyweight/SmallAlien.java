package flyweight;

import java.awt.*;

public class SmallAlien implements IAlien {

    private String shape = "Small Shape";

    @Override
    public String Shape() {
        return shape;
    }

    @Override
    public Color getColor(int madLevel) {
        if (madLevel == 0) {
            return Color.RED;
        } else if (madLevel == 1) {
            return Color.BLUE;
        } else return Color.GREEN;
    }
}
