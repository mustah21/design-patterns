package command.endCommand;

import command.CommandInterface;
import command.CursorCommand;

public class MoveCursorLeftCommand implements CommandInterface {

    private CursorCommand cursorCommand;

    public MoveCursorLeftCommand(CursorCommand cursorCommand) {
        this.cursorCommand = cursorCommand;
    }
    public void execute() {
        cursorCommand.left();
    }

}
