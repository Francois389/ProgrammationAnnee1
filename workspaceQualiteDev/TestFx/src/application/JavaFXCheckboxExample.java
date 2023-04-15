/*
 * testCheckbox.java                                    15 avr. 2023
 * IUT de Rodez, info1 2022-2023, aucun copyright ni copyleft
 */
package application;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;

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
public class JavaFXCheckboxExample extends Application {

    /* non javadoc - @see javafx.application.Application#start(javafx.stage.Stage) */
    @Override
    public void start(Stage s) throws Exception {
      //create label
        Label lb = new Label("Please tick your favorite type of dish ");
        //4 checkboxes
        CheckBox cb1 = new CheckBox("North Indian Veg Dish");
        CheckBox cb2 = new CheckBox("North Indian Non Veg dish");
        CheckBox cb3 = new CheckBox("South Indian Veg Dish");
        CheckBox cb4 = new CheckBox("South Indian Non veg Dish");
        //horizontal box
        HBox r = new HBox();
        //add the label, checkboxes
        r.getChildren().addAll(lb, cb1, cb2, cb3, cb4);
        r.setSpacing(5);
        //create scene
        Scene sc=new Scene(r, 700, 100);
        //set the scene
        s.setScene(sc);
        //set the title
        s.setTitle("CheckBox Sample");
        //display the result
        s.show();
    }
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
