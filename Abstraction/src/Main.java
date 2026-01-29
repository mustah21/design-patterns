import mainroot.UIFactory;
import packageA.AFactory;
import packageB.BFactory;

public class Main {

    public static void main(String[] args) {
        UIFactory uiFactory = new AFactory();
        uiFactory.createButton("Click me").display();
        uiFactory.createTextField("No typing").display();
        uiFactory.createCheckBox("Checks").display();

        System.out.println("\n-----\n ");

        UIFactory uiFactoryB = new BFactory();
        uiFactoryB.createButton("Click me").display();
        uiFactoryB.createTextField("No typing").display();
        uiFactoryB.createCheckBox("Checks").display();
    }

}