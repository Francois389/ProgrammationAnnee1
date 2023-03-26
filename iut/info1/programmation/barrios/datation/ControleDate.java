/*
 * ControleDate.java                                     14 dec.2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.datation;

import java.util.Scanner;

/**
 * Utilitaires pour gérer des dates grégoriennes
 * dans un période AN_MIN à AN_MAX
 * 
 * @author François de Saint Palais
 */
public class ControleDate {
    /**
     * Tester la validiter d'une combinaison jj/mm/aaaa
     * passée sur la ligne de commande
     * @param args combinaison à tester jj/mm/aaaa (1 seul argument)
     */
    public static void main(String[] args) {
        
        final int CODE_ERREUR_NB_ARGS = 1;

        final String MESSAGE_ERREUR_NB_ARGS
        = "Mauvais nombre d'arguments : 1 seul agument exige";
        final String AIDE
        = "usage java iut.info1.datation.ControleDate jj/mm/aaaa";

        Scanner analyseurArgument;

        /* Combinaison grégorienne à tester */
        int jour;
        int mois;
        int annee;

        //TODO analyser la ligne de commande

        if (args.length != 1) {
            System.err.println(MESSAGE_ERREUR_NB_ARGS);
            System.out.println(AIDE);
            System.exit(CODE_ERREUR_NB_ARGS);
        }
        // else
        analyseurArgument = new Scanner(args[0]);

        if (!analyseurArgument.hasNext(OutilsDate.REGEX_DATE)) {
            System.out.println(args[0] + " n'a pas le format d'une date");
        } else {
            //TODO extraire les netier jj, mm, aaaa
            analyseurArgument.useDelimiter("/");
            jour  = analyseurArgument.nextInt();
            mois  = analyseurArgument.nextInt();
            annee = analyseurArgument.nextInt();
            analyseurArgument.close();

            System.out.printf("\u00c0 tester jour = %d | mois = %d | annee = %d\n\n",
                              jour,mois,annee);
            //TODO Vérifier la validité
            if (OutilsDate.isValide(jour,mois,annee)) {
                System.out.println(args[0] + " est une date correct");
            } else {
                System.out.println(args[0] + " n'est pas une date du calendrier");
            }
        }

    }

    

}