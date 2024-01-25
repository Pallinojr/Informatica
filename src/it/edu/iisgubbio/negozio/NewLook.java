package it.edu.iisgubbio.negozio;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class NewLook extends Application {


	TextField KMpercorsi = new TextField("km percorsi");
	Label lAll1 = new Label("corsa");
	Label lAll2 = new Label("bici");
	Label lAll3 = new Label("swimming");
	Label lBracciali = new Label("bracciali");
	Label lCavigliere = new Label("cavigliere");
	Button bCalorie = new Button("calcola calories");
	CheckBox cCavigliere = new CheckBox();
	CheckBox cBracciali = new CheckBox();
	RadioButton rAll1 = new RadioButton();
	RadioButton rAll2 = new RadioButton();
	RadioButton rAll3 = new RadioButton();
	
	
	
	public void start(Stage finestra) throws Exception {

		GridPane griglia = new GridPane();


		griglia.setGridLinesVisible(false);
		griglia.add(KMpercorsi, 0, 3);
		griglia.add(lAll1, 0, 0);
		griglia.add(lAll2, 0, 1);
		griglia.add(lAll3, 0, 2);
		griglia.add(lBracciali, 0, 4);
		griglia.add(lCavigliere, 0,5);
		griglia.add(cCavigliere, 1,5);
		griglia.add(cBracciali, 1,4);
		griglia.add(rAll1, 1,0);
		griglia.add(rAll2, 1,1);
		griglia.add(rAll3, 1,2);
		bCalorie.setOnAction(e ->calcola());
		lAll1.getStyleClass().add("AP");
		
		ToggleGroup Allenamento = new ToggleGroup();
		rAll1.setToggleGroup(Allenamento);
		rAll2.setToggleGroup(Allenamento);
		rAll3.setToggleGroup(Allenamento);
		
		
	

		
		griglia.setPadding( new Insets(10,10,10,10));
		griglia.setHgap(5);
		griglia.setVgap(5);

		Scene scena = new Scene (griglia);
		scena.getStylesheets().add("it/edu/iisgubbio/prove/NewLook.css");

		finestra.setTitle("Kebab");
		finestra.setScene(scena);
		finestra.show();

	}

	public void calcola() {
		if(rAll1.isSelected()){
			totale=numeropanini*prezzosconto;
	    }
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}

