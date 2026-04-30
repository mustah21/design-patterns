package command.endCommand;

import command.CommandInterface;
import command.GenerateCodeCommand;

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
