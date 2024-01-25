package it.edu.iisgubbio.geometria.geometria.quadrato;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Triangoli extends Application {
	TextField tSinistra = new TextField("");
	TextField tCentro = new TextField("");
	TextField tDestro = new TextField("");
	Button bTrovaTipo = new Button(" trova tipo");
	Label lRisultato = new Label();
	GridPane griglia = new GridPane();


	public void start(Stage finestra) throws Exception {
		griglia.add(tSinistra, 0, 0);
		griglia.add(tDestro, 0, 2);
		griglia.add(tCentro, 0, 1);
		griglia.add(bTrovaTipo, 1, 0);
		griglia.add(lRisultato, 2, 0);
		bTrovaTipo.setOnAction(e -> calcola());


		bTrovaTipo.setMaxWidth(2000);

		Scene scena = new Scene(griglia,400,400);

		finestra.setTitle("Rettangolo");
		finestra.setScene(scena);
		finestra.show();
	}

	public void calcola() {
		double lato1=Double.parseDouble(tSinistra.getText());
		double lato2=Double.parseDouble(tDestro.getText());
		double lato3=Double.parseDouble(tCentro.getText());
		if((lato1+lato2)>lato3 && (lato2+lato3)>lato1 && (lato1+lato3)>lato2){
			lRisultato.setText("il triangolo è un triangolo");
		}else 
			if(lato1==lato2 || lato2==lato3){
			lRisultato.setText("il triangolo è equilatero");
		
			

		}else {
			if(lato1!=lato2 || lato2!=lato3){
				lRisultato.setText("il triangolo è isoscele");


			}else {
				lRisultato.setText("il triangolo è scaleno");
			}
			
		}
	}
}
		


