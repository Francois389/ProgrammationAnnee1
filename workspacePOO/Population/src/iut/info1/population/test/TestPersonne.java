/**
 * TestPersonne.java                       23 mars 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.population.test;

/**
 * Test unitaire de la Classe Personne.
 * @author François de Saint Palais
 */
public class TestPersonne {

    /**
     * 
     * @param args inutilisé
     */
    public static void main(String[] args) {
        testPersonneNonOk();
        testPersonneOk();
    }

    private static void testPersonneOk() {
        
    }

    private static void testPersonneNonOk() {
        final String[] nirInvalide 
        = {"0",                //Il faut 15 caractère
           "0123456789012345", //Pas plus de 15 caractère
           "00000000000000",   //Invalide
           ""                  //Chaîne vide
           };  
        
        final String[] nomInvalide
        = {"",     //Chaîne vide
           "   ",  //N'est composé que d'espace
           "13",   //Un chiffre
           "\"); DROP TABLE USER;" //Injection SQL
           };
        
        final String[] prenomInvalide
        = {"",     //Chaîne vide
           "   ",  //N'est composé que d'espace
           "13",   //Un chiffre
           "\"); DROP TABLE USER;" //Injection SQL
           };
        
        final String[] dateInvalide
        = {
                
        };
    }
}
