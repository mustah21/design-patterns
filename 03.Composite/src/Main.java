

public class Main {
    public static void main(String[] args) {

        // Top-level departments
        Organization finance = new Departments("Finance");
        Organization sales = new Departments("Sales");

        // Sub-departments
        Organization accounting = new Departments("Accounting");
        Organization payroll = new Departments("Payroll");
        Organization salesTeamA = new Departments("Sales Team A");
        Organization salesTeamB = new Departments("Sales Team B");

        // Employees
        Organization em1 = new Employee("Hammad", 2456);
        Organization em2 = new Employee("Momin", 3012);
        Organization em3 = new Employee("Abdullah", 4050);

        Organization em4 = new Employee("Ahmad", 3212);
        Organization em5 = new Employee("Vivek", 2552);
        Organization em6 = new Employee("Aroush", 4512);

        // sub departments added to top level departments
        finance.added(accounting);
        finance.added(payroll);

        sales.added(salesTeamA);
        sales.added(salesTeamB);



        // employees added to departments
        accounting.added(em1);
        accounting.added(em2);
        payroll.added(em3);
        salesTeamA.added(em4);
        salesTeamA.added(em5);
        salesTeamB.added(em6);


        finance.printXML();
        sales.printXML();
        System.out.println("Finance salary: " + finance.getSalary());
        System.out.println("Sales salary: " + sales.getSalary());



        accounting.removed(em2); // momin
        salesTeamA.removed(em5); // vivek

        System.out.println("\n----After removing vivek and momin should not appear in the list anymore and the salary shown should be decreased----\n");

        finance.printXML();
        sales.printXML();


        // returns total salary for each organization
        System.out.println("Salary: " + finance.getSalary());
        System.out.println("Salary: " + sales.getSalary());


    }
}