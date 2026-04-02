
public interface ComputerBuilder {

    void buildProcessor();
    void buildRAM();
    void buildHardDrive();
    void buildGraphicsCard();
    void buildCPU();
    Computer getComputer();
}
