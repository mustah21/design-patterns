public class GamingComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.addPart(new Part("Nvidia GPU 7090"));
    }

    @Override
    public void buildRAM() {
    computer.addPart(new Part("32 GBS DDR5"));
    }

    @Override
    public void buildHardDrive() {
      computer.addPart(new Part("512 NVME"));
    }

    @Override
    public void buildGraphicsCard() {
        computer.addPart(new Part("NVIDIA (GeForce RTX/GTX)"));
    }

    @Override
    public void buildCPU() {
        computer.addPart(new Part("Ryzen 7"));
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}
