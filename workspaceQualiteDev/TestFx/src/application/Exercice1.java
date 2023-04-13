/*
 * Affiche la fenêtre par défaut de JavaFX
 * ExempleCours1.java 01/22
 */
package application; 
 
import javafx.application.Application; 
import javafx.stage.*; 
import javafx.scene.*; 
/**
 * Cette classe est la classe principale d'une application JavaFX.
 * On dit aussi le point d'entrée de l'application, car c'est la première classe qui 
 * sera exécutée au lancement de l'application (car elle hérite de la classe Application).
 * La fenêtre affichée aura pour titre "Première fenêtre JavaFX", une hauteur de 300 pixels
 * et une largeur de 500 pixels
 * @author C. Servières
 *
 */
public class Exercice1 extends Application { 
     @Override
    public void start(Stage primaryStage) { 
        
        // on définit le titre, la hauteur et la largeur de la fenêtre
        primaryStage.setTitle("Convertisseur"); 
        primaryStage.setHeight(300); // l'unité est le pixel
        primaryStage.setWidth(500); 
        
        Label invitation = new Label("Heures");
        
       
        // on demande à ce que la fenêtre soit affichée
        primaryStage.show(); 
    } 
    
    /**
    * Programme principal
    * @param args argument non utilisé
    */
    public static void main(String[] args) { 
        
        /* la méthode launch va créer une instance de la classe courante, 
         * donc ExempleCours1
         * Ensuite la méthode start de cette classe est automatiquement appelée 
         */
        launch(args); 
    } 
}