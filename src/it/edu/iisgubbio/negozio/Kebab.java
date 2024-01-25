package it.edu.iisgubbio.negozio;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Kebab extends Application {
	Button bTotale = new Button("calcola totale");
	Label lTotale = new Label();
	CheckBox cPomodoro = new CheckBox("pomodoro(1.00$)");
	CheckBox cCarne = new CheckBox("carne(4.00$)");
	CheckBox cFormaggio = new CheckBox("formaggio(1.00$)");
	CheckBox cSalsa = new CheckBox("salsa(0.50$)");
	CheckBox cCipolla = new CheckBox("cipolla(0.50$)");
	GridPane griglia = new GridPane(); 


	public void start(Stage finestra) throws Exception {
		griglia.add(lTotale, 1,6);
		griglia.add(bTotale, 0,6);
		griglia.add(cPomodoro, 0,3,2,1);
		griglia.add(cCarne, 0,1,2,1);
		griglia.add(cFormaggio, 0,2,2,1);
		griglia.add(cSalsa, 0,4,2,1);
		griglia.add(cCipolla, 0,5,2,1);

		bTotale.setOnAction(e ->calcola());


		Scene scena = new Scene (griglia);

		finestra.setTitle("KEBAB");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void calcola() {
		double totale=0;
		if(cPomodoro.isSelected()){
			totale=totale+1;
		}
		if(cCarne.isSelected()){
			totale=totale+4;
		}
		if(cFormaggio.isSelected()){
			totale=totale+1;

		}
		if(cSalsa.isSelected()){
			totale=totale+0.5;

		}
		if(cCipolla.isSelected()){
			totale=totale+0.5;

		}
		lTotale.setText(totale+"$");

	}
}
