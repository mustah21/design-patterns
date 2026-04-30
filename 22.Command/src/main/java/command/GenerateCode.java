package command;

public class GenerateCode implements CommandInterface {

    private GenerateCodeCommand generateCodeCommand;

    public GenerateCode(GenerateCodeCommand generateCodeCommand) {
        this.generateCodeCommand = generateCodeCommand;
    }

    @Override
    public void execute() {
        generateCodeCommand.getCode();
        System.out.println("Code Generated Successfully");
    }

}
