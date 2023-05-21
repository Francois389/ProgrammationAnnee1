/*
 * ApplicationPlusieurFenetre.java                                    21 mai 2023
 * IUT de Rodez, info1 2022-2023, aucun copyright ni copyleft
 */
package application.fenetres;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** 
 * Permet de lancer l'application
 * @author François de Saint Palais
 */
public class ApplicationPlusieurFenetre extends javafx.application.Application{

    static Scene pagePrincipal;
    static Scene pageInfo;
    
    static Stage fenetrePrincipal;
    
    /** TODO comment method role
     * 
     */
    public static void changerScene() {
        fenetrePrincipal.setScene(pagePrincipal);
    }
    
    public static void changerSceneInfo() {
        fenetrePrincipal.setScene(pageInfo);
    }


    public static void main(String[] args) {
        launch(args);
    }

    
    /** TODO comment method role
     * @param lien 
     * @return
     * @throws IOException
     */
    private Parent recupererScene(String lien) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource(lien));
        
        return fxmlLoader.load();

    }

    /* non javadoc - @see javafx.application.Application#start(javafx.stage.Stage) */
    @Override
    public void start(Stage fenetre) throws Exception {
        pagePrincipal = new Scene(recupererScene("VuePlusieurFenetre.fxml"));
        pageInfo = new Scene(recupererScene("pages/VueInfo.fxml"));
        fenetre.setScene(pagePrincipal);
        fenetrePrincipal = fenetre;
        fenetre.show();
    }
    
}
