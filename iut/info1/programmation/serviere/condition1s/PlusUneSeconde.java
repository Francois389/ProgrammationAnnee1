/*
 *  Ajoute une seconde à une durée saisie
 *  fichier : PlusUneSeconde.java                        10/21
 */
package iut.info1.programmation.serviere.condition1s;

import java.util.Scanner;

/**
 * Ce programme demande à l'utilisateur de saisir un horaire de la journée (en
 * heures, minutes et secondes). Il affiche ensuite l'horaire obtenu en ajoutant
 * une seconde à l'horaire initial.
 * On suppose que l'utilisateur ne commet pas d'erreurs lors de la saisie des 
 * heures, minutes et secondes
 * Version avec des "if" imbriqués
 * 
 * @author François de Saint Palais
 * @version 1.0
 */
class PlusUneSeconde {

    /**
     * Programme principal
     * @param args argument non utilisé
     */
    public static void main(String args[]) {

        // déclaration d'un objet Scanner pour les saisies
        Scanner analyseurEntree = new Scanner(System.in);

        int heure,          // heure, minute et seconde entrées par l'utilisateur
            minute,         // on ne vérifie pas que les secondes et les minutes
            seconde;        // sont comprises entre 0 et 59
                            // ni que l'heure est comprise entre 0 et 23

        // saisie des heures, minutes et secondes
        System.out.print("Entrez les heures (entier entre 0 et 23) : ");
        heure = analyseurEntree.nextInt();

        System.out.print("Entrez les minutes (entier entre 0 et 59) : ");
        minute = analyseurEntree.nextInt();

        System.out.print("Entrez les secondes (entier entre 0 et 59) : ");
        seconde = analyseurEntree.nextInt();

        // on ajoute une seconde à la durée saisie
        if (seconde < 58) {
            seconde ++;
        }
        else if (minute < 58) {
            seconde ++;
            minute ++;
        }
        else if (heure < 22) {
            seconde ++;
            minute ++;
            heure ++;
        }
        else {
            seconde = 0;
        }

        // on affiche le résultat
        System.out.println("Une seconde plus tard, il sera " + heure
                + " heure(s) " + minute + " minute(s) " + seconde
                + " seconde(s) ");
        
                analyseurEntree.close();
    }
}