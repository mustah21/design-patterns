import java.util.ArrayList;
import java.util.List;


public class Computer {

    private List<Part> partsList;

    public Computer() {
        this.partsList = new ArrayList<>();
    }

    public void addPart(Part part) {
        this.partsList.add(part);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Part p : partsList) {
            sb.append(i++);
            sb.append(": ");
            sb.append(p.getPart());
            sb.append("\n");
        }
        return sb.toString();
    }
}
