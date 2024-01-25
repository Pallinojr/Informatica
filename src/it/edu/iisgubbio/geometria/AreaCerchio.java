package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AreaCerchio extends Application {
	TextField tRaggio = new TextField("");
	TextField tPgreco = new TextField("");
	Button bCalcola = new Button("calocolaAP");
	Label eArea = new Label("area");
	Label eCirconferenza = new Label("circonferenza");
	Label eCirconferenzameno2 = new Label("circonferenza meno 2");
	Label eNome = new Label("Lorenzo Menichetti");
	GridPane griglia = new GridPane();

	public void start(Stage finestra) throws Exception {
	
		griglia.add(tPgreco, 1, 1);
		griglia.add(bCalcola, 0, 2);
		griglia.add(eArea, 0, 5);
		griglia.add(eCirconferenza, 1, 0);
		griglia.add(eCirconferenzameno2, 0, 6);
		griglia.add(eNome, 0, 3);
		
		
		
		bCalcola.setMaxWidth(2000);
		
		Scene scena = new Scene(griglia,400,400);

		finestra.setTitle("Rettangolo");
		finestra.setScene(scena);
		finestra.show();
	}
		
	private void area() {
		float raggio=Float.parseFloat(tRaggio.getText());
		float pgreco=Float.parseFloat(tPgreco.getText());
		float area=(pgreco*raggio*raggio);
		float circonferenza=(pgreco*raggio*2);
		float circonferenzameno2=(pgreco*raggio*2-2);
		eArea.setText("l'area è "+area);
		eCirconferenza.setText("la circonferenza è "+circonferenza);
		eCirconferenzameno2.setText("la circonferenza meno 2 è è "+circonferenzameno2);
		
				
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
