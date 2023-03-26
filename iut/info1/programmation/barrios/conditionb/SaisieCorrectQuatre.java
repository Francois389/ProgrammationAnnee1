/*
 * SaisieCorrectQuatre.java                              03 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.conditionb;

import java.util.Scanner;

/**
 * Utilisation des blocs conditionnels
 * @author François de Saint Palais
 */
public class SaisieCorrectQuatre {
    
    /**
     * Demande à l'utilisateur 4 entier 
     * et vérifie si l'entrée sont des entier
     * et affiche le minimum parmi les quatre entiers
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        int premier;
        int deuxieme;
        int troisieme;
        int quatrieme;

        int minimum;

        Scanner analyseurEntree = new Scanner(System.in);

        System.out.print("Entrez un entier : ");
        if (analyseurEntree.hasNextInt()) {
            premier = analyseurEntree.nextInt();
            System.out.print("Entrez un entier : ");
            if (analyseurEntree.hasNextInt()) {
                deuxieme = analyseurEntree.nextInt();
                System.out.print("Entrez un entier : ");
                if (analyseurEntree.hasNextInt()) {
                    troisieme = analyseurEntree.nextInt();
                    System.out.print("Entrez un entier : ");
                    if (analyseurEntree.hasNextInt()) {
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
                } else {
                    System.out.println("Attention il faut entrer un entier");
                }
            } else {
                System.out.println("Attention il faut entrer un entier");
            }
        } else {
            System.out.println("Attention il faut entrer un entier");
        }

        
    }

    
}