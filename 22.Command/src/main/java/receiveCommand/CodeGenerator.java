package receiveCommand;

import UI.Pixel;
import javafx.scene.control.TextArea;

public class CodeGenerator {

    private Pixel pixel;
    private TextArea output;

    public CodeGenerator(Pixel pixel, TextArea output) {
        this.pixel = pixel;
        this.output = output;
    }

    public void getCode() {
       String data = pixel.printRawData();
       output.setText(data);
    }

}
