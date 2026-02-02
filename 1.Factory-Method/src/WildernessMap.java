
public class WildernessMap extends Map {
    @Override
    public Tile createTile() {
        int random = (int) ((Math.random() * 3) + 1);

        if (random == 1) {
            return new Swamp();
        } else if (random == 2) {
            return new Water();
        } else if (random == 3) {
            return new Forest();
        }
        return null;
    }

}
