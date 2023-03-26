/*
 * NombrePremier.java                                    14 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.iteration2s;

import java.util.Scanner;

/**
 * Ce programme determine si un nombre entier donné par l'utilisateur
 * est premier ou pas.
 * @author François de Saint Palais
 */
public class NombrePremier {
    
    /**
     * Programme principal
     * @param args inutilisé
     */
    public static void main(String[] args) {
        Scanner analyseurEntree = new Scanner(System.in);

        int nombre,
            diviseur;

        System.out.print("Entrez un nombre : ");
        nombre = analyseurEntree.nextInt();
        analyseurEntree.close();

        if (nombre < 0) {
            System.out.println("Le programme ne gére pas les nombres negatifs.");
        } else if (nombre == 0 || nombre == 1) {
            System.out.println(nombre + " n'est pas premier.");
        } else if (nombre == 2) {
            System.out.println(nombre + " est premier.");
        } else {
            diviseur = 2;
            while ((nombre % diviseur != 0) && (diviseur * diviseur < nombre)) {
                diviseur = diviseur + 1;
            }
            if (nombre % diviseur != 0) {
            System.out.println(nombre + " est premier.");
            } else {
            System.out.println(nombre + " n'est pas premier.");
            }
        }
    }
}
