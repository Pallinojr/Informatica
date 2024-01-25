package it.edu.iisgubbio.negozio;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Sconto extends Application {
	Label lPrezzo = new Label("prezzo panino");
	Label lNumero = new Label("numero panini");
	Label lSconto = new Label("sconto(%)");
	Label lTotale = new Label("");
	Label lApllicaSconto = new Label("applica sconto");
	Button bCalcolaTotale = new Button("calcola totale");
	TextField tPrezzo = new TextField("");
	TextField tNumero = new TextField("");
	TextField tSconto = new TextField("");
	CheckBox cApplicaSconto = new CheckBox();
	GridPane griglia = new GridPane(); 


	public void start(Stage finestra) throws Exception {
		griglia.add(lPrezzo, 0, 0);
		griglia.add(lNumero, 0, 1);
		griglia.add(lSconto, 0, 2);
		griglia.add(lTotale, 0, 5);
		griglia.add(bCalcolaTotale, 0,4);
		griglia.add(tPrezzo, 1, 0);
		griglia.add(tNumero, 1, 1);
		griglia.add(tSconto, 1, 2);
		griglia.add(lApllicaSconto, 0, 3);
		griglia.add(cApplicaSconto, 1, 3);
		bCalcolaTotale.setOnAction(e ->calcola());


		Scene scena = new Scene (griglia);

		finestra.setTitle("Rettangolo");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void calcola() {
		double prezzopanino, numeropanini, sconto, prezzosconto, totale;
		prezzopanino = Double.parseDouble(tPrezzo.getText());
		numeropanini = Double.parseDouble(tNumero.getText());
		sconto= Double.parseDouble(tSconto.getText());
		prezzosconto= prezzopanino-((prezzopanino/100)*sconto);
		if(cApplicaSconto.isSelected()){
			totale=numeropanini*prezzosconto;
	    }
		else {
			totale=numeropanini*prezzopanino;
		}
				lTotale.setText("il totale è "+totale+" €");	
	}
	public static void main(String[] args) {
		launch(args);
	}

}
