package receiveCommand.concreteCommand;

import receiveCommand.CommandInterface;
import receiveCommand.CursorCommand;

public class MoveCursorUpCommand implements CommandInterface {

    private CursorCommand cursorCommand;

    public MoveCursorUpCommand(CursorCommand cursorCommand) {
        this.cursorCommand = cursorCommand;
    }

    @Override
    public void execute() {
        cursorCommand.up();
    }

}
