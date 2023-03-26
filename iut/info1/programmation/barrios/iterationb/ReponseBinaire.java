/*
 * ReponseBinaire.java                                   17 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.iterationb;

import java.util.Scanner;

/**
 * Utilisation des boucles itératives
 * @author François de Saint Palais
 */
public class ReponseBinaire {

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

        String reponse;

        boolean reponseInvalide;
        boolean reponseBoolean;
        
        Scanner analyseurEntree = new Scanner(System.in);
        
        reponseInvalide = true; //Initialisation pour le compilateur
        reponseBoolean = false;
        while (reponseInvalide) {
            System.out.print(QUESTION);
            reponse = analyseurEntree.next();
            switch (reponse) {
                case "Oui":
                    reponseBoolean = true;
                    reponseInvalide = !reponseInvalide;
                    analyseurEntree.close();
                    break;
                case "Non":
                    reponseBoolean = false;
                    reponseInvalide = !reponseInvalide;
                    analyseurEntree.close();
                    break;

                default:
                    System.out.println(MESSAGE_ERREUR);
                    analyseurEntree.nextLine();
                    break;
            }
        }
        System.out.printf("Vote reponse est %b", reponseBoolean);

    }

}
