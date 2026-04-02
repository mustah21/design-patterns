
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.input.KeyCode;

import java.util.List;

public class Gui extends Application {

    private Controller controller;
    private ColorBox colorBox1;
    private ColorBox colorBox2;
    private ColorBox colorBox3;
    private CheckBox checkBox;
    private ListView<String> historyUIList;


    public void start(Stage primaryStage) {

        historyUIList = new ListView<>();
        controller = new Controller(this);
        Insets insets = new Insets(10, 10, 10, 10);

        Button historyButton = new Button("History");
        Stage historyStage = new Stage();
        historyStage.setTitle("History");


        VBox historyBox = new VBox();
        historyBox.setPadding(new Insets(10, 10, 10, 10));
        historyBox.setSpacing(10);

        // Create three ColorBoxes
        colorBox1 = new ColorBox(1, controller);
        colorBox2 = new ColorBox(2, controller);
        colorBox3 = new ColorBox(3, controller);

        // Create a CheckBox
        checkBox = new CheckBox("Click me!");
        checkBox.setPadding(insets);

        // Add the ColorBoxes and CheckBox to a HBox
        HBox hBox = new HBox(colorBox1.getRectangle(), colorBox2.getRectangle(), colorBox3.getRectangle());
        hBox.setSpacing(10);

        hBox.setMargin(colorBox1.getRectangle(), insets);
        hBox.setMargin(colorBox2.getRectangle(), insets);
        hBox.setMargin(colorBox3.getRectangle(), insets);

        Label label = new Label("Press Ctrl-Z to undo | Ctrl-Y to redo");
        label.setPadding(insets);


        // create a VBox that contains the HBox and the CheckBox
        VBox vBox = new VBox(hBox, checkBox, label, historyButton);
        // call controller when the CheckBox is clicked
        checkBox.setOnAction(event -> {
            controller.setIsSelected(checkBox.isSelected());
        });

        Scene scene = new Scene(vBox);
        scene.setOnKeyPressed(event -> {
            if (event.isControlDown() && event.getCode() == KeyCode.Z) {
                System.out.println("Undo key combination pressed");
                controller.undo();
            } else if (event.isControlDown() && event.getCode() == KeyCode.Y) {
                System.out.println("Redo key combination pressed");
                controller.redo();
            }
        });

        Scene historyScene = new Scene(historyBox, 300, 400);
        historyStage.setScene(historyScene);

        historyUIList.setOnMouseClicked(event -> {
            int selectedIndex = historyUIList.getSelectionModel().getSelectedIndex();
            if (selectedIndex >= 0) {
                controller.jumpToHistory(selectedIndex);
                updateGui();
            }
        });

        historyButton.setOnAction(event -> {
            historyBox.getChildren().clear();

            historyUIList.getItems().clear();
            List<IMemento> history = controller.getHistory();
            for (int i = 0; i < history.size(); i++) {
                historyUIList.getItems().add("State: " + (i + 1));
            }

            historyBox.getChildren().add(historyUIList);

            historyStage.show();
            historyStage.toFront();
        });;

        primaryStage.setScene(scene);
        primaryStage.setTitle("Memento Pattern Example");
        primaryStage.show();

    }

    public void updateGui() {
        // called after restoring state from a Memento
        colorBox1.setColor(controller.getOption(1));
        colorBox2.setColor(controller.getOption(2));
        colorBox3.setColor(controller.getOption(3));
        checkBox.setSelected(controller.getIsSelected());
    }

}
