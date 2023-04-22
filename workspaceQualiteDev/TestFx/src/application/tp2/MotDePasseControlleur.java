/*
 * TP2MotDePasseControlleur.java                                    22 avr. 2023
 * IUT de Rodez, info1 2022-2023, aucun copyright ni copyleft
 * Classe contrôleur qui gère la vue SBMDP.fxml
 */
package application.tp2;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

import application.tp2.MotDePasse;

/**
 * <p> 
 * Classe contrôleur qui gère l'interactivité avec la vue décrite dans le fichier fxml 
 * SBMDP.fxml
 * </p>
 * L'utilisateur peut : 
 * <ul>
 *     <li>
 *         générer un mot de passe, en utilisant la classe 
 *         {@link application.tp2.MotDePasse  MotDePasse}
 *         Il sera affiché dans le Text resultat.
 *     </li>
 *     <li>
 *         effacer le mot de passe générer, 
 *         ce qui remettra l'interface à zéro
 *     </li>
 * </ul>
 *
 * @author François de Saint Palais
 */
public class MotDePasseControlleur {

    /** Text où afficher le résultat */
    @FXML 
    private Text resultat;

    
    @FXML
    private void effacerResultat() {
        System.out.println("Effacer cliqué");
        resultat.setText("?");
    }
    
    @FXML
    private void genererMDP () {
        System.out.println("Générer cliqué");
        MotDePasse motDePasseGenere = new MotDePasse();
        resultat.setText(motDePasseGenere.getMot());
    }
}
