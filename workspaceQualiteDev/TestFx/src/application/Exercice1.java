/*
 * Affiche la fenêtre par défaut de JavaFX
 * ExempleCours1.java 01/22
 */
package application; 
 
import java.awt.Color;

import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos; 
import javafx.stage.Stage; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.TextField; 
import javafx.scene.control.Label; 
import javafx.scene.layout.BorderPane; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text; 
/**
 * Cette classe est la classe principale d'une application JavaFX.
 * On dit aussi le point d'entrée de l'application, car c'est la première classe qui 
 * sera exécutée au lancement de l'application (car elle hérite de la classe Application).
 * La fenêtre affichée aura pour titre "Première fenêtre JavaFX", une hauteur de 300 pixels
 * et une largeur de 500 pixels
 * @author François de Saint Palais
 *
 */
public class Exercice1 extends Application { 
     @Override
    public void start(Stage primaryStage) { 
        
        // on définit le titre, la hauteur et la largeur de la fenêtre
        primaryStage.setTitle("Convertisseur"); 
        primaryStage.setHeight(300); // l'unité est le pixel
        primaryStage.setWidth(500); 
        
        //Création du Layour racine qui contiendras toute l'interface
        VBox racine = new VBox(20); //20 pixel entre les éléments
        racine.setAlignment(Pos.CENTER); //Les éléments serons centré
        
        //Création des Layout qui contiendront les éléments atomique
        HBox racineHeure = new HBox(10);
        HBox racineMinute = new HBox(10);
        HBox racineResultat = new HBox(10);
        HBox racineBouton = new HBox(20);
        racineHeure.setAlignment(Pos.BASELINE_CENTER);
        racineMinute.setAlignment(Pos.BASELINE_CENTER);
        racineResultat.setAlignment(Pos.BASELINE_CENTER);
        racineBouton.setAlignment(Pos.BOTTOM_RIGHT);
        
        racineBouton.setPadding(new Insets (0,10,0,0));
        
        //Création d'un champs de texte.
        Text titre = new Text("Convertisseur durées heures et minutes");
        titre.setFill(Paint.valueOf("BLUE")); //Titre en bleue
        titre.setFont(new Font("verdana",20));//Le titre seras en police 20, verdana
        
        //On ajoute le titre à la racine 
        racine.getChildren().addAll(titre);
        //On ajoute les Layout à la racine.
        racine.getChildren().addAll(racineHeure,racineMinute,racineResultat,racineBouton);
        
        // création des labels pour les champs de saisie
        Label labelHeures = new Label("Heures :");
        Label labelMinute = new Label("Minutes :");
        Label labelResultatMinute = new Label("En minutes :");
        
        //création des champs de saisie
        TextField saisieMinute = new TextField();
        TextField saisieHeure = new TextField();
        TextField resultatMinute = new TextField();
        
        //L'utilisateur ne pourra pas écrire dans le champs resultatMinute
        resultatMinute.setEditable(false);
        
        //On ajoute les différents champs/label à leur Layout respectif
        racineHeure.getChildren().addAll(labelHeures,saisieHeure);
        racineMinute.getChildren().addAll(labelMinute,saisieMinute);
        racineResultat.getChildren().addAll(labelResultatMinute,resultatMinute);
        
        //Création des boutons
        Button boutonAnnuler = new Button("Annuler");
        Button boutonConvertir = new Button("Convertir");
        
        racineBouton.getChildren().addAll(boutonAnnuler,boutonConvertir);
        
        //On ajoute un écouteur d'événement aux boutons
        boutonAnnuler.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() { 
            @Override
            public void handle(ActionEvent event) { 
            
            saisieHeure.setText("");
            saisieMinute.setText("");
            resultatMinute.setText("");
            } 
        });
        
        boutonConvertir.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int heures;
                int minutes;
                String heuresSaisie;
                String minutesSaisie;

                minutesSaisie = saisieMinute.getText();
                heuresSaisie = saisieHeure.getText();                    
                
                if (minutesSaisie.isEmpty()) {
                    minutes = 0;
                } else {                    
                    try {
                        minutes = Integer.parseInt(minutesSaisie);
                    } catch (NumberFormatException e) {
                        minutes = 0;
                    }      
                }
                
                if (heuresSaisie.isEmpty() ) {                    
                    heures = 0;
                } else {
                    try {
                        heures = Integer.parseInt(heuresSaisie);
                    } catch (NumberFormatException e) {
                        heures = 0;
                    }      
                }
                
                resultatMinute.setText(conversionHHMMDuree(heures, minutes) 
                                       + " minutes");
            }
        });
        
        //On met la racine dans la scène 
        Scene scene = new Scene(racine);
        primaryStage.setScene(scene);
        
        //On demande à ce que la fenêtre soit affichée
        primaryStage.show(); 
    } 
    
    /** TODO comment method role
     * @param heures
     * @param minutes
     * @return La durée en minutes
     */
    protected static int conversionHHMMDuree(int heures, int minutes) {
        return heures * 60 + minutes;
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