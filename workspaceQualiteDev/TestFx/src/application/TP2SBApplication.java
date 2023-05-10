package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class TP2SBApplication extends Application {

	/**
	 * @throws IOException 
	 * 
	 */
	public void start(Stage primaryStage) throws IOException {
		// créaton d'un chargeur de code FXML
		 FXMLLoader chargeurFXML = new FXMLLoader(); 
		 
		 /*
		 * on indique au chargeur quelle est la vue fxml qu'il devra charger :
		 * ici VueExemple1.fxml
		 */
		 chargeurFXML.setLocation(getClass().getResource("TP2SB.fxml")); 

		 /*
		 * création d'un objet de type parent qui est initialisé avec le résultat du 
		 * chargement de la vue FXML. Ou dit autrement le code écrit en FXML est transformé 
		 * en un objet Java
		 */
		 Parent racine = chargeurFXML.load(); 
		 
		 Scene scene = new Scene(racine); 
		 
		 // on définit le titre, la hauteur et la largeur de la fenêtre
		 primaryStage.setTitle("Compter caractères"); 
		 primaryStage.setHeight(300); 
		 primaryStage.setWidth(500); 
		 primaryStage.setScene(scene); 
		 primaryStage.show(); 
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
