package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

public class MenichettiLorenzoRistorante extends Application {


	TextField tHamburger = new TextField();
	TextField tPatatine = new TextField();
	TextField tPreHamburger = new TextField();
	TextField tPrePatatine = new TextField();
	Label lNHamburger = new Label("numero hamburger");
	Label lPHamburger = new Label("prezzo hamburger");
	Label lNPatatine = new Label("numero patatine");
	Label lPPatatine = new Label("prezzo patatine");
	Label lTotale = new Label("totale");
	CheckBox cSalsa = new CheckBox("salse+0.2$");
	CheckBox cSconto = new CheckBox("sconto 10%");
	public void start(Stage finestra) throws Exception {

		GridPane griglia = new GridPane();
		
		Button bCalcolaPrezzo = new Button("calcola prezzo");

		griglia.setGridLinesVisible(false);
		griglia.add(lNHamburger, 0, 0);
		griglia.add(tHamburger, 0, 1);
		griglia.add(tPatatine, 0, 3);
		griglia.add(tPreHamburger, 1, 1);
		griglia.add(tPrePatatine, 1, 3);
		griglia.add(lPHamburger, 1, 0);
		griglia.add(lNPatatine, 0, 2);
		griglia.add(lPPatatine, 1, 2);
		griglia.add(lTotale, 0, 7);
		griglia.add(cSalsa, 0, 5);
		griglia.add(cSconto, 1,5);
		griglia.add( bCalcolaPrezzo, 0, 6);
		lNHamburger.getStyleClass().add("AP");
		lNPatatine.getStyleClass().add("AP");
		tHamburger.getStyleClass().add("T");
		tPatatine.getStyleClass().add("T");
		tPreHamburger.getStyleClass().add("T");
		tPrePatatine.getStyleClass().add("T");
		griglia.getStyleClass().add("G");
		
		

		bCalcolaPrezzo.setMaxWidth(300);
		bCalcolaPrezzo.setOnAction(e -> biglietto());

		griglia.setPadding( new Insets(10,10,10,10));
		griglia.setHgap(5);
		griglia.setVgap(5);

		Scene scena = new Scene (griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/verifica/Verifica.css");
		finestra.setTitle("PANINOTECA");
		finestra.setScene(scena);
		finestra.show();

	}

	public void biglietto() {
		double pP,pH,totaleP,totaleH,pTotale,pScontato,pPS;
		int nH, nP;
		nH = Integer.parseInt(tHamburger.getText());
		nP = Integer.parseInt(tPatatine.getText());
		pH = Double.parseDouble(tPreHamburger.getText());
		pP = Double.parseDouble(tPrePatatine.getText());
		
		totaleP=(nP*pP);
		totaleH=(nH*pH);
		pTotale=(totaleP+totaleH);
		lTotale.setText(pTotale + "");



		if (cSalsa.isSelected()) {
			pPS=(pP*0.2);
			pTotale=(pTotale+pPS);
			lTotale.setText(pTotale + "");

		}
		if (cSconto.isSelected()) {
			pScontato= pTotale-((pTotale/100)*10);
			lTotale.setText(pScontato + "");
		}


	
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}


