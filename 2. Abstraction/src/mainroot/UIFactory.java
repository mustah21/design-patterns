package mainroot;


public abstract class UIFactory {

    protected String text;

    public abstract MyButton createButton(String text);
    public abstract TextField createTextField(String text);
    public abstract CheckBox createCheckBox(String text);

}
