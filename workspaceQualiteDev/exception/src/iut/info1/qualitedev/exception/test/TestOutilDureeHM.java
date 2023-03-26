/*
 * Classe permettant de tester les méthodes de la classe OutilDureeHM
 * TestOutilDureeHM.java                               11/21
 */

package iut.info1.qualitedev.exception.test;

import iut.info1.qualitedev.exception.OutilDureeHM;
import java.util.Scanner;

/**
 * Cette classe contient une méthode (au moins) pour tester chacune des méthodes
 * de la classe OutilDureeHM
 * @author INFO1
 * @version 1.0
 *
 */
public class TestOutilDureeHM {
    
    
    /** Objet Scanner pour les saisies au clavier */
    private static  Scanner  entree = new Scanner(System.in);
    
    
    /** Exemples de durées valides */
    private static final int[][] DUREE_VALIDE = { {10, 25}, {9, 0}, {21, 59}, {23, 12}, 
                    {23, 59}, {0, 45}, {0, 0}, {24, 25}, {56, 15}};
    
    
    /** Exemples de durées invalides */
    private static final int[][] DUREE_INVALIDE = { {-1, 12}, {-5, 7}, 
                      {9, -1}, {21, -15}, {23, 60}, {23, 70}, 
                      {50, 145}, {50, -5}, {-1, 33}, {-10, 36}};
    
    
    /** Tableau contenant des durées valides et d'autres invalides */
    private static final int[][] DUREE = { {10, 25}, {9, 0}, {-1, 12}, {21, 59}, 
            {23, 12}, {21, -15},  {23, 59}, {0, 45}, {50, 145}, {0, 0}, {24, 25}, 
            {-1, 33}, {56, 15}, {2000, 0}};
    
    
    /** Duree de référence utilisée dans les tests */
    private static final int[]  REFERENCE = {2, 40};
    
    
    /** Duree à comparer à d'autres durées pour le test d'égalité */
    private static final int[]  A_COMPARER = {21, 59};
    
    
    
    /* *******************   1 méthode outil pour gérer les tests   ******************/
    
    /**
     * Affiche le résultat d'un test : le nombre de tests réussis et le 
     * nombre de tests total
     * @param nbTestTotal       nombre total de tests effectués
     * @param nbTestOk          nombre de tests réussis
     */
    private static void afficherResultTest(int nbTestTotal, int nbTestOk) {
        System.out.println(nbTestOk + " test(s) ont réussi sur un total de "
                + nbTestTotal + " tests réalisés.\n   ==>  "
                + ((nbTestOk == nbTestTotal) ?
                        "Tous les tests sont OK" 
                        : "Au moins un test a échoué.") + "\n");
    }
    
    
    /* ************************   test de la méthode estValide   **********************/
    /**
     * Test de la méthode estValide
     * La méthode estValide est appliquée aux durées du tableau DUREE_VALIDE.
     * Normalement toutes ces durées sont valides.
     * Elle est ensuite appliquée à toutes les durées du tableau DUREE_INVALIDE.
     * Normalement aucune n'est valide.
     */
    public static void testEstValide() {
        int testCorrect;        // nombre de tests corrects        
        System.out.println("""


                Test de la méthode de estValide
                --------------------------------
                """);
        
        // tests avec des durées valides
        testCorrect = 0;
        for (int[] ints : DUREE_VALIDE) {
            if (OutilDureeHM.estValide(ints)) {
                testCorrect++;
            } else {
                System.out.println("Résultat inattendu : " + ints[0]
                        + " h " + ints[1]
                        + " m   a été considérée comme invalide.");
            }
        }
        // résultat du test avec des durées valides
        System.out.print("Test avec des durées valides : ");        
        afficherResultTest(DUREE_VALIDE.length, testCorrect);
        
        // tests avec des durées invalides        
        testCorrect = 0;
        for (int[] ints : DUREE_INVALIDE) {
            if (!OutilDureeHM.estValide(ints)) {
                testCorrect++;
            } else {
                System.out.println("Résultat inattendu : " + ints[0]
                        + " h " + ints[1]
                        + " a été considérée comme valide.");
            }
        }
        
        // résultat du test avec des durées invalides
        System.out.print("Test avec des durées invalides : ");
        afficherResultTest(DUREE_INVALIDE.length, testCorrect);
                
    }
    
    
    
    
    /* ************************   tests de la méthode afficher   **********************/
    /**
     * Test de la méthode afficher 
     * Premier test à effectuer : très simple
     */
    public static void testAfficherSimplifie() {
        final int[] VALIDE = {12, 25};
        final int[] INVALIDE = {12, 256};
        
        System.out.println("""

                Test de la méthode de afficher (test préalable très simple)
                -----------------------------------------
                """);
        try {
            // test avec une durée valide
            System.out.print("Exemple d'affichage d'une durée valide :  ");
            OutilDureeHM.afficher(VALIDE);
            
            // test avec une durée invalide
            System.out.print("\nExemple d'affichage d'une durée invalide :  ");
            OutilDureeHM.afficher(INVALIDE);

        } catch (IllegalArgumentException e) {
            System.out.println("""


                    Test correct pour l'affichage d'une durée invalide.
                    Le message d'erreur est le suivant : La durée à afficher est invalide""");
        }
        
        

    }
    
