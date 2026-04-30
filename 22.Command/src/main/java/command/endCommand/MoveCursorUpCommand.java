package command.endCommand;

import command.CommandInterface;
import command.CursorCommand;

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
