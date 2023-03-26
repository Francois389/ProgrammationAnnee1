/*
 * SaisieCorrect.java                                    03 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.conditionb;

import java.util.Scanner;

/**
 * Utilisation des blocs de condition
 * @author François de Saint Palais
 */
public class SaisieCorrectMinimum {
    
    
    /**
     * Demande à l'utilisateur deux entiers
     * si une saisie est incorrecte le programme s'arrête
     * sinon, calcule le minimum et l'affiche
     * @param args inutilisé
     */
    public static void main(String[] args) {

        int premier;
        int deuxieme;

        int minimum;

        Scanner analyseEntree = new Scanner(System.in);

        
        System.out.print("Entrez un premiere valeur : ");
        if (analyseEntree.hasNextInt()) {
            premier = analyseEntree.nextInt();
            System.out.print("Entrez un deuxieme valeur : ");
            if (analyseEntree.hasNextInt()) {
                deuxieme = analyseEntree.nextInt();
                analyseEntree.close();

                if (premier < deuxieme) {
                    minimum = premier;
                } else {
                    minimum = deuxieme;
                }
                System.out.printf("La valeur minimal est %d",minimum);
                
            } else {
                System.out.println("Attention il faut entrer un entier");
            }
        } else {
            System.out.println("Attention il faut entrer un entier");
        }
      
    }
}
