package it.edu.iisgubbio.laboratorio;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MenichettiLorenzo extends Application {
	Button bCalcola1 = new Button("SOMMA");
	Button bCalcola2 = new Button("PRIMI");
	Button bCalcola3 = new Button("DISPOSIZIONI");
	Label lNumero = new Label("numero");
	Label lEserc1 = new Label("ESERCIZIO1");
	Label lEserc2 = new Label("ESERCIZIO2");
	Label lEserc3 = new Label("ESERCIZIO3");
	TextField tNumero = new TextField("");
	TextField tNumero2 = new TextField("");
	TextField tNumero3 = new TextField("");
	TextField tNumero4 = new TextField("");
	TextField tNumero5 = new TextField("");
	TextField tNumero6 = new TextField("");
	Label lRisu1 = new Label("");
	Label lRisu2 = new Label("");
	Label lRisu3 = new Label("");
	GridPane griglia = new GridPane(); 


	public void start(Stage finestra) throws Exception {
		griglia.add(bCalcola1, 1,1);
		griglia.add(bCalcola2, 5,1);
		griglia.add(bCalcola3, 8,1);
		griglia.add(tNumero, 1,0);
		griglia.add(tNumero2, 2,0);
		griglia.add(tNumero3, 5,0);
		griglia.add(tNumero4, 6,0);
		griglia.add(tNumero5, 8,0);
		griglia.add(tNumero6, 9,0);
		griglia.add(lRisu1, 2,1);
		griglia.add(lRisu2, 6,1);
		griglia.add(lRisu3, 9,1);
		griglia.add(lEserc1, 0,0);
		griglia.add(lEserc2, 4,0);
		griglia.add(lEserc3, 7,0);

		bCalcola1.setMaxWidth(4000);
		bCalcola2.setMaxWidth(4000);
		bCalcola3.setMaxWidth(4000);



		bCalcola1.setOnAction(e ->somma());
		bCalcola2.setOnAction(e ->primi());
		bCalcola3.setOnAction(e ->disposizioni());



		Scene scena = new Scene (griglia);

		finestra.setTitle("VERIFICA");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void somma() {
		int numero,somma,numero2;
		numero = Integer.parseInt(tNumero.getText());
		numero2 = Integer.parseInt(tNumero2.getText());
		somma=0;



		for( int contatore=numero2;contatore<=numero;contatore++) {
			somma=somma+contatore;
			lRisu1.setText(somma+"");

		}







	}
	public void primi() {
		int numero,numero2,primi;
		numero = Integer.parseInt(tNumero.getText());
		numero2 = Integer.parseInt(tNumero2.getText());

		


	}
	public void disposizioni() {
		int numero,numero2;
		double disp;
		numero = Integer.parseInt(tNumero.getText());
		numero2 = Integer.parseInt(tNumero2.getText());




	}
	public static void main(String[] args) {
		launch(args);
	}
}