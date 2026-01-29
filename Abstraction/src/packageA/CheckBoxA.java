package packageA;

import mainroot.CheckBox;

public class CheckBoxA extends CheckBox {

    public CheckBoxA(String text) {
        super(text);
    }

    @Override
    public void display() {
        System.out.println("┌─────────────────────┐");
        System.out.println("│  " + text + "  │");
        System.out.println("└─────────────────────┘");
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }

}
