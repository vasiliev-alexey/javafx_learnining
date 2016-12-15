package com.av.treeview;
/**
 * Created by vasiliev-alexey on 15.12.16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TreeViewTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        TreeView<String> treeView = TreeViewUtil.getTreeView();
        HBox root = new HBox(treeView);

        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Creating a TreeView");
        stage.show();

    }
}
