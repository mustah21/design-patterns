package command.endCommand;

import command.CommandInterface;
import command.TogglePixelCommand;

public class Toggle implements CommandInterface {

    private TogglePixelCommand togglePixelCommand;

    public Toggle(TogglePixelCommand togglePixelCommand) {
        this.togglePixelCommand = togglePixelCommand;
    }

    @Override
    public void execute() {
        togglePixelCommand.toggle();
    }

}
