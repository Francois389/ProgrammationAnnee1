/*
 * ComparaisonDeuxDuree.java                               20-10-2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.condition1s;

import java.util.Scanner;

/**
 * Compare deux duree en utilisant les instruction conditionelle
 * @author François de Saint Palais
 */

public class ComparaisonDeuxDuree {

    /**
     * Demande à l'utilisateur deux duree 
     * sous la forme Heure, Minutes, Secondes
     * et renvoie la duree la plus courte 
     * ou affichera un message si elle font la même duree
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        int heure1;
        int minutes1;
        int secondes1;
        int heure2;
        int minutes2;
        int secondes2;

        Scanner analyseurEntree = new Scanner(System.in);

        //----------------------Premiére durée
        System.out.println("déclaration d'un premiére durée :");
        System.out.print("Entrez le nombre d'heure d'une première durée : ");
        heure1 = analyseurEntree.nextInt();
        System.out.print("Entrez le nombre de minutes d'une première durée : ");
        minutes1 = analyseurEntree.nextInt();
        System.out.print("Entrez le nombre de secondes d'une première durée : ");
        secondes1 = analyseurEntree.nextInt();
        //----------------------Deuxiéme durée
        System.out.println("\nDéclaration d'une deuxiéme durée :");
        System.out.print("Entrez le nombre d'heure d'une seconde durée : ");
        heure2 = analyseurEntree.nextInt();
        System.out.print("Entrez le nombre de minutes d'une seconde durée : ");
        minutes2 = analyseurEntree.nextInt();
        System.out.print("Entrez le nombre de seconde d'une seconde durée : ");
        secondes2 = analyseurEntree.nextInt();

        //Condition Heures
        if (heure1 < heure2) {
            System.out.printf("La durée la plus courte est : %dh%02d et %ds", heure1, minutes1, secondes1);
        }
        else if (heure1 > heure2) {
            System.out.printf("La durée la plus courte est : %dh%02d et %ds", heure2, minutes2, secondes2);
        }
        else {
            //Condition Minutes
            if (minutes1 < minutes2) {
                System.out.printf("La durée la plus courte est : %dh%02d et %ds", heure1, minutes1, secondes1);
            }
            else if (minutes1 > minutes2) {
                System.out.printf("La durée la plus courte est : %dh%02d et %ds", heure2, minutes2, secondes2);
            }
            else {
                //condition Secondes
                if (secondes1 < secondes2) {
                    System.out.printf("La durée la plus courte est : %dh%02d et %ds", heure1, minutes1, secondes1);
                }
                else if (secondes1 > secondes2) {
                    System.out.printf("La durée la plus courte est : %dh%02d et %ds", heure2, minutes2, secondes2);
                }
                else {
                    System.out.println("Les deux durée sont identiques");
                }
            }
        }
        analyseurEntree.close();
    }
}