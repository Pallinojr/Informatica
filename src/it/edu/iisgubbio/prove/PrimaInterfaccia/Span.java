package it.edu.iisgubbio.prove.PrimaInterfaccia;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * La mia prima classe
 */
public class Span extends Application {

	Button pSaluto = new Button();
	Button bDueColonne = new Button();
	Button bA = new Button();
	Button bB = new Button();
	GridPane griglia = new GridPane();

	public void start(Stage finestra) {
		pSaluto.setText("ciao!");
		bDueColonne.setText("2 colonne");
		bA.setText("A");
		bB.setText("B");
		pSaluto.setMaxSize(60,60);
		griglia.add(pSaluto, 0, 0,1,2);
		griglia.add(bDueColonne, 1, 0,2,1);
		griglia.add(bA, 1, 1);
		griglia.add(bB, 2, 1);

		Scene scena = new Scene(griglia);

		finestra.setTitle("Span");
		finestra.setScene(scena);
		finestra.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}






