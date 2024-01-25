package it.edu.iisgubbio.animazioni;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Timer extends Application{    

	Label lTesto = new Label("finestra timer");
	int n=100;
	Button bPausa = new Button("STOPPELO");
	Button bVai = new Button("FALLO GI AVANTI"); 
	GridPane griglia = new GridPane();
	Timeline timeline;


	@Override
	public void start(Stage primaryStage) throws Exception {
		griglia.add(bPausa, 0, 0);
		griglia.add(bVai, 1, 0);
		griglia.add(lTesto, 1, 1);
		bVai.setOnAction(e ->avvia());
		bPausa.setOnAction(e ->ferma());

		
		
		Scene scene = new Scene(griglia,200,100);
		primaryStage.setTitle("Timer!"); 
		primaryStage.setScene(scene);
		primaryStage.show();
		timeline = new Timeline(new KeyFrame(
		Duration.millis(15),
		x -> aggiornaTimer()));
		timeline.setCycleCount(100);
		
	}

	private void aggiornaTimer(){
		lTesto.setText(""+ (n--));
	}
	private void avvia(){
		timeline.play();
	}
	private void ferma(){
		timeline.pause();
	}


	public static void main(String args[]){
		launch();
	}
}