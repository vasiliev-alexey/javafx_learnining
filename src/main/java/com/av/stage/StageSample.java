package com.av.stage; /**
 * Created by alexey on 07.12.16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import static javafx.stage.StageStyle.*;

public class StageSample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label styleLabel = new Label("Stage Style");
// A button to close the stage
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> primaryStage.close());
        VBox root = new VBox();
        root.getChildren().addAll(styleLabel, closeButton);
        Scene scene = new Scene(root, 100, 70);
        primaryStage.setScene(scene);
// The title of the stage is not visible for all styles.
        primaryStage.setTitle("The Style of a Stage");
/* Uncomment one of the following statements at a time */
//        this.show(primaryStage, styleLabel, DECORATED);
//this.show(primaryStage, styleLabel, UNDECORATED);
//this.show(primaryStage, styleLabel, TRANSPARENT);
//this.show(primaryStage, styleLabel, UNIFIED);

       // primaryStage.initModality(Modality.WINDOW_MODAL);

this.show(primaryStage, styleLabel, UTILITY);
    }

    private void show(Stage stage, Label styleLabel, StageStyle style) {

        // Set the text for the label to match the style
        styleLabel.setText(style.toString());
// Set the style
        stage.initStyle(style);
// For a transparent style, set the scene fill to null. Otherwise, the
// content area will have the default white background of the scene.
        if (style == TRANSPARENT) {
            stage.getScene().setFill(null);
            stage.getScene().getRoot().setStyle(
                    "-fx-background-color: transparent");
        } else if(style == UNIFIED) {
            stage.getScene().setFill(Color.TRANSPARENT);
        }
// Show the stage
        stage.show();

    }
}
