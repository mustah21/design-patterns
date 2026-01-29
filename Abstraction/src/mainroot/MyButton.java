package mainroot;

public abstract class MyButton {

    protected String text;

    public MyButton(String text) {
        this.text = text;
    }

    public abstract void display();

}
