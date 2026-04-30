package command.endCommand;

import command.CommandInterface;
import command.CursorCommand;

public class MoveCursorDownCommand implements CommandInterface {

    private CursorCommand cursorCommand;

    public MoveCursorDownCommand(CursorCommand cursorCommand) {
        this.cursorCommand = cursorCommand;
    }

    @Override
    public void execute() {
        cursorCommand.down();
    }

}
