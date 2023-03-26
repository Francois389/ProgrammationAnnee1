/*
 * Détermine si un entier est le carré d'un autre
 * EntierCarre.java                                             10/22
 */
package iut.info1.programmation.serviere.condition1s;

import java.util.Scanner;

/**
 * Ce programme effectue la saisie de 2 entiers, et détermine si l'un
 * est le carré de l'autre
 * @author François de Saint Palais
 * @version 1.0
 *
 */
public class EntierCarre {

    /**
     * Programme principal
     * @param args  argument non utilisé
     */
    public static void main(String[] args) {

        // déclaration d'un objet Scanner pour les saisies
        Scanner analyseurEntree = new Scanner(System.in);        
        int a, b;       // 2 entiers donnés par l'utilisateur

        // saisie des 2 entiers
        System.out.print("Donnez un entier : ");
        a = analyseurEntree.nextInt();
        System.out.print("Donnez un autre entier : ");
        b = analyseurEntree.nextInt();

        // on détermine si l'un est le carré de l'autre
        if (Math.pow(a, 2) == b) {
            System.out.printf("%d est le carre de %d",a,b);
        }
        else if (Math.pow(b, 2) == a) {
            System.out.printf("%d est le carre de %d",b,a);
        }
        else {
            System.out.println("Aucun nombre n'est le carré de l'autre.");
        }

        analyseurEntree.close();
    }
}