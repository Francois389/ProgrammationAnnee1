/*
 * ChasseAuDahu.java                                  14 sept. 2020
 * IUT de Rodez, pas de droits d'auteur
 */
package iut.info1.programmation.barrios.initiationb;

import java.util.Scanner;

/**
 * Jeu de la chasse au "dahu" (ou chasse au "tamarou" sur l'Aubrac)
 * = deviner l'altitude du dahu en le moins de coups possibles
 * @author Frédéric Barrios
 */
public class ChasseAuDahu {

    /**
     * Un premier code source pour illustrer les aspects syntaxiques.
     * <p>
     * Demande à l'utilisateur l'altitude du dahu
     * jusqu'à ce qu'il la trouve. 
     * </p>
     * (E/S textes sur console texte standard)
     * @param args non utilisé
     */
    public static void main(String[] args) {
        
        final int ALTITUDE_MIN =  500; // altitude minimale du dahu
        final int ALTITUDE_MAX = 2500; // altitude maximale du dahu
        
        int altitude;                  // altitude réelle du dahu à deviner
        int proposition;               // proposition de l'utilisateur
        int nbCoups;                   // nombre de coups joués
        
        /* examen du tampon d'entree texte standard */
        Scanner clavier = new Scanner(System.in);
        
        /* présentation du jeu */
        System.out.println("Le dahu est un animal tr�s difficile � rep�rer !");
        System.out.print("Vous devez deviner son altitude au m�tre pr�s ");
        System.out.println("en entrant un entier entre " + ALTITUDE_MIN
                            + " et " + ALTITUDE_MAX);
        
        /* tirage aléatoire de l'altitude */
        altitude =  ALTITUDE_MIN
                  + ((int)(Math.random() * 1.0E9)) % (ALTITUDE_MAX - ALTITUDE_MIN +1);
        
        /* jeu jusqu'au "gain" */
        nbCoups = 0;
        do {
            nbCoups++;
            System.out.print("\nQuelle est l'altitude du dahu en m�tres ? ");
            proposition = clavier.nextInt();
            if (proposition > altitude) {
                System.out.println("Le dahu est plus bas !");
            } else if (proposition < altitude) {
                System.out.println("Le dahu est plus haut !");
            }
        } while (proposition != altitude);
            
        /* fin du jeu : affichage du "score" */
        System.out.println("Vous avez trouv� en " + nbCoups + " coups.");

        clavier.close();
    }

}