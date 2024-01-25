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

public class Faccia extends Application {

	
	 

	

	public void start(Stage finestra) throws Exception {
		
		
		Pane quadro = new Pane();
		Circle faccia = new Circle(100);
		Circle occhiDX = new Circle(45);
		Circle occhiSX = new Circle(45);
		Line boccaDX = new Line(140,140,100,100);
		Line boccaSX = new Line(140,140,100,100);
		faccia.setFill(Color.PINK);
		faccia.setCenterX(100);
		faccia.setCenterY(100);
		occhiSX.setFill(Color.BLUE);
		occhiSX.setCenterX(50);
		occhiSX.setCenterY(50);
		occhiDX.setFill(Color.BLUE);
		occhiDX.setCenterX(50);
		occhiDX.setCenterY(50);
		boccaSX.setFill(Color.RED);
		boccaSX.setStrokeWidth(3);
		boccaDX.setFill(Color.RED);
		boccaDX.setStrokeWidth(3);
		
		quadro.getChildren().add(faccia);
		quadro.getChildren().add(occhiDX);
		quadro.getChildren().add(occhiSX);
		quadro.getChildren().add(boccaDX);
		quadro.getChildren().add(boccaSX);

	


		
		Scene scena = new Scene (quadro,200,200);

		finestra.setTitle("FATTORIALE");
		finestra.setScene(scena);
		finestra.show();		
	}

		
	public static void main(String[] args) {
		launch(args);
	}
}
