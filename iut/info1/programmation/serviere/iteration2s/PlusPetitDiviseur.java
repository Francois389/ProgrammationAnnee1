/*
 * Recherche d'un diviseur d'un nombre de référence
 * PlusPetitDiviseur.java                   11/22
 */
package iut.info1.programmation.serviere.iteration2s;
import java.util.Scanner;

/**
 * Le programme demande à l'utilisateur d'entrer un nombre de référence.
 * Le programme recherche le plus petit diviseur du nombre (et différent
 * de 1)
 * @author INFO1
 * @version 1.0
 */
public class PlusPetitDiviseur {
    
    /**
     * Programme principal
     * @param args argument non utilisé
     */
    public static void main(String[] args) {
        
        // objet Scanner pour les saisies
        Scanner entree = new Scanner(System.in);
        
        int reference;
        int diviseur;
        
        reference = -1;

        do {
            System.out.print("Entrez un nombre de référence (au moins égale à 1) :");
            if (entree.hasNextInt()) {
                reference = entree.nextInt();
                if (reference < 1) {
                    System.out.println("Erreur. Cet entier est trop petit. Recommencez");
                }
            } else {
                System.out.println("Erreur. Il faut un nombre entier. Recommencez.");
            }
        } while (reference < 1);
        entree.close();

        if (reference == 1) {
            System.out.println("1 n'a pas d'autre diviseur que lui-même.");
        } else if (reference % 2 == 0) {
            System.out.printf("Le plus petit diviseur de %d (autre que 1) est 2\n",reference);
        } else {
            diviseur = 3;
            while (reference % diviseur != 0) {
                diviseur += 2;
            }
            System.out.printf("Le plus petit diviseur de %d (autre que 1) est %d\n",reference,diviseur);
        }
    }
}