    /**
     * Test de la méthode afficher 
     * Les durées du tableau DUREE sont affichées seulement si elles sont valides
     */
    public static void testAfficher() {
        
        System.out.println("""


                Test de la méthode de afficher
                -----------------------------------------------
                """);
        
        System.out.println("\nExemples d'affichage de durées valides :  \n");

        for (int[] ints : DUREE) {
            try {
                OutilDureeHM.afficher(ints);
            } catch (IllegalArgumentException e) {
                /* empty block */
            }
        }
        
        
        System.out.println("\n\nTentative d'affichage de toutes les durées : \n");
        // TODO : compléter

        for (int i = 0; i < DUREE.length; i++) {
            try {
                OutilDureeHM.afficher(DUREE[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(  " ==> Impossible d'afficher la durée " 
                                   + "située à l'indice" + i 
                                   + ". Elle n'est pas valide.");
            }
        }
    }
    
    
    
    
    /* **********   tests des méthodes qui effectuent des sommes   **************/
    /**
     * Test de la méthode somme2Durees 
     * TODO : compléter
     */
    public static void testSomme2Durees() {  
        int[] result;
        int calculImpossible;
        
        System.out.println("""


                Test de la méthode de somme2Durees
                ---------------------------------------------------
                """);
        
        System.out.print("\n==> TEST 1 - Ajout de la durée ");
        OutilDureeHM.afficher(REFERENCE);
        System.out.println(" à des durées valides: \n");
        for (int[] ints : DUREE_VALIDE) {
            try {
                result = OutilDureeHM.somme2Durees(REFERENCE, ints);
                System.out.printf("%s + %s = %s\n",
                        OutilDureeHM.dureeToString(REFERENCE),
                        OutilDureeHM.dureeToString(ints),
                        OutilDureeHM.dureeToString(result));

            } catch (IllegalArgumentException e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
        }


        System.out.print("\n==> TEST 2 -  Ajout de la durée ");
        OutilDureeHM.afficher(REFERENCE);
        System.out.println(" à des durées invalides: \n");
        for (int[] ints : DUREE_INVALIDE) {
            try {
                result = OutilDureeHM.somme2Durees(REFERENCE, ints);
                System.out.printf("%s + %s = %s\n",
                        OutilDureeHM.dureeToString(REFERENCE),
                        OutilDureeHM.dureeToString(ints),
                        OutilDureeHM.dureeToString(result));

            } catch (IllegalArgumentException e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
        }
        
        System.out.print("\n==> TEST 3 - Ajout de la durée ");
        OutilDureeHM.afficher(REFERENCE);
        System.out.println(" à différentes durées valides ou invalides: \n");
        calculImpossible = 0;
        for (int[] ints : DUREE) {
            try {
                result = OutilDureeHM.somme2Durees(REFERENCE, ints);
            } catch (IllegalArgumentException e) {
                // TODO: handle exception
                calculImpossible ++;
            }
        } 
        if (calculImpossible != 0) {
            System.out.printf("Au total %d calculs n'ont pas été possibles.",calculImpossible);
        } else {
            System.out.println("Tout les calculs ont été possibles.");
        }
        
    }

    
    
    /**
     * Test de la méthode sommeTableDuree
     * TODO : compléter
     */
    public static void testSommeTableDuree() {        
        System.out.println("""


                Test de la méthode de sommeTableDuree
                ---------------------------------------
                """);
        
        System.out.println("==> TEST 1 - Somme de durées valides :");
        // TODO : compléter
        System.out.println("La somme est égale à : "
                           + OutilDureeHM.dureeToString(OutilDureeHM.sommeTableDuree(DUREE_VALIDE)));

        System.out.println("\n\n==> TEST 2 -  Somme de durées invalides :  ");
        // TODO : compléter
        System.out.println("La somme est égale à : "
                           + OutilDureeHM.dureeToString(OutilDureeHM.sommeTableDuree(DUREE_INVALIDE)));

        System.out.println("\n\n==> TEST 3 -  Somme de durées valides ou invalides :  ");
        // TODO : compléter
        System.out.println("La somme est égale à : "
                           + OutilDureeHM.dureeToString(OutilDureeHM.sommeTableDuree(DUREE)));
    }

    
   
    
    /* *******   tests des méthodes qui effectuent des tests d'égalité   ************/
    
   
    
    /**
     * Test de la méthode egalite 
     * TODO : compléter
     */
    public static void testEgalite() {
        int comparaisonImpossible;

        System.out.println("""

                Test de la méthode Egalite
                --------------------------
                """);
        
        System.out.print("Comparaison de la durée ");
        OutilDureeHM.afficher(A_COMPARER);
        System.out.println(" à différentes durées valides ou invalides: \n");
        // TODO
        comparaisonImpossible = 0;
        for (int[] duree : DUREE) {
            try {
                if (OutilDureeHM.egalite(A_COMPARER, duree)) {
                    System.out.printf("Égalité avec %s\n",
                            OutilDureeHM.dureeToString(duree));
                } else {
                    System.out.printf("Différence avec %s\n",
                            OutilDureeHM.dureeToString(duree));
                }
            } catch (IllegalArgumentException e) {
                comparaisonImpossible ++;
            }
        }
        if (comparaisonImpossible != 0) {
            System.out.printf("\nAu total %d comparaisons n'ont pas été possibles.",comparaisonImpossible);
        }
          
    }

    /**
     * Test de la methode egaliteTrois
     */
    public static void testEgaliteTrois() {
        int resultat;
        int aucuneEgalite;
        int deuxDureesEgales;
        int comparaisonImpossible;
        System.out.println("""


                Test de la méthode EgaliteTrois
                -------------------------------
                """);

        System.out.print("Comparaison de la durée ");
        OutilDureeHM.afficher(A_COMPARER);
        System.out.println(" à différentes durées valides ou invalides: \n");

        aucuneEgalite = 0;
        deuxDureesEgales = 0;
        comparaisonImpossible = 0;
        for (int[] ints : DUREE) {
            for (int[] duree : DUREE) {
                try {
                    resultat = OutilDureeHM.egaliteTrois(A_COMPARER, duree, ints);
                    if (resultat == 1) {
                        System.out.printf("Les durées %s, %s et %s sont égales\n",
                                OutilDureeHM.dureeToString(duree),
                                OutilDureeHM.dureeToString(ints),
                                OutilDureeHM.dureeToString(A_COMPARER));

                    } else if (resultat == 2) {
                        deuxDureesEgales++;
                    } else {
                        aucuneEgalite++;
                    }
                } catch (IllegalArgumentException e) {
                    comparaisonImpossible ++;
                }
            }
        }
        if (deuxDureesEgales != 0) {
            System.out.printf("\nAu total %d trios n'on que deux membres egaux.",deuxDureesEgales);
        }
        if (aucuneEgalite != 0) {
            System.out.printf("\nAu total %d trios sont complétement différent.",aucuneEgalite);
        }
        if (comparaisonImpossible != 0) {
            System.out.printf("\nAu total %d comparaisons n'ont pas été possibles.",comparaisonImpossible);
        }
    }
    
    
    /**
     * Programme principal qui lance les méthodes de test
     * @param args  argument non utilisé
     */
    public static void main(String[] args) {
        System.out.println("""
                -----------------------------------------------
                     TESTS DE LA CLASSE  OUTIL DUREE\s
                -----------------------------------------------
                """);
        
         testEstValide();

         testAfficher();

        testSomme2Durees();

        testSommeTableDuree();

        testEgalite();

        testEgaliteTrois();
    }
}
