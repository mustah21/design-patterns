package command;

import UI.Pixel;
import javafx.scene.control.TextArea;

public class GenerateCodeCommand {

    private Pixel pixel;
    private TextArea output;

    public GenerateCodeCommand(Pixel pixel, TextArea output) {
        this.pixel = pixel;
        this.output = output;
    }

    public void getCode() {
       String data = pixel.printRawData();
       output.setText(data);
    }

}
