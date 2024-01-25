package it.edu.iisgubbio.matematica;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fattoriale extends Application {
	Button bCalcola = new Button("calcola");
	Label lCalcolo = new Label();
	TextField tCalcolo = new TextField();
	GridPane griglia = new GridPane(); 

	

	public void start(Stage finestra) throws Exception {
		griglia.add(lCalcolo, 2,0);
		griglia.add(bCalcola, 1,0);
		griglia.add(tCalcolo, 0,0);
		

		bCalcola.setOnAction(e ->calcola());


		Scene scena = new Scene (griglia);

		finestra.setTitle("FATTORIALE");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void calcola() {
		int numero;
		int fattoriale=1;
		numero=Integer.parseInt(tCalcolo.getText());
		for( int contatore=1;contatore<=numero;contatore++) {
			fattoriale=fattoriale*contatore;
			
		}
		lCalcolo.setText(fattoriale+"");
			
	}
		
		
	public static void main(String[] args) {
		launch(args);
	}
}

