/**
 * Created by Vasiliev.Alexey on 07.12.16.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PositionLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Button b1 = new Button("OK");
        b1.setLayoutX(20);
        b1.setLayoutY(20);
        Button b2 = new Button("Cancel");
        b2.setLayoutX(50);
        b2.setLayoutY(50);
       // VBox vb = new VBox();
        //vb.getChildren().addAll(b1, b2);

        Group parent = new Group(); //Or. Pane parent = new Pane();
        parent.getChildren().addAll(b1, b2);


        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Testing LayoutBounds");
        primaryStage.show();

    }
}
