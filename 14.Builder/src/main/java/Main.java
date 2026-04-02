
public class Main {

    public static void main(String[] args) {

        ComputerBuilder gameBuilder = new GamingComputerBuilder();
        ComputerDirector director = new ComputerDirector(gameBuilder);
        director.makeGamingComputer();
        Computer c = gameBuilder.getComputer();
        System.out.println("Gaming Computer: \n" + c);

        ComputerBuilder officeBuilder = new OfficeComputerBuilder();
        ComputerDirector director2 = new ComputerDirector(officeBuilder);
        director2.makeGamingComputer();
        Computer o = officeBuilder.getComputer();
        System.out.println("Office Computer: \n" + o);


    }

}
