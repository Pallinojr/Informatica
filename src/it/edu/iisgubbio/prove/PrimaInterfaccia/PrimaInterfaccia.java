package it.edu.iisgubbio.prove.PrimaInterfaccia;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PrimaInterfaccia extends Application {
	Label eCopiaSx = new Label();
	Label eCopiaDx = new Label();
	Label eCentro = new Label();
	Button bPulisci = new Button();
	Button bCopiaDx = new Button();
	Button bCopiaSx = new Button();
	Button bUnisci = new Button();
	TextField tCasellaSx=new TextField(" ");
	TextField tCasellaDx=new TextField(" ");
	GridPane griglia = new GridPane();
	public void start(Stage finestra) {
		eCopiaSx.setText("copia");
		bUnisci.setText("unisci");
		bCopiaDx.setText("copia");
		bPulisci.setText("pulisci");
		griglia.add(tCasellaSx, 0, 0);
		griglia.add(bUnisci, 1, 0);
		griglia.add(eCentro, 1, 1);
		griglia.add(bPulisci, 1, 2);
		griglia.add(eCopiaSx, 0, 2);
		griglia.add(bCopiaSx, 0, 1);
		griglia.add(bCopiaDx, 2, 1);
		griglia.add(eCopiaDx, 2, 2);
		griglia.add(tCasellaDx, 2, 0);
		bUnisci.setOnAction(e -> unisci());
		bCopiaDx.setOnAction(e -> copiaDx());
		bCopiaSx.setOnAction(e -> copiaSx());
		bPulisci.setOnAction(e -> pulisci());


		Scene scena = new Scene(griglia);

		finestra.setTitle("Hello World!");
		finestra.setScene(scena);
		finestra.show();
	}
	public void unisci() {
		String messaggiosx;
		messaggiosx = tCasellaSx.getText();
		String messaggiodx;
		messaggiodx = tCasellaDx.getText();
		eCentro.setText(messaggiosx + messaggiodx);
	}
	public void copiaSx() {
		String messaggiosx;
		messaggiosx = tCasellaSx.getText();
		eCopiaSx.setText(messaggiosx);
	}
	public void copiaDx() {
		String messaggiodx;
		messaggiodx = tCasellaDx.getText();
		eCopiaDx.setText(messaggiodx);
	}


	public void pulisci() {
		tCasellaSx.setText("");
		tCasellaDx.setText("");
		eCentro.setText("");
		eCopiaSx.setText("");
		eCopiaDx.setText("");


	}
	public static void main(String[] args) {			
		launch(args);
	}
}