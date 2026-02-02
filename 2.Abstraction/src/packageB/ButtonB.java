package packageB;

import mainroot.MyButton;

public class ButtonB extends MyButton {

    public ButtonB(String text) {
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
