package packageB;

import mainroot.UIFactory;


public class BFactory extends UIFactory {

    @Override
    public ButtonB createButton(String text) {
        return new ButtonB(text);
    }

    @Override
    public TextFieldB createTextField(String text) {
        return new TextFieldB(text);
    }

    @Override
    public CheckBoxB createCheckBox(String text) {
        return new CheckBoxB(text);
    }


}
