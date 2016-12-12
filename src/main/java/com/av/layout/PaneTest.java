package com.av.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

/**
 * Created by alexey on 12.12.16.
 */
public class PaneTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button okBtn = new Button("OK");
        Button cancelBtn = new Button("Cancel");
        okBtn.relocate(10, 10);
        cancelBtn.relocate(60, 10);
        Pane root = new Pane();
        root.setPrefSize(300, 200);
        root.getChildren().addAll(okBtn,cancelBtn);
                root.setStyle("-fx-border-style: solid inside;"+
                        "-fx-border-width: 3;" +
                        "-fx-border-color: red;");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Using Panes");
        root.setPrefSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);
        stage.show();
    }
}
