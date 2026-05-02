package receiveCommand.concreteCommand;

import receiveCommand.CommandInterface;
import receiveCommand.CursorCommand;

public class MoveCursorRightCommand implements CommandInterface {

    private CursorCommand cursorCommand;

    public MoveCursorRightCommand(CursorCommand cursorCommand) {
        this.cursorCommand = cursorCommand;
    }

    @Override
    public void execute() {
        cursorCommand.right();
    }

}
