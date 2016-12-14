package com.av.tableview;/**
 * Created by alexey on 14.12.16.
 */

import com.av.domain.Person;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimplestTableView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
// Create a TableView with a list of persons
        TableView<Person> table = new TableView<>(PersonTableUtil.getPersonList());
// Add columns to the TableView
        table.setPlaceholder(new Label("No visible columns and/or data exist."));
        TableColumn<Person, String> nameColumn = new TableColumn<>("Имя");

        nameColumn.getColumns().addAll(   PersonTableUtil.getFirstNameColumn(),
                PersonTableUtil.getLastNameColumn());


        table.getColumns().addAll(PersonTableUtil.getIdColumn(),
                nameColumn,
                PersonTableUtil.getBirthDateColumn());


        VBox root = new VBox(table);
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Simplest TableView");
        stage.show();

    }
}
