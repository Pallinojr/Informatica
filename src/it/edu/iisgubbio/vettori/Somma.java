package it.edu.iisgubbio.vettori;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Somma extends Application {
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
	Button bVerifica = new Button("min");

	int elementi[];
	int numTempi;
	int pos;
	boolean crecks=true;

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
		griglia.add(bSomma, 2, 0);
		griglia.add(bVerifica, 4, 0);
		griglia.add(lRisu, 3, 0);
		
	
		bSomma.setOnAction(e -> somma());
		bVerifica.setOnAction(e -> verifica());
	}
	public void somma() {
		int indice,somma;
		somma=0;
		String t=tElementi.getText();
		String[] parti=t.split(" ");
		int[] numeri=new int[parti.length];
		for(indice=0;indice<parti.length;indice++) {
			numeri[indice]=Integer.parseInt(parti[indice]);
			somma+=numeri[indice];
		}
		lRisu.setText(""+somma);		
	}
	public void verifica() {
		
		int indice,pari,duetre,numeropiccolo,verifica;
		duetre=0;
		numeropiccolo=0;
		verifica=0;
		String t=tElementi.getText();
		String[] parti=t.split(" ");
		int[] numeri=new int[parti.length];
		for(indice=0;indice<parti.length;indice++) {
			if (elementi[indice]<=verifica) {
				crecks=false;
			}
			verifica=numeri[indice];
		}
		if (crecks=true) {
			lRisu.setText("crecente");	
			
	}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
