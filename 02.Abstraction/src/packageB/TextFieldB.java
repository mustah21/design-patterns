package packageB;

import mainroot.TextField;

public class TextFieldB extends TextField {

    public TextFieldB(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("~─────────────────────~");
        System.out.println("~  " + text + "  ~");
        System.out.println("~─────────────────────~");
    }
    @Override
    public void setText(String text) {
        this.text = text;
    }
}
