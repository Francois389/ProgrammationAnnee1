/*
 * EssaiDate.java                                  08 févr. 2023
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.datation.tests;

import iut.info1.programmation.barrios.datation.Date;

/**
 * Simple mise en œuvre de la classe Date
 *
 * @author François de Saint Palais
 */
public class EssaiDate {

        /**
         * Manipuler quelques dates valides
         *
         * @param args non utilisé
         */
        public static void main(String[] args) {

            Date duJour = new Date(8,2,2023);

            System.out.println("Date défaut = " + duJour);
            System.out.println("Jour  = " + duJour.getJj());
            System.out.println("Mois  = " + duJour.getMm());
            System.out.println("Année = " + duJour.getAaaa());

            try {
                Date bidon = new Date(120,34,2000000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
}
