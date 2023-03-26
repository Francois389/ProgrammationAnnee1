/*
 * Exercie1Cours.java                                                15/10/2022
 * Les exercices du cours du 14/10/2022
 */

package iut.info1.programmation.serviere.constante;

/**
 * Les exercices du cours du 14/10/2022
 */

public class Exerice1Cours {
    
    public static void main(String[] args) {
        // a/ L'age limite des pour bénéficier de la réduction
        final int AGE_LIMITE = 25;

        // b/ Le taux de TVA qui s'applique aux prix des livres
        final double TVA = 5.5;

        // c/ Le prix d'un ticket de cinema 
        final double PRIX_PLACE_CINEMA = 9.6;

        // d/ Le nombre maximum de places dans la salle de spectacle
        final int NB_PLACE = 320;

        // e/ L'heure de fermeture d'un etablissement
        final String HEURE_FEMETURE = "18h45";
        final double HEURE_FEMETURE_DOUBLE = 18.75; //l'heure en nb d'heure depuis 0
        final int MINUTE_FERMETURE = 1225;

        double a = AGE_LIMITE + TVA + PRIX_PLACE_CINEMA + NB_PLACE + HEURE_FEMETURE_DOUBLE + MINUTE_FERMETURE;
        String b = HEURE_FEMETURE;
        a = a + 0;
        b =  "0"+b ;
    }
}
