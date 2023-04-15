/*
 * Classe de test des méthodes de la classe OutilHoraire
 * TestOutilHoraire.java                                            04 mars 2023
 */
package iut.info1.qualitedev.gestiontest.horaire.test;

import java.util.Scanner;

import static iut.info1.qualitedev.gestiontest.horaire.OutilHoraireEr2.estChiffre;
import static iut.info1.qualitedev.gestiontest.horaire.OutilHoraireEr2.estHoraireValide;


/**
 * Classe de tests unitaires qui contient les méthodes de test 
 * des méthodes de la classe OutilHoraire.
 * 
 * La classe contient 2 méthodes générales :
 * <ul>
 *     <li>l'une qui affiche un texte de synthèse indiquant le nombre de tests
 *      corrects par rapport à un nombre total de test</li>
 *     <li> l'autre qui invite l'utilisateur à taper sur 'entrée' 
 *      pour continuer</li>
 *            
 * @author François de Saint Palais
 * @version 1.0
 */
public class OutilHoraireTest {
    
    
    /** Objet Scanner pour effectuer les saisies au clavier */
    private static Scanner entree = new Scanner(System.in);
    
    private static String LIGNE
    = "------------------------------";
    
    private static String ERREUR_TEST_CHIFFRE
    = "Echec : la méthode a détecté que %c n'est pas un chiffre.\n";
    
    private static String ERREUR_TEST_NON_CHIFFRE
    = "Echec : la méthode a détecté que %c est un chiffre.\n";
    
    private static String ERREUR_TEST_HORAIRE
    = "Résultat inattendu : %s a été considérée comme invalide.\n";
    
    private static String ERREUR_TEST_HORAIRE_INVALIDE
    = "Résultat inattendu : %s a été considérée comme valide.\n";
    

    /* ======================================================================== */
    /*                                  Jeux de tests                           */
    /* ======================================================================== */
   
    
    /* --------------------  Jeux de test méthode estChiffre ------------------ */
    
    /** jeu de test pour la méthode estChiffre : valeurs correctes */
    private static final char[] CHIFFRE 
    = { '0', '1', '2', '3', '4', '5','6', '7', '8', '9'}; 
    /** jeu de test pour la méthode estChiffre : valeurs incorrectes */
    private static final char[] NON_CHIFFRE
    = {' ', '!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', 
       '.', '/',':', ';', '<', '=', '>', '?', '@', 'A', 'B', 'C', 'D', 'E', 'F',
       'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R','S', 'T', 'U',
       'V', 'W', 'X', 'Y', 'Z', '[', '\\', ']', '^', '_', '`', 'a', 'b', 'c', 
       'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
       's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '{', '|', '}', '~'}; 

    
    /* --------------------  Jeux de test méthode estValide ------------------ */
    /** jeu de test avec des chaînes valides (pour un horaire) */
    private static final String[] HORAIRE_VALIDE = {"00h00", "23h59","12h30"} ;

    /** jeu de test avec des chaînes invalides (pour un horaire) */
    private static final String[] HORAIRE_INVALIDE 
    = {"00H00", "23H59","12H30",
       "00 00", "23 59","12 30",
       "00:00", "23:59","12:30",
       ""     , "     ","24h00",
       "23h60","50h80"};
    
    
    /* ------------  Jeux de test méthodes de conversion ------------------ */
    
   
  
    
    /* ======================================================================== */
    /*                 2 méthodes outils pour gérer les tests                   */
    /* ======================================================================== */
   
    
    /**
     * Demande à l'utilisateur d'appuyer sur entrée pour continuer
     */
    @SuppressWarnings("unused")
    private static void continuer() {
        System.out.println("\n\n\nAppuyer sur entrée pour continuer les tests.") ;
        entree.nextLine();
        System.out.println("\n\n");
    }
    
    
    /**
     * Affiche le résultat d'un test : le nombre de tests réussis et le 
     * nombre de tests total
     * @param nbTestTotal       nombre total de tests effectués
     * @param nbTestOk          nombre de tests réussis
     */
    private static void afficherResultatTest(int nbTestTotal, int nbTestOk) {
        System.out.println(nbTestOk + " test(s) ont réussi sur un total de "
                + nbTestTotal + " tests réalisés.\n   ==>  "
                + ((nbTestOk == nbTestTotal) ?
                        "Tous les tests sont OK" 
                        : (nbTestTotal - nbTestOk) + " tests ont échoué.") + "\n");
    }
    
    
    /* ======================================================================== */
    /*           Test des méthodes de vérification de validité                  */
    /* ======================================================================== */
    
    /**
     * Test unitaire de la méthode estChiffre
     */
    private static void testEstChiffre() {
        int testReussi;
        int testTotal;
        System.out.println("Test de la méthode estChiffre\n"+LIGNE);
        
        System.out.println("\t==>a) Tests avec des chiffres :");
        testReussi = 0;
        testTotal = 0;
        for (char caractere : CHIFFRE) {
            testTotal ++;
            if (!estChiffre(caractere)) {
                System.out.printf(ERREUR_TEST_CHIFFRE,caractere);
            } else {
                testReussi++;
            }
        }
        afficherResultatTest(testTotal,testReussi);
        
        System.out.println("\n\n");
        
        System.out.println("\t==>b) Tests autres caractères :");
        testReussi = 0;
        testTotal = 0;
        for (char caractere : NON_CHIFFRE) {
            testTotal ++;
            if (estChiffre(caractere)) {
                System.out.printf(ERREUR_TEST_NON_CHIFFRE,caractere);
            } else {
                testReussi++;
            }
        }
        afficherResultatTest(testTotal, testReussi);
    }
    
    /**
     * Test unitaire de la méthode estHoraireValide
     */
    private static void testEstHoraireValide() {
        int testReussi;
        int testTotal;
        System.out.println("Test de la méthode estHoraireValide\n"+LIGNE);
        
        System.out.println("\t==>a) Tests avec des horaires valides :");
        testReussi = 0;
        testTotal = 0;
        for (String horaire : HORAIRE_VALIDE) {
            testTotal ++;
            if (!estHoraireValide(horaire)) {
                System.out.printf(ERREUR_TEST_HORAIRE,horaire);
            } else {
                testReussi++;
            }
        }
        afficherResultatTest(testTotal,testReussi);
                
        System.out.println("\t==>b) Tests avec des chaînes invalides :");
        testReussi = 0;
        testTotal = 0;
        for (String horaire : HORAIRE_INVALIDE) {
            testTotal ++;
            if (estHoraireValide(horaire)) {
                System.out.printf(ERREUR_TEST_HORAIRE_INVALIDE,horaire);
            } else {
                testReussi++;
            }
        }
        afficherResultatTest(testTotal, testReussi);
    }
    
    
    /* ======================================================================== */
    /*                        Test des méthodes  de conversion                  */
    /* ======================================================================== */
    
    
    
    

    /* ======================================================================== */
    /*                         Test obtention heure courante                    */
    /* ======================================================================== */
    
   
    
    /* ======================================================================== */
    /*                             Test des méthodes de saisie                  */
    /* ======================================================================== */
    
    
    /**
     * Programme principal qui lance les méthodes de test
     * @param args  argument non utilisé
     */
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------\n"
                           + "     TESTS DE LA CLASSE  OUTIL HORAIRE \n"
                           + "-----------------------------------------------\n");
        
//        continuer();
        testEstChiffre();
        testEstHoraireValide();
       
    }

}