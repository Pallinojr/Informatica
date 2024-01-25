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

public class Ragnatela extends Application {

	
	 

	

	public void start(Stage finestra) throws Exception {
		
		
		Pane quadro = new Pane();
	
		
		
		
		for( int ICS=0,IPSILON=0;ICS<=200;ICS=ICS+20, IPSILON=IPSILON+20) {
			Line linea = new Line(0,0+IPSILON,200-ICS,0);
			linea.setStroke(Color.LIGHTBLUE);
			linea.setStrokeWidth(5);
			quadro.getChildren().add(linea);
			
			Line linea2 = new Line(200, 200-ICS,0+ICS,200);
			linea2.setStroke(Color.LIGHTBLUE);
			linea2.setStrokeWidth(5);
			quadro.getChildren().add(linea2);


			
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

