package UI;

import receiveCommand.*;
import receiveCommand.concreteCommand.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Gui extends Application {

    private Pixel p = new Pixel();
    private Button rawBtn;
    private CursorCommand c = new CursorCommand(p);
    private TogglePixelCommand tc = new TogglePixelCommand(p);
    private TextArea statusArea = new TextArea();
    private CodeGenerator gc = new CodeGenerator(p, statusArea);


    public void start(Stage primaryStage) throws Exception {

        gc = new CodeGenerator(p, statusArea);
        HBox v = new HBox(p.makePixels());
        HBox buttonContainer = new HBox();
        rawBtn = new Button("Raw Data");
        buttonContainer.getChildren().add(rawBtn);
        VBox mainLayout = new VBox(v, buttonContainer, statusArea);

        rawBtn.setOnAction(e -> gc.getCode());
        rawBtn.setFocusTraversable(false);

        statusArea.setPromptText("Click 'Raw Data' to generate code...");
        statusArea.setPrefHeight(200);
        statusArea.setEditable(false);

        Scene scene = getScene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("UI.Pixel art editor");
        primaryStage.show();
        mainLayout.requestFocus();

    }

    private Scene getScene(VBox mainLayout) {
        Scene scene = new Scene(mainLayout, 420, 650);

        scene.setOnKeyPressed(event -> {
            CommandInterface cmd = switch (event.getCode()) {
                case UP -> new MoveCursorUpCommand(c);
                case DOWN -> new MoveCursorDownCommand(c);
                case LEFT -> new MoveCursorLeftCommand(c);
                case RIGHT -> new MoveCursorRightCommand(c);
                case SPACE -> new Toggle(tc);
                default -> null;
            };

            if (cmd != null) {
                cmd.execute();
            }
        });
        return scene;
    }
}

