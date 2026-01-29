package packageA;

import mainroot.UIFactory;

public class AFactory extends UIFactory {

    @Override
    public ButtonA createButton(String text) {
        return new ButtonA(text);
    }

    @Override
    public TextFieldA createTextField(String text) {
        return new TextFieldA(text);
    }

    @Override
    public CheckBoxA createCheckBox(String text) {
        return new CheckBoxA(text);
    }

}



