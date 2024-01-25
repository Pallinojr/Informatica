package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Caso extends Application {
	TextField tElementi = new TextField();
	TextField tMin = new TextField();
	TextField tMax = new TextField();
	Label lElementi = new Label("elementi");
	Label lMin = new Label("min");
	Label lMax = new Label("max");
	Label lRisu = new Label("");
	Label lPari = new Label("");
	Label lSomma = new Label("");
	Label lDueTre = new Label("");
	Label lMinimo = new Label("");
	Button bGenera = new Button("genera");
	Button bStampa = new Button("Stampa");
	Button bPari = new Button("num pari");
	Button bSomma = new Button("somma");
	Button bDueTre = new Button(" 2e3");
	Button bMin = new Button("min");





	int elementi[];
	int numTempi;
	int pos;

	@Override
	public void start(Stage primaryStage) {
		GridPane griglia = new GridPane();
		griglia.setPadding(new Insets(5, 5, 5, 5));
		griglia.setHgap(15); 
		griglia.setVgap(15);
		Scene scena = new Scene(griglia, 400, 250);
		primaryStage.setTitle("Bho!");
		primaryStage.setScene(scena);
		primaryStage.show();


		griglia.add(tElementi, 1, 0);
		griglia.add(tMin, 1, 1);
		griglia.add(tMax, 1, 2);
		griglia.add(lElementi, 0, 0);
		griglia.add(lMin, 0,1);
		griglia.add(lMax, 0,2);
		griglia.add(lRisu, 1,4);
		griglia.add(lPari, 1,5);
		griglia.add(lSomma, 1,6);
		griglia.add(lDueTre, 1,7);
		griglia.add(lMinimo, 1,8);
		griglia.add(bGenera, 0, 3);
		griglia.add(bStampa, 1, 3);
		griglia.add(bPari, 2, 3);
		griglia.add(bSomma, 3, 3);
		griglia.add(bDueTre, 4, 3);
		griglia.add(bMin, 5, 3);

		bGenera.setOnAction(e -> genera());
		bStampa.setOnAction(e -> stampa());
		bPari.setOnAction(e -> pari());
		bSomma.setOnAction(e -> somma());
		bDueTre.setOnAction(e -> duetre());
		bMin.setOnAction(e -> minimo());






	}
	public void genera() {
		int nElementi,min,max,range,indice;
		nElementi = Integer.parseInt(tElementi.getText());
		min = Integer.parseInt(tMin.getText());
		max = Integer.parseInt(tMax.getText());
		range =max-min;
		elementi = new int[nElementi];
		pos = 0;
		for(indice=0;indice<nElementi;indice++) {
			elementi[indice] =(int)(Math.random()*(range+1)+min);

		}
	}

	public void stampa() {
		int nElementi = Integer.parseInt(tElementi.getText());
		int indice;
		String risultato="";
		for(indice=0;indice<nElementi;indice++) {
			(risultato)=risultato+"  "+elementi[indice];


		}
		lRisu.setText(risultato);


	}
	public void pari() {
		int nElementi = Integer.parseInt(tElementi.getText());
		int indice,pari;
		pari=0;
		for(indice=0;indice<nElementi;indice++) {
			if (elementi[indice]%2==0) {
				pari+=1;
			}


		}
		lPari.setText(""+pari);


	}
	public void somma() {
		int nElementi = Integer.parseInt(tElementi.getText());
		int indice,somma;
		somma=0;
		for(indice=0;indice<nElementi;indice++) {
			somma=somma+elementi[indice];
		}
		lSomma.setText(""+somma);		
	}
	public void duetre() {
		int nElementi = Integer.parseInt(tElementi.getText());
		int indice,pari,duetre;
		duetre=0;
		for(indice=0;indice<nElementi;indice++) {
			if (elementi[indice]%2==0 &&elementi[indice]%3==0) {
				duetre+=elementi[indice];
			}


		}
		lDueTre.setText(""+duetre);

	}
	public void minimo() {
		int nMin = Integer.parseInt(tMin.getText());
		int nElementi = Integer.parseInt(tElementi.getText());
		int indice,pari,duetre,numeropiccolo;
		duetre=0;
		numeropiccolo=0;
		for(indice=0;indice<nElementi;indice++) {
			if (elementi[indice]<nMin) {
				duetre+=elementi[indice];
			}


		}
	}






	public static void main(String[] args) {
		launch(args);
	}
}
