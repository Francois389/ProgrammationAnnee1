/*
 * Exercice2Restaurant.java                                    15 avr. 2023
 * IUT de Rodez, info1 2022-2023, aucun copyright ni copyleft
 */
package application;

import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos; 
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene; 
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text; 
import javafx.scene.control.CheckBox;

/** TODO comment class responsibility (SRP)
 * @author francois
 *
 */
public class Exercice2Restaurant extends Application{

    /** libellés des différents menu */
    private static final String[] MENU = {"plat du jour", 
    "formule entrée + plat", "formule plat + dessert", 
    "menu complet", "menu excellence"};
    
    /** tarif des différents menus */
    private static final double[] TARIF_MENU = {10.0, 12.0, 12.0, 14.0, 20.0};
    
    /** Tarif de l'apéritif, du café et du thé */
    private static final double[] TARIF_SUPPLEMENT = {4.0, 2.0, 3.0};
    
    /** Tarif pour la boisson d'accompagnement du repas */
    private static final double TARIF_BOISSON = 3.0;

    
    /* non javadoc - @see javafx.application.Application#start(javafx.stage.Stage) */
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calcul prix repas");
        primaryStage.setHeight(300);
        primaryStage.setWidth(500);
        
        VBox racine = new VBox(20);
        
        HBox racineListe = new HBox(10);
        HBox racineBoison = new HBox(10);
        HBox racineChoixBoisson = new HBox(10);
        HBox racineResultat= new HBox(10);
        HBox racineBouton= new HBox(10);
        
        racine.setAlignment(Pos.CENTER);
        racineBouton.setAlignment(Pos.BOTTOM_RIGHT);
        
        racineListe.setPadding(new Insets(0,0,0,10));
        racineBoison.setPadding(new Insets(0,0,0,10));
        racineChoixBoisson.setPadding(new Insets(0,0,0,10));
        racineResultat.setPadding(new Insets(0,0,0,10));
        racineBouton.setPadding(new Insets(0,10,0,0));
        
        Text titre = new Text("Restaurant - Calcul du prix à payer");
        titre.setFill(Paint.valueOf("BLUE"));
        titre.setFont(new Font("verdana",20));
        
        Label menu = new Label("Menu");
        ComboBox choixMenu = new ComboBox();
        choixMenu.getItems().addAll(MENU);
        choixMenu.getSelectionModel().select(0);

        Label questionBoisson = new Label("Boisson avec le repas ?");
        ToggleGroup groupQuestionBoisson = new ToggleGroup();
        RadioButton boissonOui = new RadioButton("Oui");
        RadioButton boissonNon = new RadioButton("Non");
        boissonNon.setToggleGroup(groupQuestionBoisson);
        boissonOui.setToggleGroup(groupQuestionBoisson);
        boissonOui.setSelected(true);
        
        Label choixBoisson = new Label("Autre boisson :");
        CheckBox apero = new CheckBox("Apéro");
        CheckBox cafe = new CheckBox("Café");
        CheckBox the = new CheckBox("Thé");
        CheckBox[] listeAutreBoisson = {apero,cafe,the};
        
        Label resultat = new Label("A payer : ");
        TextField champsResultat = new TextField();
        champsResultat.setEditable(false);
        
        Button btnEffacer = new Button("Effacer");
        Button btnCalculer = new Button("Calculer");
        
        
        btnEffacer.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                choixMenu.getSelectionModel().select(0);
                boissonNon.setSelected(false);
                boissonOui.setSelected(true);
                apero.setSelected(false);
                cafe.setSelected(false);
                the.setSelected(false);
                champsResultat.setText("");
            };
        });
        
        btnCalculer.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            /* non javadoc - @see javafx.event.EventHandler#handle(javafx.event.Event) */
            @Override
            public void handle(ActionEvent arg0) {
                int indexChoixMenu = choixMenu.getSelectionModel().getSelectedIndex();
                double tarifMenu = TARIF_MENU[indexChoixMenu];
                double tarifSupplement = 0;
                for (int i = 0; i < listeAutreBoisson.length; i++) {
                    if (listeAutreBoisson[i].isSelected()) {
                        tarifSupplement += TARIF_SUPPLEMENT[i];
                    }
                }
                double tarifBoisson = boissonOui.isSelected() ? 
                                      TARIF_BOISSON : 0.0;
                champsResultat.setText(tarifMenu + tarifBoisson 
                                       + tarifSupplement + " €");
            }
        
        });
        
        racineListe.getChildren().addAll(menu, choixMenu);
        racineBoison.getChildren().addAll(questionBoisson, boissonOui, boissonNon);
        racineChoixBoisson.getChildren().addAll(choixBoisson,apero,cafe,the);
        racineResultat.getChildren().addAll(resultat, champsResultat);
        racineBouton.getChildren().addAll(btnEffacer, btnCalculer);
        
        racine.getChildren().addAll(titre, racineListe,racineBoison,
                                    racineChoixBoisson,racineResultat,
                                    racineBouton);
        Scene scene = new Scene(racine);
        primaryStage.setScene(scene);
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
