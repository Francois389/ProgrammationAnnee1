/*
 * UtilTab.java                                          19 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.exercicesuplementaire;

/**
 * Exercice n°54 à la page 66 du livre "Exercices en Java" de Delannoy, Claude
 * @author François de Saint Palais
 */
public class UtilTab {
    
    /**
     * Génère un tableau des n premiers entiers impair
     * @param n le nombre d'entiers impairs à générer
     * @return un tableau des n premiers entiers impairs
     */
    public static int[] Genere(int n) {
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = 2 * i + 1;
        }
        return tab;
    }

    /**
     * Effectue la somme de deux tableaux d'entiers
     * @param tab1 le premier tableau
     * @param tab2 le second tableau
     * @return un tableau contenant la somme des deux tableaux
     */
    public static int[] SommeVecteur(int[] tab1, int[] tab2) {
        int[] tab = new int[tab1.length];
        for (int i = 0; i < tab1.length; i++) {
            tab[i] = tab1[i] + tab2[i];
        }
        return tab;        
    }
}
