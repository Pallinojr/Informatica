package it.edu.iisgubbio.prove;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Stile extends Application {
	
	Label lAP = new Label("AREAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
	Label lB = new Label("BASE");
	Label lH = new Label("ALTEZZA");
	TextField tBase = new TextField();
	TextField tAltezza = new TextField();
	GridPane griglia = new GridPane(); 
	


	public void start(Stage finestra) throws Exception {
		griglia.add(tBase, 0,1);
		griglia.add(tAltezza, 0,2);
		griglia.add(lAP,0,3);
		griglia.add(lB,1,1);
		griglia.add(lH,1,2);
		lAP.getStyleClass().add("AP");
		tBase.setOnAction(e ->calcola());
		tAltezza.setOnAction(e ->calcola());
		
		


		Scene scena = new Scene (griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/prove/Stile.css");

		finestra.setTitle("KEBAB");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void calcola() {
		if (tBase.getText()==""||tAltezza.getText()=="") {
			lAP.setText("mancano dei dati");
		}
		

	}

public static void main(String[] args) {			
	launch(args);
}
}

