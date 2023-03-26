/*
 * DistributionCartes.java                                 06/10/2022
 * IUT de Rodez, pas de droit d'auteur
 */
package iut.info1.programmation.serviere.affectation;

import java.util.Scanner;

/**
 * Donne le nombre de carte à distribué pour un certain nombre de personne
 * @author François de Saint Palais
 */
public class DistributionCartes {

    /**
     * Demande à l'utilisateur le nombre de carte à distribué et
     * le nombre de joueur.
     * Affiche le nombre de carte par joueur et
     * le nombre de carte pas distribué
     */
    public static void main(String[] args) {
        Scanner analyseurLexicale = new Scanner(System.in);

        int nbCarte;
        int nbJoueur;


        System.out.print("Entrez le nombre de cartes à distribuer : ");
        nbCarte = analyseurLexicale.nextInt();

        System.out.print("Entrez le nombre de joueurs : ");
        nbJoueur = analyseurLexicale.nextInt();


        System.out.println("Chaque joueur aura "+ 
                            nbCarte / nbJoueur +" cartes. "+
                            nbCarte % nbJoueur +" cartes ne seront pas distribuées.");
        analyseurLexicale.close();
    }
}
