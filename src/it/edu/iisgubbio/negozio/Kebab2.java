package it.edu.iisgubbio.negozio;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Kebab2 extends Application {
	Button bTotale = new Button("calcola totale");
	Label lTotale = new Label();
	CheckBox cPomodoro = new CheckBox("pomodoro(1.00$)");
	CheckBox cCarne = new CheckBox("carne(4.00$)");
	CheckBox cFormaggio = new CheckBox("formaggio(1.00$)");
	CheckBox cSalsa = new CheckBox("salsa(0.50$)");
	CheckBox cCipolla = new CheckBox("cipolla(0.50$)");
	ComboBox<String>combocarne=new ComboBox<>();
	ComboBox<String>comboverdura=new ComboBox<>();
	ComboBox<String>combosalsa=new ComboBox<>();
	GridPane griglia = new GridPane(); 


	public void start(Stage finestra) throws Exception {
		griglia.add(lTotale, 0,7);
		griglia.add(bTotale, 0,6);
		griglia.add(combocarne, 0,1);
		griglia.add(combosalsa, 0,5);
		griglia.add(comboverdura, 0,3);
		combocarne.getItems().add("pollo");
		combocarne.getItems().add("maiale");
		combocarne.getItems().add("vitello");
		combocarne.getItems().add("tofu");
		comboverdura.getItems().add("insalata");
		comboverdura.getItems().add("cipolla");
		comboverdura.getItems().add("pomodoro");
		comboverdura.getItems().add("carota");
		combosalsa.getItems().add("maionese");
		combosalsa.getItems().add("piccante");
		combosalsa.getItems().add("yougurt");
		combosalsa.getItems().add("tzatziki");
		combocarne.getSelectionModel().select("CARNE");
		comboverdura.getSelectionModel().select("VERDURA");
		combosalsa.getSelectionModel().select("SALSA");
		
		griglia.getStyleClass().add("AP");
		

		bTotale.setOnAction(e ->calcola());


		Scene scena = new Scene (griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/negozio/Kebab2.css");

		finestra.setTitle("KEBAB");
		finestra.setScene(scena);
		finestra.show();		
	}
	public void calcola() { 
		String carne = combocarne.getValue();
		String verdura = comboverdura.getValue();
		String salsa = combosalsa.getValue();
		
		double totale=0;
		switch(carne){
		case "pollo":
			totale=totale+3;
			break;
		case "maiale":
			totale=totale+2.5;
			break;
		case "vitello":
			totale=totale+4;
			break;
		case "tofu":
			totale=totale+3;
			break;
			
		}
		switch(verdura){
		case "insalata":
			totale=totale+0.5;
			break;
		case "cipolla":
			totale=totale+0.5;
			break;
		case "pomodoro":
			totale=totale+1;
			break;
		case "carota":
			totale=totale+1;
			break;
		}
		switch(salsa){
		case "maionese":
			totale=totale+0.5;
			break;
		case "piccante":
			totale=totale+1;
			break;
		case "yougurt":
			totale=totale+0.5;
			break;
		case "tzatziki":
			totale=totale+0.5;
			break;
		
		}
		lTotale.setText("il totale è "+totale+" €");	
	}

	public static void main(String[] args) {
		launch(args);
	}
}

