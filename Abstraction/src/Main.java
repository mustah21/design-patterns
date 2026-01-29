import mainroot.CheckBox;
import mainroot.MyButton;
import mainroot.TextField;
import mainroot.UIFactory;
import packageA.AFactory;
import packageB.BFactory;

public class Main {

    public static void main(String[] args) {
        UIFactory aFactory = new AFactory();
        MyButton aButton = aFactory.createButton("Click me");
        TextField aTextField = aFactory.createTextField("No typing");
        CheckBox aCheckBox = aFactory.createCheckBox("Checks");

        // Initial display
        aButton.display();
        aTextField.display();
        aCheckBox.display();

        // after dynamic changes
        System.out.println("Dynamic changing\n");
        aButton.setText("Dont click me");
        aButton.display();
        aTextField.setText("Dynamically change");
        aTextField.display();
        aCheckBox.setText("no more checks");
        aCheckBox.display();


        System.out.println("\n--ANOTHER BUTTON STYLE BELOW--\n ");


        UIFactory bFactory = new BFactory();
        MyButton bButton = bFactory.createButton("Click me");
        TextField bTextField = bFactory.createTextField("No typing");
        CheckBox bCheckBox = bFactory.createCheckBox("Checks");

        // Initial display
        bButton.display();
        bTextField.display();
        bCheckBox.display();

        // after dynamic changes
        System.out.println("Dynamic changing\n");
        bButton.setText("Dont click me");
        bButton.display();
        bTextField.setText("Dynamically change");
        bTextField.display();
        bCheckBox.setText("no more checks");
        bCheckBox.display();

    }

}