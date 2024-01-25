package it.edu.iisgubbio.geometria.geometria.quadrato;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quadrato extends Application {
	Label eLato = new Label("lato");
	Button bArea = new Button("area");
	TextField cLato = new TextField("metti lato");
	Label eArea = new Label("area");
	GridPane griglia = new GridPane();
	
	public void start(Stage finestra) throws Exception {
		griglia.add(eLato, 1, 0);
		griglia.add(bArea, 1, 1);
		griglia.add(cLato, 2, 0);
		griglia.add(eArea, 2, 1);
		cLato.setPromptText("inserire lato");
			
		Scene scena = new Scene(griglia);

		finestra.setTitle("Span");
		finestra.setScene(scena);
		finestra.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
