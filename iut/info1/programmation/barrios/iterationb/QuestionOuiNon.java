/*
 * QuestionOuiNon.java                                   17 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.iterationb;

import java.util.Scanner;

/**
 * Utilisation des boucles itératives
 * @author François de Saint Palais
 */
public class QuestionOuiNon {

    /**
     * Pose un question binaire à l'utilisateur qui repond sur la console,
     * si l'entré est oui, la variable reponse est à true 
     * sinon si l'entrée est non, la variable reponse est à false
     * sinon on recommence deouis le debut
     * @param args inutilisé
     */
    public static void main(String[] args) {

        final String QUESTION = "Oui ou Non ?";
        final String MESSAGE_ERREUR = "Votre réponse est incorrect." 
                                    + " Entrez Oui ou Non.";
        final char AFFIRMATION = 'O';
        final char NEGATION = 'N';

        String reponse;

        boolean reponseOk;

        Scanner analyseurEntree = new Scanner(System.in);

        do {
            System.out.print("\n" + QUESTION);
            reponse = analyseurEntree.next().toUpperCase();
            
            reponseOk = reponse.charAt(0) == AFFIRMATION || reponse.charAt(0) == NEGATION;
            if (!reponseOk) {
                System.out.println(MESSAGE_ERREUR);
                analyseurEntree.nextLine();
            }
        } while (!reponseOk);
        analyseurEntree.close();
        
        System.out.printf("Votre reponse est %b\n", reponse.charAt(0) == AFFIRMATION);

    }
}