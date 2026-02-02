
public class Employee extends Organization {

    private int salary;
    private String employeeName;

    public Employee(String employeeName, int salary) {
        this.salary = salary;
        this.employeeName = employeeName;
    }

    @Override
    public String name() {
        return employeeName;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public String toXML() {
        return " <Name> " + employeeName + " </Name>\n" +
                "   <Salary> " + salary + " </Salary>";
    }



    @Override
    public void added(Organization child) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removed(Organization child) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Organization getChild(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
