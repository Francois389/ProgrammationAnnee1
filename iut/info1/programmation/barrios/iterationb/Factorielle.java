/*
 * Factorielle                                           20 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.iterationb;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Etude du calcul itératif d'une suite récurrente : la factorielle.
 * <p>
 * La factorielle d'un entier naturel rang est : 
 * <ul>
 *     <li>rang! = le nombre de permututations de rang éléments</li>
 *     <li>rang! = 1 x 2 x 3 x ... x rang-1 x rang
 *         avec 0! = 1! = 1 </li>
 * </ul>
 * @author François de Saint Palais
 */
public class Factorielle {

    /**
     * Demande à l'utilisateur un entier,
     * si la saisie de l'utilisateur est incorrecte, redemander
     * si la saisie de l'utilisateur est correct, alors 
     * calculer la factorielle de l'entier.
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        Scanner analyseurEntree = new Scanner(System.in);

        final String MESSAGE_ERREUR = "Erreur de saisie, veuillez saisir un entier naturel";

        boolean saisieIncorrect;

        int entierUtilisateur;

        long factorielle;
        long nbIterations;


        saisieIncorrect = true;  //initialisation pour le compilateur
        entierUtilisateur = -1;  //nombre pour factorielle impossible
        while (saisieIncorrect) {
            out.print("Entrez un entier naturel : ");
            if (analyseurEntree.hasNextInt()) {
                if (0 <= entierUtilisateur) {
                    saisieIncorrect = false;
                    entierUtilisateur = analyseurEntree.nextInt();
                    analyseurEntree.close();
                } else {
                    out.println(MESSAGE_ERREUR);
                } 
            } else {
                out.println(MESSAGE_ERREUR);
                analyseurEntree.next();
                analyseurEntree.nextLine();
            }
        }

        factorielle = 1;  //initialisation pour le compilateur
        nbIterations = entierUtilisateur;
        while (nbIterations != 0 && factorielle >= 0) {
            factorielle *= nbIterations;
            nbIterations --;
        }
        out.printf("La factorielle de %d est égale à %d",
                          entierUtilisateur, factorielle);
    }
    
}
