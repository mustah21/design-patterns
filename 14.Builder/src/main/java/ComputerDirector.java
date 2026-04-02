public class ComputerDirector {

    private ComputerBuilder computerBuilder;

    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void makeComputer() {
        computerBuilder.buildCPU();
        computerBuilder.buildRAM();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildHardDrive();
        computerBuilder.buildProcessor();
    }


}
