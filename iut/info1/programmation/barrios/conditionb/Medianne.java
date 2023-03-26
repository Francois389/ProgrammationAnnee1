/*
 * medianne.java                                         04 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.conditionb;

import java.util.Scanner;

/**
 * Utilisation des blocs conditionelles
 * @author François de Saint Palais
 */
public class Medianne {
    

    /**
     * Demande à l'utilisateur trois entier
     * et affiche l'entier médian
     * @param args inutilise
     */
    public static void main(String[] args) {
    
        int premier;
        int deuxieme;
        int troisieme;
        int medianne;

        Scanner analyseuScanner = new Scanner(System.in);

        System.out.print("Entrez un entier : ");
        if (analyseuScanner.hasNextInt()) {
            premier = analyseuScanner.nextInt();
            System.out.print("Entrez un entier : ");

            if (analyseuScanner.hasNextInt()) {
                deuxieme = analyseuScanner.nextInt();
                System.out.print("Entrez un entier : ");

                if (analyseuScanner.hasNextInt()) {
                    troisieme = analyseuScanner.nextInt();

                    //Première proposition
                    if (premier < deuxieme && premier < troisieme) {
                        if (deuxieme < troisieme) {
                            medianne = deuxieme;
                        } else {
                            medianne = troisieme;
                        }
                    } else if (premier > deuxieme && premier > troisieme) {
                        if (deuxieme < troisieme) {
                            medianne = troisieme;
                        } else {
                            medianne = deuxieme;
                        }
                    } else {
                        medianne = premier;
                    }

                    // Deuxième proposition
                    // if (deuxieme < premier && premier < troisieme 
                    //     || (troisieme < premier && premier < deuxieme)) {
                    //     medianne = premier;
                    // } else if (premier < deuxieme && deuxieme < troisieme 
                    //             || (troisieme < deuxieme && deuxieme < premier)) {
                    //     medianne = deuxieme;
                    // } else if (premier < troisieme && troisieme < deuxieme 
                    //             || (deuxieme < troisieme && troisieme < premier)) {
                    //     medianne = troisieme;
                    // }
                    
                    System.out.printf("L'entier médiant de %d, %d, %d est %d",premier, deuxieme, troisieme, medianne);

                } else {
                    System.out.println("Attention il faut entrer un entier.");
                } 
            } else {
                System.out.println("Attention il faut entrer un entier.");
            }
        } else {
            System.out.println("Attention il faut entrer un entier.");
        }

        analyseuScanner.close();
    }
}