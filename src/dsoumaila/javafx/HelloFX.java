package dsoumaila.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        var btnOk = new Button("Say 'Hello World'");
        btnOk.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World !!!!!");
			}
		});
        
        var root = new StackPane();
        root.getChildren().add(btnOk);
        
        var scene = new Scene(root, 600, 400);
        
        primaryStage.setTitle("JavaFX Training");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

	public static void main(String[] args) {
		launch(args);
	}

}
