package flyweight;

import java.awt.*;

public interface IAlien {
    String Shape(); //Intrinsic state
    Color getColor(int madLevel); //Extrinsic state
}
