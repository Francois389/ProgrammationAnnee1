/*
 * PuisssanceDeX.java                                      06/10/2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.affectation;

import java.util.Scanner;

/**
 * Calcul x à la puissance de p
 * @author François de Saint Palais
 */
public class PuissanceDeX {

    /**
     * Demande à l'utilisateur un nombre réel et un entier,
     * calcul x à la puissance p et
     * l'affiche
     */
    public static void main(String[] args){
        Scanner analyseurLexical = new Scanner(System.in);

        double nbReel;
        int nbExposant;

        System.out.println("Ce programme fait un calcul de puissance.");

        System.out.print("Donnez un nombre réel : ");
        nbReel = analyseurLexical.nextDouble();

        System.out.print("Donnez une puissance : ");
        nbExposant = analyseurLexical.nextInt();


        System.out.println(nbReel + " à la puissance "+ 
                           nbExposant +" est egal à " + 
                           Math.pow(nbReel, nbExposant));
        
        analyseurLexical.close();
    }
}
