/*
 * Différents traitements les durées exprimées en heures et minutes
 * OutilDureeHM.java 
 */

package iut.info1.qualitedev.exception;

/**
 * Traitements sur les durées exprimées en heures et minutes. Pour être valides, 
 * les minutes doivent être comprises entre 0 et 59, et les heures supérieures à  0.
 * Une durée est représentée par un tableau de 2 entiers : à l'indice 0 les heures
 * et à l'indice 1 les minutes.
 * 
 * @author François de Saint Palais
 * @version 1.0
 */
public class OutilDureeHM {

    
    /**
     * Affiche une durée exprimée en heures, minutes et secondes
     * 
     * @param duree tableau de 2 entiers contenant les heures et les minutes
     * @throws IllegalArgumentException si duree est invalide
     */
    public static void afficher(int[] duree) throws IllegalArgumentException{
        if (estValide(duree)) {
            System.out.println(duree[0] + " heure(s) " + duree[1] + " minute(s) ");
        } else {
            throw new IllegalArgumentException("La durée est invalide");
        }
    }

    /**
     * Retourne un String d'une durée exprimée en heures, minutes et secondes
     * 
     * @param duree tableau de 2 entiers contenant les heures et les minutes
     * @throws IllegalArgumentException si duree est invalide
     */
    public static String dureeToString(int[] duree) throws IllegalArgumentException{
        if (estValide(duree)) {
            return duree[0] + " heure(s) " + duree[1] + " minute(s) ";
        } else {
            throw new IllegalArgumentException("La durée est invalide");
        }
    }

    /**
     * Renvoie true si la duree est valide, false sinon
     * Une duree est valide si :
     *     0 <= duree[0] &&
     *     0 <= duree[1] && duree[1] <= 59
     * 
     * @param duree contient une duree
     * @return true si la duree est valide, false sinon
     */
    public static boolean estValide(int[] duree) {
        
        return    0 <= duree[0] 
               && 0 <= duree[1] && duree[1] <= 59;
    }

    /**
     * Retourne un tableau contenant la somme de premiereDuree et deuxiemeDuree.
     * 
     * @param premiereDuree première durée
     * @param deuxiemeDuree deuxième durée
     * @return tableau contenant la somme de premiereDuree et deuxiemeDuree
     */
    public static int[] somme2Durees(int[] premiereDuree, int[] deuxiemeDuree) {
        int[] somme = new int[2];
        int sommeMinute;

        if (estValide(deuxiemeDuree) && estValide(premiereDuree)) {
            sommeMinute = premiereDuree[1] + deuxiemeDuree[1];
            somme[0] = premiereDuree[0] + deuxiemeDuree[0] + sommeMinute / 60;
            somme[1] = sommeMinute % 60;
        } else {
            throw new IllegalArgumentException("Calcul de la somme impossible. L’une des 2 durées est invalide");
        }
        return somme;
    }

    /**
     * Retourne la somme des durées contenue dans le tableau tableDeDuree
     * Si une durée est invalide, elle sera ignorée.
     * @param tableDeDuree tableau de durées
     * @return             tableau contenant la somme des durées valides
     */
   public static int[] sommeTableDuree (int[][] tableDeDuree) {
        int[] somme = new int[2];
        int sommeMinute = 0;
        int sommeHeure = 0;
        int i = 0;
        while (i < tableDeDuree.length) {
            if (estValide(tableDeDuree[i])) {
                sommeMinute += tableDeDuree[i][1];
                sommeHeure += tableDeDuree[i][0];
            }
            i++;
        }
        somme[0] = sommeHeure + sommeMinute / 60;
        somme[1] = sommeMinute % 60;
        return somme;
    }

    /**
     * Vérifie l'égalité entre de deux durées
     *
     * @param premiereDuree première durée
     * @param deuxiemeDuree deuxième durée
     * @return true si les deux durées sont égales, false sinon
     * @throws IllegalArgumentException si l'une des deux durées est invalide
     */
    public static boolean egalite(int[] premiereDuree, int[] deuxiemeDuree)
    throws IllegalArgumentException {
        if (estValide(premiereDuree) && estValide(deuxiemeDuree)) {
            return premiereDuree[0] == deuxiemeDuree[0] && premiereDuree[1] == deuxiemeDuree[1];
        } else {
            throw new IllegalArgumentException("Une des deux durées est invalide");
        }
    }

    /**
     * Vérifie l'égalité entre trois durées.
     * On retournera :
     * <ul>
     *     <li>1 si les trois durées sont égales</li>
     *     <li>2 si deux durées sont égales</li>
     *     <li>3 si aucune durée n'est égale</li>
     * </ul>
     * Une exception est levée si une des durées est invalide.
     *
     * @param premiereDuree première durée
     * @param deuxiemeDuree deuxième durée
     * @param troisiemeDuree troisième durée
     * @return 1 si les trois durées sont égales, 2 si deux durées sont égales, 3 si aucune durée n'est égale
     * @throws IllegalArgumentException si l'une des trois durées est invalide
     */
    public static int egaliteTrois(int[] premiereDuree, int[] deuxiemeDuree, int[] troisiemeDuree) {
        if (   estValide(premiereDuree)
            && estValide(deuxiemeDuree)
            && estValide(troisiemeDuree)) {

            if (   egalite(premiereDuree, deuxiemeDuree)
                && egalite(premiereDuree, troisiemeDuree)) {
                return 1;
            }
            if (   egalite(premiereDuree, deuxiemeDuree)
                || egalite(premiereDuree, troisiemeDuree)
                || egalite(deuxiemeDuree, troisiemeDuree)) {
                return 2;
            }

            /* Si on arrive ici, c'est que les trois durées sont différentes */
            return 3;

        } else {
            throw new IllegalArgumentException("Une des trois durées est invalide");
        }
    }
}

