package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tabellina extends Application {

	TextField tNumero = new TextField();
	Label lNumero = new Label("num");
	Label lRisu = new Label();
	Button bCalcola = new Button("tabellina");

	public void start(Stage finestra) throws Exception {

		GridPane griglia = new GridPane();

		Label eA = new Label("x²+");
		Label eB = new Label("x+");
		Label eC = new Label("=0");

		griglia.setGridLinesVisible(false);


		griglia.add(tNumero, 1, 0);
		griglia.add(lNumero, 0, 0);
		griglia.add(bCalcola, 1, 1);
		griglia.add(lRisu, 0,2,2,1);


		bCalcola.setMaxWidth(500);


		bCalcola.setOnAction(e -> compilaElenco());

		griglia.setPadding( new Insets(10,10,10,10));
		griglia.setHgap(5);
		griglia.setVgap(5);

		Scene scena = new Scene (griglia);
		finestra.setTitle("Equazione di secondo grado");
		finestra.setScene(scena);
		finestra.show();

	}


	public void compilaElenco() {
		   int n;
		   String sequenza;
		   sequenza = "1";
		   for(n = 2; n <= 10; n++) {
		      sequenza += ", " + n;
		   }
		 
		}
		
		lRisu.setText(sequenza+"");


	public static void main(String[] args) {
		launch(args);
	}
}

