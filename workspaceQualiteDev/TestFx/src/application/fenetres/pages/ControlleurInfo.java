/*
 * ControlleurPlusieurFenetre.java                                    21 mai 2023
 * IUT de Rodez, info1 2022-2023, aucun copyright ni copyleft
 */
package application.fenetres.pages;

import application.fenetres.ApplicationPlusieurFenetre;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

/** TODO comment class responsibility (SRP)
 * @author François de Saint Palais
 *
 */
public class ControlleurInfo {

    @FXML
    private Text paragraphe;
    
    @FXML
    private void retour() {
        ApplicationPlusieurFenetre.changerScene();
    }
    
    @FXML
    private void initialize() {
       String duTexte;
       duTexte = 
       "Eclipse IDE for Enterprise Java and Web Developers (includes Incubating"
       + " components)\r\n"
       + "\r\n"
       + "Version: 2023-03 (4.27.0)\r\n"
       + "Build id: 20230309-1520\r\n"
       + "\r\n"
       + "(c) Copyright Eclipse contributors and others 2000, 2023.\nAll rights"
       + " reserved. Eclipse and the Eclipse logo are trademarks of the Eclipse"
       + " Foundation, Inc., https://www.eclipse.org/.\nThe Eclipse logo cannot"
       + " be altered without Eclipses permission.\nEclipse logos are provided"
       + " for use under the Eclipse logo and trademark guidelines, "
       + "https://www.eclipse.org/logotm/.\nOracle and Java are trademarks or "
       + "registered trademarks of Oracle and/or its affiliates.\nOther names "
       + "may be trademarks of their respective owners.\r\n"
       + "\r\n"
       + "This product includes software developed by other open source "
       + "projects including the Apache Software Foundation, "
       + "https://www.apache.org/.";
       paragraphe.setText(duTexte);
    }
}
