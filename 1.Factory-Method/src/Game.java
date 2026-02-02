
public class Game {
    public static void main(String[] args) {

        Map mapping = createMap();
        mapping.display();
    }
        public static Map createMap() {
        int random = (int) (Math.random() * 10) + 1;
            if (random < 5) {
                return new CityMap();
            }
            return new WildernessMap();
        }

}
