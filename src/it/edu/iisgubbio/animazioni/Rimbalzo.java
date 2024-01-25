package it.edu.iisgubbio.animazioni;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Rimbalzo extends Application{
	Circle pallino;
	Button pStart = new Button("via");
	int X=20;
	int Y=20;
	Timeline timeline;
	Pane quadro = new Pane();
	boolean des;
	boolean sop;


	public void start(Stage finestra) throws Exception {
		GridPane griglia = new GridPane();
		griglia.add(pStart,  0,  0);
		griglia.add(quadro, 0, 1);

		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(22); 
		griglia.setVgap(10);

		quadro.setPrefHeight(600);
		quadro.setPrefWidth(800);

		Scene scene = new Scene(griglia,400,300);

		finestra.setTitle("Timer!"); 
		finestra.setScene(scene);
		finestra.show();

		timeline = new Timeline(new KeyFrame(
				Duration.millis(2),
				x -> aggiornaTimer()));

		pallino = new Circle(35);
		quadro.getChildren().add(pallino);
		pallino.setFill(Color.GREEN);
		pallino.setCenterY(Y);
		pallino.setCenterX(X);
		timeline.setCycleCount(Timeline.INDEFINITE);

		pStart.setOnAction(e -> muoviti());
	}
	private void muoviti(){
		timeline.play();
	}
	private void aggiornaTimer(){
		if(X==0){
			des=false;
		}
		
		if(Y==200){
			sop=true;
		}
		if(X==300){
			des=true;
		}
		if(Y==0){
			sop=false;
		}
		if(des){
			pallino.setCenterX(X--);
		}else {
			pallino.setCenterX(X++);
		}
		if(sop){
			pallino.setCenterY(Y--);
		}
		else {
			pallino.setCenterY(Y++);
		}




	}


	public static void main(String args[]){
		launch();
	}
}
