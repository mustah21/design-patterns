public class OfficeComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public OfficeComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addPart(new Part("Integrated Graphics"));
    }

    @Override
    public void buildRAM() {
        computer.addPart(new Part("8 GB DDR4"));
    }

    @Override
    public void buildHardDrive() {
        computer.addPart(new Part("256 GB SSD"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addPart(new Part("Built-in GPU"));
    }

    @Override
    public void buildCPU() {
        computer.addPart(new Part("Intel i5"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }


}