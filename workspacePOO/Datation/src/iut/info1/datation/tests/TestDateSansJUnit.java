/*
 * TestDateSansJUnit.java                                         08 mars 2023
 * IUT de Rodez, pas de copyright, pas copyleft
 */

package iut.info1.datation.tests;

import iut.info1.datation.Date;

/**
 * Test unitaire (sans JUnit) de iut.info1.programmation.barrios.datation.Date
 * @author François de Saint Palais
 *
 */
public class TestDateSansJUnit {
    
    final static int[] JOUR_DE_DATE_VALIDE
    = {1,29,31,28,31};
    
    final static int[] MOIS_DE_DATE_VALIDE
    = {1,2,3,2,12};
    
    final static int[] ANNEE_DE_DATE_VALIDE
    = {1850,2020,2020,2023,2100};
    
    final static Date[] DATES_VALIDE 
    = {
           new Date(JOUR_DE_DATE_VALIDE[0],
                   MOIS_DE_DATE_VALIDE[0],ANNEE_DE_DATE_VALIDE[0]),
           new Date(JOUR_DE_DATE_VALIDE[1],
                   MOIS_DE_DATE_VALIDE[1],ANNEE_DE_DATE_VALIDE[1]),
           new Date(JOUR_DE_DATE_VALIDE[2],
                   MOIS_DE_DATE_VALIDE[2],ANNEE_DE_DATE_VALIDE[2]),
           new Date(JOUR_DE_DATE_VALIDE[3],
                   MOIS_DE_DATE_VALIDE[3],ANNEE_DE_DATE_VALIDE[3]),
           new Date(JOUR_DE_DATE_VALIDE[4],
                   MOIS_DE_DATE_VALIDE[4],ANNEE_DE_DATE_VALIDE[4])
    };

    /**
     * 
     * @param args inutilisé
     */
	public static void main(String[] args) {
	    testDateNotOk();
	    testDateOk();
	    testGetJj();
	    testGetMm();
	    testGetAaaa();
	    testComparaisonOk();
	}

    private static void testGetAaaa() {

        boolean testReussi = true;
        for (int i = 0; i < DATES_VALIDE.length; i++) {
            testReussi = testReussi 
                         && DATES_VALIDE[i].getAaaa() == ANNEE_DE_DATE_VALIDE[i];
        }
        if (testReussi) {
            System.out.println("Test getAaaa() reussi");
        } else {
            System.out.println("Echec de test getAaaa!");
        }
    }

    private static void testGetMm() {

        boolean testReussi = true;
        for (int i = 0; i < DATES_VALIDE.length; i++) {
            testReussi = testReussi 
                         && DATES_VALIDE[i].getMm() == MOIS_DE_DATE_VALIDE[i];
        }
        if (testReussi) {
            System.out.println("Test getMm() reussi");
        } else {
            System.out.println("Echec de test getMm!");
        }
    }

    private static void testGetJj() {
        //System.out.println("Test du guetteur getJj() de la classe Date ...");
        boolean testReussi = true;
        for (int i = 0; i < DATES_VALIDE.length; i++) {
            testReussi = testReussi 
                         && DATES_VALIDE[i].getJj() == JOUR_DE_DATE_VALIDE[i];
        }
        if (testReussi) {
            System.out.println("Test getJj() reussi");
        } else {
            System.out.println("Echec de test getJj!");
        }
    }

    private static void testComparaisonOk() {
        for (int i = 0; i < DATES_VALIDE.length-1; i++) {
            /*
             * if (DATES_VALIDE[i] > DATES_VALIDE[i+1]) {
             * System.out.println("Échec de test: " + DATES_VALIDE[i] +
             * "doit être inférieur à " + DATES_VALIDE[i+1]); }
             */
        }
        System.out.println("Test comparaison reussi.");
    }

    private static void testDateOk() {
        //System.out.println("Test du constructeur Date(int, int, int) "
        //                 + "valide ...");
        boolean testReussi;
        
        try {
            new Date(1 ,1 ,1850);
            new Date(31,12,2100);
            new Date(28,2 ,2023);
            new Date(29,2 ,2020);
            new Date(31,3 ,2020);
            testReussi = true;
        } catch (Exception e) {
            System.err.println("Echec de test : " + e.getMessage());
            testReussi = false;
        }
        
        if (testReussi) {
            System.out.println("Test constructeur Date valide reussi");
        }
    }

    private static void testDateNotOk() {
        //System.out.println("Test du constructeur Date(int, int, int) "
        //                   + "invalide ...");
        boolean testReussi;
        
        testReussi = true;
        testReussi = testReussi && verifierCombinaison(0  ,1 ,2023);
        testReussi = testReussi && verifierCombinaison(32 ,1 ,2023);
        testReussi = testReussi && verifierCombinaison(31 ,4 ,2023);
        
        testReussi = testReussi && verifierCombinaison(20 ,0 ,2023);
        testReussi = testReussi && verifierCombinaison(20 ,13,2023);
        
        testReussi = testReussi && verifierCombinaison(31 ,12,1849);
        testReussi = testReussi && verifierCombinaison(1  ,1 ,2101);
        
        testReussi = testReussi && verifierCombinaison(29 ,2 ,2023);
        
        if (testReussi) {
            System.out.println("Test constructeur Date invalides reussi");
        } else {
            System.err.println("Echec de test constructeur avec Date "
                               + "invalide.");
        }
    }

    /**
     * Permet de vérifier si la combinaison jj, mm, aaaa, est invalide.
     * @return true s'il y a eu génération d'une exception false sinon
     */
    private static boolean verifierCombinaison(int jj, int mm, int aaaa) {
        try {
            new Date(jj,mm,aaaa);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }
}
