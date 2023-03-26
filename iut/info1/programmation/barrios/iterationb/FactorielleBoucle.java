/*
 * Factorielle                                           20 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.iterationb;

import java.util.Scanner;

/**
 * Utilisation des boucles itératives, 
 * des blocs conditionelles et
 * des la saisie sur console.
 * @author François de Saint Palais
 */
public class FactorielleBoucle {

    /**
     * Demande à l'utilisateur un entier,
     * si la saisie de l'utilisateur est incorrecte, redemander
     * si la saisie de l'utilisateur est correct, alors 
     * calculer la factorielle de l'entier.
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        boolean saisieIncorrect;
        boolean repetitionFactorielle;
        int entierUtilisateur;
        int factorielle;
        int nbIterations;

        String reponseRepetition;

        Scanner analyseurEntree = new Scanner(System.in);

        repetitionFactorielle = true;
        while (repetitionFactorielle) {
            saisieIncorrect = true;  //initialisation pour le compilateur
            entierUtilisateur = 1;
            while (saisieIncorrect) {
                System.out.print("\nEntrez un entier naturel : ");
                if (analyseurEntree.hasNextInt()) {
                    entierUtilisateur = analyseurEntree.nextInt();
                    if (0 <= entierUtilisateur) {
                        saisieIncorrect = !saisieIncorrect;
                    } else {
                        System.out.println("Attention, vous devez entrez " 
                                        + "un entier naturel.");
                    } 
                } else {
                    System.out.println("Attention, vous devez entrez " 
                                    + "un entier naturel.");
                    analyseurEntree.next();
                    analyseurEntree.nextLine();
                }
            }

            factorielle = 1;  //initialisation pour le compilateur
            nbIterations = entierUtilisateur;
            while (nbIterations != 0) {
                factorielle *= nbIterations;
                nbIterations --;
            }
            System.out.printf("La factorielle de %d est égale à %d\n",
                            entierUtilisateur, factorielle);
            


            do {
                reponseRepetition = analyseurEntree.next();
            } while (reponseRepetition.equals('o') || reponseRepetition.equals('n'));

            saisieIncorrect = true;
            while (saisieIncorrect) {
                System.out.print("Voulez vous une autre factorielle ?" 
                                + " (Oui/Non) :");
                reponseRepetition = analyseurEntree.next();
                if (reponseRepetition.equals("Oui") 
                    || reponseRepetition.equals("oui")) {
                    repetitionFactorielle = true;
                    saisieIncorrect = false;
                } else if (reponseRepetition.equals("Non") 
                        || reponseRepetition.equals("non")) {
                    repetitionFactorielle = false;
                    saisieIncorrect = false;
                } else {
                    System.out.println("Attention votre réponse devras " 
                                        + "étre Oui ou Non");
                    analyseurEntree.next();
                    analyseurEntree.nextLine();
                }
            }
        }
        analyseurEntree.close();
    }
    
}
