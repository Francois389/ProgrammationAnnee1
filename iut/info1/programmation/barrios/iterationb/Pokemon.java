/*
 * Pokemon.java                                          21 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.iterationb;

import java.util.Scanner;


/**
 * Utilisation des boucles itératives
 * @author François de Saint Palais
 */
public class Pokemon {

    /**
     * Calcul le nombre de Pokemon aprés un certain nombre de mois 
     * donné par l'utilisateur
     * puis le nombre de mois avant d'avoir un certain nombre de Pokemon
     * donné par l'utilisateur.
     * C'est la suite de Fibinacci
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        int nbMoisUtilisateur;
        int nbMois;
        long moisUn;
        long moisDeux;
        long nbPokemonUtilisateur;

        boolean unPuisLAutre;

        Scanner analyseurEntree = new Scanner(System.in);

        System.out.print("Entrez la durée en mois : ");
        nbMoisUtilisateur = analyseurEntree.nextInt();
        nbMois = 1;
        moisUn = 1;
        moisDeux = 1;
        unPuisLAutre = true;
        while (nbMois != nbMoisUtilisateur) {
            if (unPuisLAutre) {
                moisUn += moisDeux;
            } else {
                moisDeux += moisUn;
            }
            nbMois ++;
            unPuisLAutre = !unPuisLAutre;
        }
        moisUn = unPuisLAutre ? moisDeux : moisUn;

        // if (unPuisLAutre) {
        //     moisUn = moisDeux;
        // } else {
        //     moisDeux = moisUn;
        // }

        System.out.printf("Aprés %d mois vous aurez %d\n\n",
                            nbMoisUtilisateur, moisUn);

        System.out.print("Entrez le nombre de Pokemon voulue : ");
        nbPokemonUtilisateur = analyseurEntree.nextLong();
        analyseurEntree.close();
        
        nbMois = 0;
        moisUn = 1;
        moisDeux = 1;
        unPuisLAutre = true;
        while ((!unPuisLAutre && moisDeux <= nbPokemonUtilisateur) 
                || (unPuisLAutre && moisUn <= nbPokemonUtilisateur)) {
            if (unPuisLAutre) {
                moisUn += moisDeux;
            } else {
                moisDeux += moisUn;
            }
            nbMois ++;
            unPuisLAutre = !unPuisLAutre;
        }

        System.out.printf("Pour avoir %d Pokemon vous devrais attendre " 
                        + " %d mois.\n", nbPokemonUtilisateur, nbMois);
    }
}