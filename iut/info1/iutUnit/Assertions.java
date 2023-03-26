/*
 * Assertions.java                                   06 fev. 2023
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.iutUnit;


/**
 * 
 * 
 * @author François de Saint Palais
 */
public class Assertions {

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
    
    /**
     * Assertion vérifiant si le résultat flottant est égale 
     * au résultat obtenue sans delta de précision 
     * avec les cas particulier suivant :
     * <ul><li>Nan == Nan</li>
     *     <li>0.0 == 0.0 && 0.0 != -0.0</li>
     *     <li>-0.0 == -0.0 && -0.0 != 0.0</li>
     *     <li>+Infinity == +Infinity</li>
     *     <li>-Infinity == -Infinity</li>
     * </ul>
     * @param attendu
     * @param obtenue
     * @param message 
     * @throws Exception
     */
    public static boolean assurerEgalite(float attendue, float obtenue, String message) 
    throws Exception {
        //TODO Ecrire le cops
        throw new Exception("Erreur de test : " + message);
    }
    
}