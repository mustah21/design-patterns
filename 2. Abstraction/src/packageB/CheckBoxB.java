package packageB;

import mainroot.CheckBox;

public class CheckBoxB extends CheckBox {

    public CheckBoxB(String text) {
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
