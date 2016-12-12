package com.av.layout;/**
 * Created by alexey on 12.12.16.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxNarginTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        Label nameLbl = new Label("Name:");
        TextField nameFld = new TextField();
        Button okBtn = new Button("OK");
        Button cancelBtn = new Button("Cancel");
        HBox hbox = new HBox(nameLbl, nameFld, okBtn, cancelBtn);
// Set a margin for all children:
// 10px top, 2px right, 10px bottom, and 2px left
     if (1==2) {
         Insets margin = new Insets(10, 2, 10, 2);
         HBox.setMargin(nameLbl, margin);
         HBox.setMargin(nameFld, margin);
         HBox.setMargin(okBtn, margin);
         HBox.setMargin(cancelBtn, margin);
     }

        Scene scene = new Scene(hbox);
        stage.setScene(scene);
        stage.setTitle("Using Horizontal Grow Priority in an HBox");
        stage.show();
    }
}
