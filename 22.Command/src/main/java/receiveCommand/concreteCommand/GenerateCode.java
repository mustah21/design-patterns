package receiveCommand.concreteCommand;

import receiveCommand.CommandInterface;
import receiveCommand.CodeGenerator;

public class GenerateCode implements CommandInterface {

    private CodeGenerator codeGenerator;

    public GenerateCode(CodeGenerator codeGenerator) {
        this.codeGenerator = codeGenerator;
    }

    @Override
    public void execute() {
        codeGenerator.getCode();
        System.out.println("Code Generated Successfully");
    }

}
