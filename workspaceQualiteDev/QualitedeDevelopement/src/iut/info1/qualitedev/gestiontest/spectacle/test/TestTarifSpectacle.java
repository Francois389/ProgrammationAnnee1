/*
 * TestTarifSpectacle.java                                    17 mars 2023
 * IUT de Rodez, info1 2022-2023, aucun copyright ni copyleft
 */

package iut.info1.qualitedev.gestiontest.spectacle.test;

import iut.info1.qualitedev.gestiontest.spectacle.TarifSpectacle;
import iut.info1.qualitedev.gestiontest.spectacle.TarifSpectacleBis;

/** TODO comment class responsibility (SRP)
 * @author francois.desaintpala
 *
 */
public class TestTarifSpectacle {
    
    /** Valeur du code spectacle, 
     * pour le jeu de tests contenant des valeurs correctes 
     * */
    private static char[] SPECTACLE
    = {'T', 'T', 'T', 'T', 'O', 'O', 'O', 'O', 
       'C', 'C', 'C', 'C', 'D', 'D', 'D', 'D'};
    
    /** Valeur du code catégorie, 
     * pour le jeu de tests contenant des valeurs correctes 
     * */
    private static char[] CATEGORIE 
    = {'S','E','M','P',
       'S','E','M','P',
       'S','E','M','P',
       'S','E','M','P'};
    
    /** Valeur du booléen adhérent, 
     * pour le jeu de tests contenant des valeurs correctes 
     * */
    private static boolean[] ADHERENT 
    = {true,false,true,false,
       false,true,false,true,
       true,false,true,false,
       false,true,false,true,};
    
    /** résultats attendus 
     * pour le jeu de tests contenant des valeurs correctes 
     * */
     private static int[] RESULTAT 
     = {14,17,21,25,24,21,28,32,16,19,23,27,21,18,25,26}; 

    /** TODO comment method role
     * @param args
     */
    public static void main(String[] args) {
        testPrixAPayer();
        testPrixAPayerBis();
    }
    
    /** TODO comment method role
     * 
     */
    private static void testPrixAPayerBis() {
        int totalTest = 0;
        int totalTestOk = 0;
        int resultatObtenue;
        for (int i = 0; i < ADHERENT.length; i++) {
            resultatObtenue = TarifSpectacleBis.prixAPayer(SPECTACLE[i],CATEGORIE[i],ADHERENT[i]);
            if (RESULTAT[i] != resultatObtenue) {
                System.out.printf("Echec de test pour les valeur : %c / %c / %b"
                                  + " ==> résultat calculé = %d "
                                  + "resultat attendu = %d%n",
                                  SPECTACLE[i],CATEGORIE[i],ADHERENT[i],
                                  resultatObtenue,RESULTAT[i]);
            } else {
                totalTestOk ++;                
            }
            totalTest ++;
        }
        afficherResultatTest(totalTest, totalTestOk);
        
    }

    /** TODO comment method role
     * 
     */
    private static void testPrixAPayer() {
        int totalTest = 0;
        int totalTestOk = 0;
        int resultatObtenue;
        for (int i = 0; i < ADHERENT.length; i++) {
            resultatObtenue = TarifSpectacle.prixAPayer(SPECTACLE[i],CATEGORIE[i],ADHERENT[i]);
            if (RESULTAT[i] != resultatObtenue) {
                System.out.printf("Echec de test pour les valeur : %c / %c / %b"
                                  + " ==> résultat calculé = %d "
                                  + "resultat attendu = %d%n",
                                  SPECTACLE[i],CATEGORIE[i],ADHERENT[i],
                                  resultatObtenue,RESULTAT[i]);
            } else {
                totalTestOk ++;                
            }
            totalTest ++;
        }
        afficherResultatTest(totalTest, totalTestOk);
    }

    /**
     * Affiche le résultat d'un test : le nombre de tests réussis et le 
     * nombre de tests total
     * @param nbTestTotal       nombre total de tests effectués
     * @param nbTestOk          nombre de tests réussis
     */
    private static void afficherResultatTest(int nbTestTotal, int nbTestOk) {
        System.out.println("\n" + nbTestOk + " test(s) ont réussi sur un total de "
                + nbTestTotal + " tests réalisés.\n   ==>  "
                + ((nbTestOk == nbTestTotal) ?
                        "Tous les tests sont OK" 
                        : (nbTestTotal - nbTestOk) + " test(s) a (ont) échoué.") + "\n");
    }

}
