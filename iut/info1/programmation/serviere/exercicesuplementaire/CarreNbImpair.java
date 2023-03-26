/*
 * CarreNbImpair.java                                    18 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.exercicesuplementaire;

import java.util.Scanner;

/**
 * Exercice n°47 à la page 59 du livre "Exercices en Java" de Delannoy, Claude
 * @author François de Saint Palais
 */
public class CarreNbImpair {
    
    /**
     * Demande à l'utilisateur combien de carré de nombre impair il veut afficher.
     * Construit un tableau de carré de nombre impair et l'affiche.
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        Scanner analyseurEntree = new Scanner(System.in);

        int n;
        int[] tableau;
        boolean saisieOk;

        do {
            System.out.print("Combien de carré de nombre impair voulez-vous afficher ? ");
            saisieOk = analyseurEntree.hasNextInt();
            if (saisieOk) {
                n = analyseurEntree.nextInt();
            } else {
                System.out.println("Vous devez saisir un nombre entier.");
                analyseurEntree.next();
                n = 0;
            }
        } while (!saisieOk);
        analyseurEntree.close();

        tableau = new int[n];

        for (int i = 0; i < n; i++) {
            tableau[i] = (2 * i + 1) * (2 * i + 1);
        }

        // Affichage du tableau
        for (int i = 0; i < tableau.length; i++) {
            System.out.printf("%d a pour carré %d%n", 2 * i + 1, tableau[i]);
        }


    }
}
