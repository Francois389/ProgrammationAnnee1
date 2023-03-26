/*
 * FactorielleMenu.java                                  07 dec. 2022
 * Iut de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.iterationb;

import java.util.Scanner;

/**
 * 
 */
public class FactorielleMenu {
    
    /**
     * 
     */
    public static void main(String[] args) {
        
        Scanner analyseurEntree = new Scanner (System.in);

        final char QUITTER = 'Q';
        final String ERREUR_SAISIE = "Vous avez entrez un mauvais param\u00e9tre";
        final String MENU = 
                """
                _______________________________________________________________
                |                                                             |
                | R) Entrez un rang                                           |
                | I) Calculer la factorielle du rang en Int                   |
                | L) Calculer la factorielle du rang en Long                  |
                | F) Calculer la factorielle du rang en Float                 |
                | Q) Quitter                                                  |
                |_____________________________________________________________|
                """;

        String reponse;
        
        char choix;


        // choix = 'Q';
        
        do {
            //TODO demander son choix à l'utilisateur
            System.out.println(MENU);
            System.out.print("Entrez votre choix : ");
            reponse = analyseurEntree.next().toUpperCase();
            if (reponse.length() > 1) {
                System.out.println(ERREUR_SAISIE);
                analyseurEntree.nextLine();
                choix = 'x'; //pour le compilateur 
            } else {
                choix = reponse.charAt(0);
                switch (choix) {
                    case 'Q':
                        
                        break;
                    case 'R':
                        System.out.println("Entrer d'un rang");
                        //TODO 
                        break;
                    case 'I':
                        System.out.println("Calcul en Int");
                        //TODO 
                        break;
                    case 'L':
                        System.out.println("Calcul en Long");
                        //TODO 
                        break;
                    case 'F':
                        System.out.println("Calcul en Float");
                        //TODO 
                        break;
                
                    default:
                        System.out.println(ERREUR_SAISIE);
                        break;
                }
            }  

        } while (choix != QUITTER);
        analyseurEntree.close();

    }
}
