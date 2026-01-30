import java.util.ArrayList;
import java.util.List;

public class Departments extends Organization {

    private String name;
    private List<Organization> childerns = new ArrayList<>();

    public Departments(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int getSalary() {
        int total = 0;
        for (Organization child : childerns) {
            total += child.getSalary();
        }
        return total;
    }



    @Override
    public void added(Organization child) {
        childerns.add(child);
    }

    @Override
    public void removed(Organization child) {
        childerns.remove(child);
    }

    @Override
    public Organization getChild(int index) {
        return this.childerns.get(index);
    }

    @Override
    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<Department name = \"").append(name()).append("\">\n");
        for (Organization child : childerns) {
            sb.append(child.toXML()).append("\n");
        }
        sb.append("</Departments>\n");
        return sb.toString();
    }



}
