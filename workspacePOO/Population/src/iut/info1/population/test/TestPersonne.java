/**
 * TestPersonne.java                       23 mars 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.population.test;


import java.util.Iterator;

import iut.info1.datation.Date;
import iut.info1.population.Personne;

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
        /** Liste de NIR invalide selon l'état français */
        final String[] nirInvalide 
        = {"0",                //Il faut 15 caractère
           "0123456789012345", //Pas plus de 15 caractère
           "00000000000000",   //Invalide
           ""                  //Chaîne vide
           };  
        
        /** Liste de nom invalide selon l'état français */
        final String[] nomInvalide
        = {"",     //Chaîne vide
           "   ",  //N'est composé que d'espace
           "13",   //Un chiffre
           "\"); DROP TABLE USER;" //Injection SQL
           };
        
        /** Liste de prénom invalide selon l'état français */
        final String[] prenomInvalide
        = {"",     //Chaîne vide
           "   ",  //N'est composé que d'espace
           "13",   //Un chiffre
           "\"); DROP TABLE USER;" //Injection SQL
           };
        
        /** Liste de date de naissance invalide*/
        final Date[] dateInvalide
        = {new Date(1, 1, 1850),
           new Date(1,1,2024)
        };
        boolean testReussi = true;
        for (Date date : dateInvalide) {
            for (String nom : nomInvalide) {
                for (String prenom : prenomInvalide) {
                    for (String nir : nirInvalide) {
                        testReussi = testReussi && 
                                     verifierCombinaisonInvalide(nir,nom,prenom,
                                                                 date);
                    }
                }
            }
        }
        
        if (testReussi) {
            System.out.println("Test constructeur Personne invalides reussi");
        } else {
            System.err.println("Echec de test constructeur avec Personne"
                               + "invalide.");
        }
    }
    
    /**
     * Permet de vérifier si la combinaison nir, nom , prenom , dateNaiss 
     * est un etat civil invalide.
     * @return true s'il y a eu génération d'une exception false sinon
     */
    private static boolean verifierCombinaisonInvalide(String nir, String nom, 
                                               String prenom, Date dateNaiss) {
        try {
            new Personne(nir, nom, prenom, dateNaiss);
            System.err.printf("Echec de test pour les valeur : %s, %s, %s, %s%n",
                    nir,nom,prenom,dateNaiss);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }
}
