/*
 * TableauxDeFlottant.java                               19 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.exercicesuplementaire;

import java.util.Scanner;

/**
 * Exercice n°48 à la page 59 du livre "Exercices en Java" de Delannoy, Claude
 * @author François de Saint Palais
 */
public class TableauxDeFlottant {
    
    /**
     * Demande à l'utilisateur N flottant.
     * Construit un tableau de flottant 
     * et affiche la moyenne, le minimum et le maximum.
     * @param args inutilisé
     */
    public static void main(String[] args) {
    
        final int N = 5;

        Scanner analyseurEntree = new Scanner(System.in);

        double[] tableau = new double[N];
        double somme = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        boolean saisieOk;

        for (int i = 0; i < N; i++) {
            do {
                System.out.print("Saisissez un flottant : ");
                saisieOk = analyseurEntree.hasNextDouble();
                if (saisieOk) {
                    tableau[i] = analyseurEntree.nextDouble();
                    somme += tableau[i];
                    if (tableau[i] < min) {
                        min = tableau[i];
                    }
                    if (max < tableau[i]) {
                        max = tableau[i];
                    }
                } else {
                    System.out.println("Vous devez saisir" 
                                       + " un nombre flottant.");
                    analyseurEntree.nextLine();
                }
            } while (!saisieOk);
        }
        analyseurEntree.close();
        System.out.printf("Moyenne : %f\n" 
                          + "Minimum : %f\n" 
                          + "Maximum : %f", 
                          somme / N, min, max);
        
    }
}
