/*
 * dateGregorienne.java                                  04 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.conditionb;

import java.util.Scanner;

/**
 * Utilisation des blocs conditionelles
 * @author François de Saint Palais
 */
public class DateGregorienne {

    /**
     * Demande 3 entier pour le jour, le mois et l'année,
     * vérifie si les entrée sont des entier sinon message d'erreur
     * et vérifie si jour/mois/annee est une date grégorienne correct
     * 
     * Pour simplifier on ne considére que le 19°, le 20° et le 21°
     * siècles
     * Dans un premiers temps, le mois de février n'a que 28 jours
     * Dans un second temps vérifier si l'année est bissextile
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        int jour;
        int mois;
        int annee;
        boolean dateGregorienne = false;
        boolean estBissextile = false;

        Scanner analyseurScanner = new Scanner(System.in); 

        System.out.print("Entrez un numéro de jour : ");
        if (analyseurScanner.hasNextInt()) {
            jour = analyseurScanner.nextInt();

            System.out.print("Entrez un numéro de mois : ");
            if (analyseurScanner.hasNextInt()) {
                mois = analyseurScanner.nextInt();

                System.out.print("Entrez une année : ");
                if (analyseurScanner.hasNextInt()) {
                    annee = analyseurScanner.nextInt();
                    
                    estBissextile = (annee % 4 == 0 && annee % 100 != 0)
                        || annee % 400 == 0;

                    if (1800 < annee && annee < 2099) {
                        if (mois == 2 
                            && 1 <= jour 
                            && jour <= 28 
                            && estBissextile) {
                            dateGregorienne = !dateGregorienne;
                            
                        } else if ( mois == 2 
                                    && 1 <= jour 
                                    && jour <= 29 
                                    && estBissextile){
                            dateGregorienne = !dateGregorienne;

                        } else if ( mois != 2 
                                    && 1 <= mois 
                                    && mois <= 7 
                                    && mois%2 == 0 
                                    && 1 <= jour 
                                    && jour <= 30) {
                            dateGregorienne = !dateGregorienne;

                        } else if ( mois != 2 
                                    && 8 <= mois 
                                    && mois <= 12 
                                    && mois%2 == 1 
                                    && 1 <= jour 
                                    && jour <= 30) {
                            dateGregorienne = !dateGregorienne;

                        } else if ( mois != 2 
                                    && 1 <= mois 
                                    && mois <= 7 
                                    && mois%2 == 1 
                                    && 1 <= jour 
                                    && jour <= 31) {
                            dateGregorienne = !dateGregorienne;

                        } else if ( mois != 2 
                                    && 8 <= mois 
                                    && mois <= 12 
                                    && mois%2 == 0 
                                    && 1 <= jour 
                                    && jour <= 31) {
                            dateGregorienne = !dateGregorienne;
                        }
                    }

                    if (dateGregorienne) {
                        System.out.printf("%02d/%02d/%d " 
                                          + "est une date grégorienne"
                                          , jour, mois, annee);
                    } else {
                        System.out.printf("%02d/%02d/%d" 
                                          + " n'est pas une date grégorienne",
                                           jour, mois, annee);
                    }

                } else {
                    System.out.println("Attention, "
                                       + "il faut entrez un entier.");
                }
            } else {
                System.out.println("Attention, " 
                                   + "il faut entrez un entier.");
            }
        } else {
            System.out.println("Attention, " 
                               + "il faut entrez un entier.");
        }

        analyseurScanner.close();
    }
    
}