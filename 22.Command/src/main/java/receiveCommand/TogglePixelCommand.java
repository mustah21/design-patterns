package receiveCommand;

import UI.Pixel;

public class TogglePixelCommand {
    private Pixel pixel;

    public TogglePixelCommand(Pixel pixel) {
        this.pixel = pixel;
    }

    public void toggle() {
        System.out.println("Toggle Pixel Command");
        pixel.toggleCurrentPixel();
    }

}