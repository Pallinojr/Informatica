package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Bersagli extends Application{
	  	Pane pane = new Pane();
    


    @Override
    public void start(Stage primaryStage) {
      
        Canvas canvas = new Canvas(300, 300);
        pane.addEventHandler(MouseEvent.MOUSE_CLICKED, evento -> gestisciClick(evento));
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Picasso");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
                
    public void gestisciClick(MouseEvent evento){
        double posizioneX = evento.getX();
        double posizioneY = evento.getY();
        Circle pallino = new Circle(7);
       	pane.getChildren().add(pallino);
        pallino.setFill(Color.GREEN);
        pallino.setCenterX(evento.getX());
        pallino.setCenterY(evento.getY());       
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}