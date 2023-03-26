/*
 * Minimum4Entier.java                              03 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.conditionb;

import java.util.Scanner;

/**
 * Utilisation des blocs conditionnels
 * @author François de Saint Palais
 */
public class Minimum4Entier {
    
    /**
     * Demande à l'utilisateur 4 entier 
     * et vérifie si l'entrée sont des entier
     * et affiche le minimum parmi les quatres
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        int premier;
        int deuxieme;
        int troisieme;
        int quatrieme;

        int minimum;

        boolean entreeOk = false;

        Scanner analyseurEntree = new Scanner(System.in);

        System.out.print("Entrez un entier : ");
        entreeOk = analyseurEntree.hasNextInt();
        premier = 0; //Controle inityialisation
        if (entreeOk ) {
            premier = analyseurEntree.nextInt();
            System.out.print("Entrez un entier : ");
            entreeOk = analyseurEntree.hasNextInt();
        }
        deuxieme = 0; //Controle inityialisation
        if (entreeOk) {
            deuxieme = analyseurEntree.nextInt();
            System.out.print("Entrez un entier : ");
            entreeOk = analyseurEntree.hasNextInt();
        }
        troisieme = 0; //Controle inityialisation
        if (entreeOk ) {
            troisieme = analyseurEntree.nextInt();
            System.out.print("Entrez un entier : ");
            entreeOk = analyseurEntree.hasNextInt();
        }
        quatrieme = 0; //Controle inityialisation
        if (entreeOk) {
            quatrieme = analyseurEntree.nextInt();
            analyseurEntree.close();

            minimum = premier;
            if (deuxieme < minimum) {
                minimum = deuxieme;
            } 
            if (troisieme < minimum) {
                minimum = troisieme;
            } 
            if (quatrieme < minimum) {
                minimum = quatrieme;
            }

            System.out.printf("Le minimum entre %d, %d, %d et %d"
                            + " est %d",
                            premier, deuxieme, troisieme, 
                            quatrieme, minimum);
        } else {
            System.out.println("Attention il faut entrer un entier");
        }

    }
}