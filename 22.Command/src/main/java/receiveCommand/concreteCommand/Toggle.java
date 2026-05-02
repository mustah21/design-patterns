package receiveCommand.concreteCommand;

import receiveCommand.CommandInterface;
import receiveCommand.TogglePixelCommand;

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
