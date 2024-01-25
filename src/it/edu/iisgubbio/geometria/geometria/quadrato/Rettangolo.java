package it.edu.iisgubbio.geometria.geometria.quadrato;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rettangolo extends Application {
	TextField CBase = new TextField("");
	Label eBase = new Label("base");
	Label eAltezza = new Label("altezza");
	TextField cAltezza = new TextField("");
	Button bCalcola = new Button("calocolaAP");
	Label eArea = new Label("area");
	Label ePeri = new Label("perimetro");
	GridPane griglia = new GridPane();

	public void start(Stage finestra) throws Exception {
		griglia.add(CBase, 1, 0);
		griglia.add(cAltezza, 1, 1);
		griglia.add(bCalcola, 0, 2);
		griglia.add(eArea, 0, 3);
		griglia.add(ePeri, 1, 3);
		griglia.add(eBase, 0, 0);
		griglia.add(eAltezza, 0, 1);
		
		bCalcola.setMaxWidth(2000);
		
		Scene scena = new Scene(griglia,400,400);

		finestra.setTitle("Rettangolo");
		finestra.setScene(scena);
		finestra.show();
	}
		
	private void area() {
		float base=Float.parseFloat(CBase.getText());
		float altezza=Float.parseFloat(cAltezza.getText());
		float area=base*altezza;
		eArea.setText("l'area è "+area);
		
				
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
