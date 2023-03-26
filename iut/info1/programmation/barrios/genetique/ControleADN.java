/*
 * ControleDate.java                                     14 dec.2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.genetique;

import java.util.Scanner;

/**
 * Utilitaires pour gérer des séquences ADN
 * 
 * @author François de Saint Palais
 */
public class ControleADN {
    
    /**
     * Tester la validité d'une séquence ADN
     * passée sur la ligne de commande
     * @param args combinaison à tester (1 seul argument)
     */
    public static void main(String[] args) {
        
        final int CODE_ERREUR_NB_ARGS = 1;

        final String MESSAGE_ERREUR_NB_ARGS
        = "Mauvais nombre d'arguments : 1 seul agument exige";
        final String AIDE
        = "usage java iut.info1.datation.ControleADN ACGATG";
        final String ERREUR_SAISIE
        = "Sequence saisie invalide";
        

        final char ADENINE  = 'A';
        final char CYTOSINE = 'C';
        final char GUANINE  = 'G';
        final char THYMINE  = 'T';

        String sequenceFournie;
        
        boolean sequenceValide;
        
        char lettreTester;

        //TODO analyser la ligne de commande

        if (args.length != 1) {
            System.err.println(MESSAGE_ERREUR_NB_ARGS);
            System.out.println(AIDE);
            System.exit(CODE_ERREUR_NB_ARGS);
        }

        sequenceFournie = args[0].toUpperCase();
        
        sequenceValide = sequenceFournie.length() % 3 == 0;
        
        for (int position = 0; position < sequenceFournie.length() && sequenceValide; position++) {
            
            lettreTester = sequenceFournie.charAt(position);
            
            sequenceValide =    lettreTester == ADENINE
                             || lettreTester == CYTOSINE
                             || lettreTester == GUANINE
                             || lettreTester == THYMINE;
        }
        if (!sequenceValide) {
            System.out.println(ERREUR_SAISIE);
        } else {
            for (int position = 0; position < sequenceFournie.length(); position++) {
                System.out.print(sequenceFournie.charAt(position));
                if (position % 3 == 0) {
                    System.out.print("\n");
                }
            }
        }
    }
}