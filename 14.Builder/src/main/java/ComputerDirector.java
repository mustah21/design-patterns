public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void makeGamingComputer() {
        computerBuilder.buildCPU();
        computerBuilder.buildRAM();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildHardDrive();
        computerBuilder.buildProcessor();
    }

    public void makingOfficeComputer() {
        computerBuilder.buildCPU();
        computerBuilder.buildRAM();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildHardDrive();
        computerBuilder.buildProcessor();
    }
}
