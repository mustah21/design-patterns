package receiveCommand.concreteCommand;

import receiveCommand.CommandInterface;
import receiveCommand.CursorCommand;

public class MoveCursorLeftCommand implements CommandInterface {

    private CursorCommand cursorCommand;

    public MoveCursorLeftCommand(CursorCommand cursorCommand) {
        this.cursorCommand = cursorCommand;
    }
    public void execute() {
        cursorCommand.left();
    }

}
