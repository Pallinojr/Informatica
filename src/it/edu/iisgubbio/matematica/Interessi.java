package it.edu.iisgubbio.matematica;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Interessi extends Application {
	Button bCalcola = new Button("calcola");
	Label lCapitale = new Label("capi");
	TextField tCapitale = new TextField("");
	TextField tInteressi = new TextField("");
	TextField tAnni = new TextField("");
	Label lInteressi = new Label("inte");
	Label lAnni = new Label("anni");
	Label lRiuslta = new Label();
	GridPane griglia = new GridPane(); 


	public void start(Stage finestra) throws Exception {
		griglia.add(lCapitale, 0,0);
		griglia.add(bCalcola, 2,0);
		griglia.add(lInteressi,0,1);
		griglia.add(tCapitale, 1,0);
		griglia.add(tInteressi,1,1);
		griglia.add(tAnni,1,2);
		griglia.add(lAnni,0,2);
		griglia.add(lRiuslta,0,3,2,1);
		
		bCalcola.setOnAction(e ->calcola());


		Scene scena = new Scene (griglia);

		finestra.setTitle("INTERESSI");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void calcola() {
		double contatore,anni,interessi,capitale;
		capitale = Double.parseDouble(tCapitale.getText());
		interessi = Double.parseDouble(tInteressi.getText());
		anni = Double.parseDouble(tAnni.getText());
		
		for(contatore=1;contatore<=anni;contatore++) {
			capitale =capitale+((capitale/100)*interessi);
		}
		
		lRiuslta.setText(capitale+"");
		
		
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
