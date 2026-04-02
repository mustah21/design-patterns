
public class Main {

    public static void main(String[] args) {

//        ----Gaming Computer----
        ComputerBuilder gameBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gameBuilder);
        director.makeComputer();
        Computer c = gameBuilder.getComputer();
        System.out.println("Gaming Computer: \n" + c);

//        ----Office Computer----
        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(officeBuilder);
        director2.makeComputer();
        Computer o = officeBuilder.getComputer();
        System.out.println("Office Computer: \n" + o);


    }

}
