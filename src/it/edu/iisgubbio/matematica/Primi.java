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

public class Primi extends Application {
	Button bCalcola = new Button("DIVIDO");
	Label lNumero = new Label("numero");
	TextField tNumero = new TextField("");
	Label lDivisori = new Label("");
	TextField tAnni = new TextField("");
	Label lInteressi = new Label("inte");
	GridPane griglia = new GridPane(); 


	public void start(Stage finestra) throws Exception {
		griglia.add(lNumero, 0,0);
		griglia.add(bCalcola, 1,1);
		griglia.add(tNumero, 1,0);
		griglia.add(lDivisori, 3,0);


		bCalcola.setOnAction(e ->calcola());


		Scene scena = new Scene (griglia);

		finestra.setTitle("INTERESSI");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void calcola() {
		int numero;
		numero = Integer.parseInt(tNumero.getText());
		boolean primo =true;



		for( int contatore=2;contatore<=numero;contatore++) {
			if(numero%contatore==0){
				primo=false;
			}
			if(primo){
				primo=false;
				lDivisori.setText(numero+"primo");
		

	
		}else{
			lDivisori.setText(numero+" non è primo");
		}
		}
	}










		public static void main(String[] args) {
			launch(args);
		}
	}

