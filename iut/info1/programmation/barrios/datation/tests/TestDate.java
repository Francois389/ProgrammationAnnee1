/*
 * TestDate.java                                         08 mars 2023
 * IUT de Rodez, pas de copyright, pas copyleft
 */

package iut.info1.datation.tests;

import iut.info1.datation.Date;

/**
 * Test unitaire (sans JUnit) de iut.info1.programmation.barrios.datation.Date
 * @author François de Saint Palais
 *
 */
public class TestDate {

	public static void main() {
	    testDateNotOk();
	    testDateOk();
	}

    private static void testDateOk() {
        // TODO Auto-generated method stub
        System.out.println("Test constructeur Date(int, int, int) invalide");
        
    }

    private static void testDateNotOk() {
        // TODO Auto-generated method stub
        boolean testReussi;
        try {
            new Date(1,1,1850);
            testReussi = true;
        } catch (IllegalArgumentException e) {
            testReussi = false;
        }
        if (testReussi) {
            System.out.println("Test reussi");
        }
    }
}
