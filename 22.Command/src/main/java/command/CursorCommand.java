package command;
import UI.Pixel;

public class CursorCommand {

    private Pixel pixels;

    public CursorCommand(Pixel pixels) {
        this.pixels = pixels;
    }

    public void up() {
        System.out.println("cursor up");
        pixels.moveCursor(0, -1);
    }
    public void down() {
        System.out.println("cursor down");
        pixels.moveCursor(0, 1);
    }
    public void left() {
        System.out.println("cursor left");
        pixels.moveCursor(-1, 0);
    }
    public void right() {
        System.out.println("cursor right");
        pixels.moveCursor(1, 0);
    }

}
