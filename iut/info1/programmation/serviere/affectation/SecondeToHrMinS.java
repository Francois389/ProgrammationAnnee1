/*
 * Exerice 2 de la feuille donner le 30/09/2022            06/10/2022
 * SecondeToHrMinS.java
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.affectation;

import java.util.Scanner;

/**
 * Converti des secondes en heures, en minutes et en secondes
 * @author François de Saint Palais
 */
public class SecondeToHrMinS {

    /**
     * Demande à l'utilisateur un nombre de seconde 
     * et lui retourne ce nombre de seconde en heure, minutes et seconde
     */
    public static void main(String[] args)  {

        Scanner analyseurLexical = new Scanner(System.in);

        System.out.println("Programme de conversion secondes en heures/minutes/secondes.");
        System.out.println("Entrez les secondes à convertir : ");
        int seconde = analyseurLexical.nextInt();


        int nbHeure = seconde / 3600;
        seconde %= 3600;

        int nbMinute = seconde / 60;
        seconde %= 60;

        
        System.out.println("La duree équivalente est " + 
                            nbHeure + " heure(s) " + 
                            nbMinute + " minute(s)" +
                            seconde + " seconde(s).");
        
        analyseurLexical.close();
    }
}
