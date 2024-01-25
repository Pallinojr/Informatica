package it.edu.iisgubbio.animazioni;

import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DemoPong extends Application{
	Circle pallino;
	Button pStart = new Button("via");
	int x=20;
	int y=20;
	Timeline timeline;
	Timeline timerache;
	Pane quadro = new Pane();
	boolean des;
	boolean sop;
	boolean rDesUp;
	boolean rSinisUp;
	boolean rDesDown;
	boolean rSinisDown;
	int p1=0;
	int p2=0;
	final int DIMENSIONE_FINESTRA_Y=600;
	final int DIMENSIONE_FINESTRA_X=800;
	Rectangle rettangolo = new Rectangle();
	Rectangle rettangolo2 = new Rectangle();
	Label lRisu1 = new Label("");
	Label lRisu2 = new Label("");
	Label lGiocatore1 = new Label("GIOCATORE1");
	Label lGiocatore2 = new Label("GIOCATORE2");


	public void start(Stage finestra) throws Exception {
		GridPane griglia = new GridPane();
		griglia.add(quadro, 0, 1);
		griglia.add(lRisu1, 1, 1);
		griglia.add(lRisu2, 2, 1);
		griglia.add(lGiocatore1, 1, 0);
		griglia.add(lGiocatore2, 2, 0);
		
		lRisu1.getStyleClass().add("punti");
		lRisu2.getStyleClass().add("punti");



		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10); 
		griglia.setVgap(10);


		quadro.getStyleClass().add("o");
		rettangolo.getStyleClass().add("p");
		rettangolo2.getStyleClass().add("p");




		quadro.setPrefHeight(DIMENSIONE_FINESTRA_Y);
		quadro.setPrefWidth(DIMENSIONE_FINESTRA_X);

		Scene scene = new Scene(griglia);

		scene.getStylesheets().add("it/edu/iisgubbio/animazioni/Pong.css");

		finestra.setTitle("Timer!"); 
		finestra.setScene(scene);
		finestra.show();

		scene.setOnKeyPressed(e ->pigiato(e));
		scene.setOnKeyReleased(e ->rilascio(e));

		timeline = new Timeline(new KeyFrame(
				Duration.millis(5),
				x -> aggiornaTimer()));

		pallino = new Circle(15);
		quadro.getChildren().add(pallino);
		quadro.getChildren().add(rettangolo);
		quadro.getChildren().add(rettangolo2);
		pallino.setFill(Color.GREEN);
		rettangolo2.setY(300);
		rettangolo2.setX(765);
		rettangolo.setY(300);
		rettangolo.setX(25);
		pallino.setCenterY(y);
		pallino.setCenterX(x);
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();
		rettangolo.setWidth(20);
		rettangolo.setHeight(150);
		rettangolo2.setWidth(20);
		rettangolo2.setHeight(150);


		timerache = new Timeline(new KeyFrame(
				Duration.millis(5),
				x -> SpostaRacchetta()));

		timerache.setCycleCount(Timeline.INDEFINITE);
		timerache.play();



	}



	private void pigiato(KeyEvent evento){

		if(evento.getText().equals("q")){
			rSinisUp=true;
		}
		if(evento.getText().equals("a")){
			rSinisDown=true;
		}
		if(evento.getText().equals("p")){
			rDesUp=true;			
		}
		if(evento.getText().equals("l")){
			rDesDown=true;
		}
	}
	private void rilascio(KeyEvent evento){

		if(evento.getText().equals("q")){
			rSinisUp=false;
		}
		if(evento.getText().equals("a")){
			rSinisDown=false;
		}
		if(evento.getText().equals("p")){
			rDesUp=false;			
		}
		if(evento.getText().equals("l")){
			rDesDown=false;
		}
	}

	private void aggiornaTimer(){
		Bounds b1 = rettangolo.getBoundsInParent();
		Bounds b2 = rettangolo2.getBoundsInParent();
		Bounds b3 = pallino.getBoundsInParent();



		if(b1.intersects(b3)) {
			des=false;
		}
		if(b2.intersects(b3)) {
			des=true;
		}
		if( x ==0){
			des=false;
			p2=p2+1;
			lRisu2.setText(p2+":"+p1);


		}

		if( y ==600){
			sop=true;
		}
		if(x==800){
			des=true;
			p1=p1+1;
			lRisu2.setText(p1+":"+p2);
		}
		if(y==0){
			sop=false;
		}
		if(des){
			pallino.setCenterX(x--);
		}else {
			pallino.setCenterX(x++);
		}
		if(sop){
			pallino.setCenterY(y--);
		}
		else {
			pallino.setCenterY(y++);
		}




	}
	private void SpostaRacchetta(){
		if(rDesUp){
			if((rettangolo2.getY())<0){	
			}else {
				rettangolo2.setY(rettangolo2.getY()-10);
			}			
		}
		if(rSinisUp){
			if(rettangolo.getY()<0){
			}else {
				rettangolo.setY(rettangolo.getY()-10);
			}			
		}
		if(rDesDown){
			if((rettangolo2.getY())>DIMENSIONE_FINESTRA_Y-190){
			}else {
				rettangolo2.setY(rettangolo2.getY()+10);	
			}			
		}
		if(rSinisDown){
			if((rettangolo.getY())>DIMENSIONE_FINESTRA_Y-190){
			}else {
				rettangolo.setY(rettangolo.getY()+10);
			}	
		}
	}


	public static void main(String args[]){
		launch();
	}
}