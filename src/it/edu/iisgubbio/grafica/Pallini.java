package it.edu.iisgubbio.grafica;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Pallini extends Application {

	
	 

	

	public void start(Stage finestra) throws Exception {
		
		
		Pane quadro = new Pane();
		
		
		for( int num=0;num<=280;num=num+20) {
			Circle pallino = new Circle(7);
			pallino.setFill(Color.YELLOW);
			pallino.setCenterX(num);
			pallino.setCenterY(20);
			quadro.getChildren().add(pallino);
			
			
		}
	
		
		
	


		
		Scene scena = new Scene (quadro,200,200);

		finestra.setTitle("FATTORIALE");
		finestra.setScene(scena);
		finestra.show();		
	}

		
	public static void main(String[] args) {
		launch(args);
	}
}

