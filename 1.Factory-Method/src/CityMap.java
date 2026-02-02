
import java.lang.Math;

public class CityMap extends Map {

    @Override
    public Tile createTile() {
        int random = (int) (Math.random() * 3) + 1;
        if (random == 1) {
            return new BuildingTile();
        } else if (random == 2) {
            return new Road();
        } else if (random == 3) {
            return new Forest();
        }
        return null;
    }


}
