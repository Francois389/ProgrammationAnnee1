/*
 * ShiFuMi.java                                           04 jan. 2023
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.jeux;

import static java.lang.System.out;
import java.util.Scanner;
 
/**
 * 
 * 
 * @author François de Saint Palais
 */
public class ShiFuMi {
    /**
     * 
     * 
     * @param args inutilisé
     */
    public static void main (String[] args) {
        
        final char CISEAUX = 'C',
                   FEUILLE = 'F',
                   PIERRE  = 'P';
        
        final char CHOIX_INCORRECT = 'X';
        
        final String PRESENTATION_JEUX
        = """
          C'est le jeux du ShiFuMi.
          
          
          """;
        
        final String MESSAGE_CHOIX
        = "Faite votre choix parmi C, F et P : ";

        final String MESSAGE_ERREUR
        = "Tapez un caractère O pour oui, N pour Non";
        
        final String MESSAGE_EGALITE
        = "Egalite. Il faut rejouer";
        
        final String CHOIX_POSSIBLE
        = "" + CISEAUX + FEUILLE + PIERRE;

        String saisie;

        char choixJoueur,
             choixPC;

        boolean egalite;
        
        Scanner analyseurEntree = new Scanner(System.in);
        
        do {
            out.print(MESSAGE_CHOIX);
            saisie = analyseurEntree.next() + analyseurEntree.nextLine();
            if (saisie.length() != 1) {
                choixJoueur = CHOIX_INCORRECT;
            }
            else {
                choixJoueur = saisie.charAt(0);
                choixJoueur = Character.toUpperCase(choixJoueur);
                if (CHOIX_POSSIBLE.indexOf(choixJoueur) == -1) {
                    choixJoueur = CHOIX_INCORRECT;
                }
            }
            choixPC = CHOIX_POSSIBLE.charAt((int) (Math.random() * 3));
            
            egalite = choixJoueur == choixPC; 
        } while (egalite);
    }
}