package flyweight;

import java.awt.*;

public class LargeAlien implements IAlien {
    private String shape = "Large Shape"; //Intrinsic state

    @Override
    public String Shape() {
        return shape;
    }

    @Override
    public Color getColor(int madLevel) {
        if (madLevel == 0) {
            return Color.GREEN;
        } else if (madLevel == 1) {
            return Color.RED;
        } else return Color.BLUE;
    }
}
