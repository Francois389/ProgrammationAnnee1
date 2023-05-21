/*
 * ControlleurPlusieurFenetre.java                                    21 mai 2023
 * IUT de Rodez, info1 2022-2023, aucun copyright ni copyleft
 */
package application.fenetres;

import javafx.fxml.FXML;

/** TODO comment class responsibility (SRP)
 * @author François de Saint Palais
 *
 */
public class ControlleurPlusieurFenetre {

    @FXML
    private void settingsCallback() {
        System.out.println("Settings Cliqué");
    }

    @FXML
    private void infoCallback() {
        System.out.println("info Cliqué");
        ApplicationPlusieurFenetre.changerSceneInfo();
    }
}
