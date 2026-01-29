

public abstract class Map {

    public abstract Tile createTile();

    public void display() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                Tile tile = createTile();
                System.out.print(tile.getCharacter() + " ") ;
            }
            System.out.println();
        }
    }



}