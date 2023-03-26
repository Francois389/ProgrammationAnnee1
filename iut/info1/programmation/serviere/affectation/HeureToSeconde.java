/*
 * L'exercice 1 de la feuille donner le 30/09/2022                     30/09/2022
 * HeureToSeconde.java *
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.affectation;

import java.util.Scanner;

/**
 * Converti des heures, minutes, secondes en secondes
 * @author François de Saint Palais
 */
public class HeureToSeconde {
    
    /**
     * 
     *  
     */
    public static void main(String[] args) {

        Scanner analyseurLexical = new Scanner(System.in);
        int heure;
        int minute;
        int seconde;

        System.out.println("Programme de conversion des heures / minutes / secondes en secondes");
        
        System.out.println("Entrez un nombre d'heure : ");
        heure = analyseurLexical.nextInt();

        System.out.println("Entrez un nombre de minute : ");
        minute = analyseurLexical.nextInt();

        System.out.println("Entrez un nombre de seconde : ");
        seconde = analyseurLexical.nextInt();

        int nbSecondes = heure*3600 + minute*60 + seconde;
        System.out.println("La duree équivalente est " + nbSecondes + " secondes.");

        analyseurLexical.close();
    }

}