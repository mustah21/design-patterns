
// getChild
// employee: name, salary, remove, added, organizationStructurePrint
// departments: name, remove, added,


public abstract class Organization {


    public abstract String name();
    public abstract int getSalary();
    public abstract void added(Organization child);
    public abstract void removed(Organization child);

    public abstract Organization getChild(int index);
    public abstract String toXML();

    public void printXML(){
        System.out.println(toXML());
    }

}
