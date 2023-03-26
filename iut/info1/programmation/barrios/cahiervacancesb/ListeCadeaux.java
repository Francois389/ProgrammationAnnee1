/*
 * ListeCadeaux.java                                     16 dec. 2022
 * IUT de ROdez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.cahiervacancesb;

import iut.utilitaire.Tableaux;

/**
 * Recherche element dans un tableau
 * @author François de Saint Palais
 */
public class ListeCadeaux {
    
    /**
     * Recherche d'une chaine de caractère dans un tableau
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        //STUB
        String[] liste = {"lunette","PC","Truc"};
        String motRechercher = "PC";

        System.out.println("Dans la liste " + Tableaux.AfficheTableauxString(liste) 
                           + ", " + motRechercher + " se trouve à l'indice "
                           +Recherche(liste, motRechercher));

    }
    
    /**
     * Retourne l'indice de la chaine de caractére mot dans le tableaux liste
     * Retourne -1 si la liste est vide ou s'il n'a pas trouvé mot dans liste 
     * @param liste le tableau de chaine de caractére où on doit chercher
     * @param mot la chaine de caractére à chercher
     * @return l'indice de mot dans liste ou -1 
     */
    public static int Recherche(String[] liste, String mot) {
        
        for (int i = 0; i < liste.length; i++) {
            if (liste[i].equals(mot)) {
                return i;
            }
        }
        return -1;
    }


}
