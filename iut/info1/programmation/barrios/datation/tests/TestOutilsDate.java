/*
 * TestOutilsDate.java                                   11 jan. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.datation.tests;

import static iut.info1.programmation.barrios.datation.OutilsDate.isValide;

import static iut.info1.iutUnit.Assertions.assurerFaux;
import static iut.info1.iutUnit.Assertions.assurerVrai;

/**
 * Test unitaire de la class OutilsDate dans le package parent
 * 
 * @author François de Saint Palais
 */
public class TestOutilsDate {
    
    public static void main(String[] args) {

        try {
            testIsValide();
        } catch (Exception defautDetecte ) {
            System.err.println(defautDetecte.getMessage());
        }
    }
    
    /**
     * 
     *
     *
     */
    /* package */ static void testIsValide() throws Exception{
        
        assurerFaux(isValide(1,1,-1),"1/1/-1 est non valide.");
        assurerFaux(isValide(1,1,2101),"1/1/2101 est non valide.");
        assurerFaux(isValide(1,0,2023),"1/0/2023 est non valide.");
        assurerFaux(isValide(29, 2, 2023), "29/2/2023 est non valide."); //Année non bissextile
        
        assurerVrai(isValide(1,1,1850),"1/1/1850 est valide.");
        assurerVrai(isValide(1,1,2100),"1/1/2100 est valide.");

        System.out.println("Test isValide() OK");
    }

    /**
     * Assertion vérifiant si le résultat attendue est bien vrai
     * @param obtenu  expression à tester
     * @param message message d'erreur
     * @throws Exception si l'expression n'est pas vrai
     */
    public static void assurerVrai(boolean obtenu, String message) throws Exception {
        
        assurerFaux(!obtenu, message);
    }

    /**
     * Assertion vérifiant si le résultat attendue est bien faux
     * @param obtenu  expression à tester
     * @param message message d'erreur
     * @throws Exception si l'expression n'est pas faux
     */
    public static void assurerFaux(boolean obtenu, String message) throws Exception {
        if (obtenu) {
            throw new Exception("Erreur de test : " + message);
        }
    }
}
