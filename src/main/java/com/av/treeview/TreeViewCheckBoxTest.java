package com.av.treeview;
/**
 * Created by vasiliev-alexey on 15.12.16.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBoxTreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.CheckBoxTreeCell;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TreeViewCheckBoxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        CheckBoxTreeItem<String> depts =
                new CheckBoxTreeItem<>("Departments");
// Add items to depts
        CheckBoxTreeItem<String> isDept = new CheckBoxTreeItem<>("IS");
        CheckBoxTreeItem<String> claimsDept =
                new CheckBoxTreeItem<>("Claims");

        CheckBoxTreeItem<String> underwritingDept =
                new CheckBoxTreeItem<>("Underwriting");
        depts.getChildren().addAll(isDept, claimsDept, underwritingDept);
// Add employees for each dept
        isDept.getChildren().addAll(new CheckBoxTreeItem<String>("Doug Dyer"),
                new CheckBoxTreeItem<String>("Jim Beeson"),
                new CheckBoxTreeItem<String>("Simon Ng"));
        claimsDept.getChildren().addAll(
                new CheckBoxTreeItem<String>("Lael Boyd"),
                new CheckBoxTreeItem<String>("Janet Biddle"));
        underwritingDept.getChildren().addAll(
                new CheckBoxTreeItem<String>("Ken McEwen"),
                new CheckBoxTreeItem<String>("Ken Mann"),
                new CheckBoxTreeItem<String>("Lola Ng"));
/// Make the claimsDept item independent
        claimsDept.setIndependent(true);
// Create a TreeView with depts as its root item
        TreeView<String> treeView = new TreeView<>(depts);
// Set the cell factory to draw a CheckBox in cells
        treeView.setCellFactory(CheckBoxTreeCell.<String>forTreeView());

        // Add an onEditCommit handler
        treeView.setEditable(true);
        treeView.setOnEditCommit(e -> {
            System.out.println(e.getTreeItem() + " changed." +
                    " old = " + e.getOldValue() +
                    ", new = " + e.getNewValue());
        });

        HBox root = new HBox(treeView);
        root.setSpacing(20);
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Using CheckBoxTreeItem");
        stage.show();
    }
}
