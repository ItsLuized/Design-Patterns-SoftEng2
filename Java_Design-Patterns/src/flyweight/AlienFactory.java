package flyweight;

import java.util.HashMap;

public class AlienFactory {
    private HashMap list;

    public AlienFactory() {
        this.list = new HashMap();
    }

    public void saveAlien(int index, IAlien alien){
        this.list.put(index, alien);
    }

    public IAlien getAlien(int index){
        return (IAlien) this.list.get(index);
    }
}
