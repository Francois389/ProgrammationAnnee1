package iut.utilitaire;

public class Tableaux {

    /**
     * La fonction statique publique AfficheTableauxString prend un tableau de chaîne en entrée et renvoie une chaîne.
     * La fonction crée une chaîne de sortie qui est formatée comme celle-ci: &quot; [\&quot; String \&quot;, \&quot; String \&quot;, ...] &quot;
     * Où chaque chaîne de la liste est entourée de citations doubles.
     * Si le tableau d'entrée n'a pas d'éléments, alors la chaîne de sortie est &quot; [] &quot;.
     * 
     * @param liste Un tableau de chaînes
     * @return Une chaîne qui contient un tableau des valeurs de la liste
     */    
    public static String AfficheTableauxString(String[] liste) {
        String contenuListe;

        contenuListe = "[";
        if (liste.length > 0) {

            contenuListe += "\"" + liste[0] + "\"";
            for (int i = 1; i < liste.length; i++) {
                contenuListe += ", " + "\"" + liste[i] + "\"";
            }
        }
        contenuListe += "]";
        return contenuListe;
    }
    
    /**
     * La fonction statique publique AfficheTableauxInt prend un tableau d'entier' en entrée et renvoie une chaîne.
     * La fonction crée une chaîne de sortie qui est formatée comme celle-ci: &quot; [Integer, Integer, ...] &quot;
     * Où chaque entier de la liste est séparé d'une virgule.
     * Si le tableau d'entrée n'a pas d'éléments, alors la chaîne de sortie est &quot; [] &quot;.
     * 
     * @param liste La liste d'entiers à afficher
     * @return Une chaîne qui contient un tableau des valeurs de la liste
     */ 
    public static String AfficheTableauxInt(int[] liste) {
        String contenuListe;

        contenuListe = "[";
        if (liste.length > 0) {
            contenuListe += liste[0];
            for (int i = 1; i < liste.length; i++) {
                contenuListe += ", " + liste[i];
            }
        }
        contenuListe += "]";
        return contenuListe;
    }

    /**
     * La fonction statique publique AfficheTableauxInt prend un tableau d'entier' en entrée et renvoie une chaîne.
     * La fonction crée une chaîne de sortie qui est formatée comme celle-ci: &quot; [Integer, Integer, ...] &quot;
     * Où chaque entier de la liste est séparé d'une virgule.
     * Si le tableau d'entrée n'a pas d'éléments, alors la chaîne de sortie est &quot; [] &quot;.
     * 
     * @param liste La liste d'entiers à afficher
     * @return Une chaîne qui contient un tableau des valeurs de la liste
     */ 
    public static String AfficheTableauxDouble(double[] liste) {
        String contenuListe;

        contenuListe = "[";
        if (liste.length > 0) {
            contenuListe += liste[0];
            for (int i = 1; i < liste.length; i++) {
                contenuListe += ", " + liste[i];
            }
        }
        contenuListe += "]";
        return contenuListe;
    }

    /**
     * La fonction publique Somme prend un tableau d'entiers en entrée 
     * et renvoie la somme de tous les éléments du tableau.
     * 
     * @param liste La liste d'entiers à sommer
     * @return La somme des éléments de la liste
     */
    public static double SommeDouble(double[] liste) {
        int somme = 0;
        for (int i = 0; i < liste.length; i++) {
            somme += liste[i];
        }
        return somme;
    }
}
