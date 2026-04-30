package command;

import UI.Pixel;

public class TogglePixelCommand {
    private Pixel pixel;

    public TogglePixelCommand(Pixel pixel) {
        this.pixel = pixel;
    }

    void toggle() {
        System.out.println("Toggle Pixel Command");
        pixel.toggleCurrentPixel();
    }

}