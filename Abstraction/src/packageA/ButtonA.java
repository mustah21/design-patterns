package packageA;

import mainroot.MyButton;

public class ButtonA extends MyButton {

    public ButtonA(String text) {
        super(text);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        System.out.println("┌─────────────────────┐");
        System.out.println("│  " + text + "  │");
        System.out.println("└─────────────────────┘");
    }
}
