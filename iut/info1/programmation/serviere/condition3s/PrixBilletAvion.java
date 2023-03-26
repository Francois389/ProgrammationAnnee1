/*
 * PrixBilletAvion.java                                  18 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.condition3s;

import java.util.Scanner;

/**
 * Utilisation des conditions
 * @author François de Saint Palais
 */
public class PrixBilletAvion {
    



    public static void main(String[] args) {
        // objet Scanner pour les saisies au clavier
        Scanner analyseurEntree = new Scanner(System.in);
        
        final double REDUCTION_MOINS_SEIZE_MOINS_200E = 0.1;
        final double REDUCTION_MOINS_SEIZE_PLUS_200E = 0.15;
        final double REDUCTION_PLUS_SEIZE_PLUS_300E = 0.05;
		
        int ageVoyageur;
        double prixBilletHR;
        double prixAPayer;
        double reductionAccorde;
        
        // saisie des données d'entrées : âge et prix de base du billet
        System.out.print("Donnez l'âge du voyageur : ");
        if (analyseurEntree.hasNextInt()) {
            ageVoyageur = analyseurEntree.nextInt();
            System.out.print("Donnez le prix du billlet : ");
            if (analyseurEntree.hasNextDouble()) {
                prixBilletHR = analyseurEntree.nextDouble();
                if (0 < ageVoyageur && ageVoyageur < 115) {
                    analyseurEntree.close();

                    if (0 < prixBilletHR) {
                        if (ageVoyageur < 26 && prixBilletHR < 200) {
                            reductionAccorde = prixBilletHR * REDUCTION_MOINS_SEIZE_MOINS_200E;
                        } else if (ageVoyageur < 26 && prixBilletHR >= 200) {
                            reductionAccorde = prixBilletHR * REDUCTION_MOINS_SEIZE_PLUS_200E;
                        } else if (ageVoyageur >= 26 && prixBilletHR >= 300) {
                            reductionAccorde = prixBilletHR * REDUCTION_PLUS_SEIZE_PLUS_300E;
                        } else {
                            reductionAccorde = 0.0;
                        }

                        prixAPayer = prixBilletHR - reductionAccorde;
                        System.out.printf("Montant de la réduction accordée .... :" 
                                        + " %.2f euros\n", reductionAccorde);
                        System.out.printf("Prix à payer ........................ :" 
                                        + " %.2f", prixAPayer);
                    } else {
                        System.out.println("Le prix n'est pas valide." 
                                            + " Relancez le programme !");
                    }
                } else {
                    System.out.println("L'âge n'est pas valide." 
                                        + " Relancez le programme !");
                }
            } else {
                System.out.println("Vous n'avez pas saisie un nombre." 
                                    + " Relancez le programme !");        
            }
        } else {
            System.out.println("Vous n'avez pas saisie un entier." 
                             + " Relancez le programme !");
        }
    }
}
