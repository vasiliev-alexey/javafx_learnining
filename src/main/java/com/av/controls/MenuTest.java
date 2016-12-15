package com.av.controls;/**
 * Created by vasiliev-alexey on 14.12.16.
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
// Create some menus
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu optionsMenu = new Menu("Options");
        Menu helpMenu = new Menu("Help");

        MenuItem exitItem = new MenuItem("Exit");
        optionsMenu.getItems().addAll(exitItem);
        exitItem.setOnAction(e -> Platform.exit());

        KeyCombination kr = new KeyCodeCombination(KeyCode.R, KeyCombination.ALT_DOWN);
        exitItem.setAccelerator(kr);

        // Create three RadioMenuItems
        RadioMenuItem rectItem = new RadioMenuItem("Rectangle");
        RadioMenuItem circleItem = new RadioMenuItem("Circle");
        RadioMenuItem ellipseItem = new RadioMenuItem("Ellipse");
// Select the Rantangle option by default
        rectItem.setSelected(true);
// Add them to a ToggleGroup to make them mutually exclusive
        ToggleGroup shapeGroup = new ToggleGroup();
        shapeGroup.getToggles().addAll(rectItem, circleItem, ellipseItem);
        fileMenu.getItems().addAll(rectItem, circleItem, ellipseItem);

// Add menus to a menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, editMenu, optionsMenu, helpMenu);
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Using Menus");
        stage.show();
    }
}
