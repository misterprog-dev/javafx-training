package dsoumaila.javafx;

import java.awt.Label;
import java.awt.TextField;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    	// var root = new Group();
    	
        var btnOk = new Button("Say 'Hello World'");
        btnOk.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World !!!!!");
			}
		});
        btnOk.setLayoutX(200);
        btnOk.setLayoutY(40);
        //root.getChildren().add(btnOk);
        
        var label = new Text("Bonjour, je suis Soumaila");
        label.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.REGULAR, 20));
        label.setX(200);  
        label.setY(20); 
        label.setStrikethrough(true);
        label.setUnderline(true);
        //root.getChildren().add(label);
        
        var btn1 = new Button("Button 1");  
        var btn2 = new Button("Button 2");  
        var rootHbox = new HBox();  
        rootHbox.setSpacing(10);
        rootHbox.getChildren().addAll(btn1,btn2);  
        //var scene = new Scene(rootHbox,400,400);  
        
        
        var lblFirstName =new Label("Nom : ");  
        var lblLastName =new Label("Prénom(s) : ");  
        var txtFirstName = new TextField();  
        var txtLastName =new TextField(); 
        var btnSubmit = new Button("Envoyer");
        var rootGridPane = new GridPane();
        var sceneGridPane = new Scene(rootGridPane, 400, 200);
        
        /*rootGridPane.addRow(0, lblFirstName);
        rootGridPane.add(0, lblFirstName, txtFirstName);
        rootGridPane.add(1, lblLastName, txtLastName);
        rootGridPane.add(1, lblLastName, txtLastName);
        rootGridPane.addRow(2, btnSubmit);*/
        
        var root = new FlowPane();  
        root.setVgap(6);  
        root.setHgap(5);  
        root.setPrefWrapLength(250);  
        root.getChildren().add(new Button("Start"));  
        root.getChildren().add(new Button("Stop"));  
        root.getChildren().add(new Button("Reset"));  
        var scene = new Scene(root,300,200);  
        
        
        displayStage(primaryStage, scene);
        
    }
    
    private void displayStage(Stage stage, Scene scene) {
    	stage.setTitle("JavaFX Training");
        stage.setScene(scene);
        stage.show();
    }

	public static void main(String[] args) {
		launch(args);
	}

}
