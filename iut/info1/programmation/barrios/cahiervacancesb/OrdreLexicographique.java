/*
 * OrdreLexicographique.java                             16 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.cahiervacancesb;

import iut.utilitaire.Tableaux;

/**
 * Vérifie si un tableau de chaine de caractère est ordonné lexicographiquement
 * @author François de Saint Palais
 */
public class OrdreLexicographique {
    
    /**
     * 
     * @param args inutilisé
     */
    public static void main(String[] args) {

        String[] liste = {"a","b","c"};
        String[] liste2 = {"zoro","bravo","alpha"};
        String[] liste3 = {"A","a"},
                 liste4 = {"b","B"};


        String[][] tableaux = {liste,liste2,liste3,liste4};
        
        for (String[] sousListe : tableaux) {
            if (EstClasse(sousListe)) {
                System.out.println(Tableaux.AfficheTableauxString(sousListe) + " est classé lexicographiquement.");
            } else {
                System.out.println(Tableaux.AfficheTableauxString(sousListe) + " n'est pas classé lexicographiquement.");
            }
        }
        
    }
    
    /**
     * Vérifie si liste est cl&ssé lexicographiquement
     * @param liste tableaux à vérifier
     */
    public static boolean EstClasse(String[] liste) {
        boolean estLexicographique;
    
        estLexicographique = true;
        for (int i = 0; (i < liste.length - 1) && estLexicographique; i++) {
            estLexicographique = liste[i].compareTo(liste[i + 1]) <= 0;
        }
        return estLexicographique;
    }
}
