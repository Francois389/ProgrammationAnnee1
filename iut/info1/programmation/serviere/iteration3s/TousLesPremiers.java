
/*
 * TousLesPremiers.java                                  14 dec. 2022
 * IUT de Rodez, pas de droit d'auteur 
 */
package iut.info1.programmation.serviere.iteration3s;

import java.util.Scanner;

/**
 * Ce programme recherche tous les nbs premiers inférieurs ou égaux à une
 * valeur limite entrée par l'utilisateur. Les nbs premiers trouvés seront
 * affichés par ligne de 10.
 * 
 * @author François de Saint Palais
 * @version 1.0
 * 
 */
public class TousLesPremiers {

    /**
     * Programme principal
     * @param args  argument non utilisé
     */
    public static void main(String[] args) {

        /* 
         * Constante égale à la quantité de nbs premiers affichés sur
         * une ligne
         */
        final int NB_PREMIER_LIGNE = 10;
        
        // déclaration d'un objet Scanner pour effectuer les saisies
        Scanner analyseurEntree = new Scanner(System.in);

        int limite,
            diviseur,
            compteur;

        System.out.print("Entrez une valeur limite : ");
        limite = analyseurEntree.nextInt();
        analyseurEntree.close();

        System.out.printf("Les nombres premiers de l'intervalle 0..%d sont :\n",limite);
        compteur = 0;
            for (int nbATester = 0 ; nbATester <= limite; nbATester ++) {

                diviseur = 2;

                while ((nbATester % diviseur != 0) && (diviseur * diviseur < nbATester)) {
                    diviseur ++;
                }

                if (nbATester % diviseur != 0) {
                    compteur ++;
                    System.out.printf("%-3d    ",nbATester);
                }

                if (compteur == NB_PREMIER_LIGNE) {
                    System.out.print("\n");
                    compteur = 0;
                }
            
        }

    }
}
