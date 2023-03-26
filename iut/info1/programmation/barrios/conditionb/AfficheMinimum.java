/*
 * AfficheMinimum.java                                   03 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.conditionb;

import java.util.Scanner;

/**
 * Utilisation des blocs conditionels pour calculer le minimum de deux entiers
 * @author François de Saint Palais
 */
public class AfficheMinimum {
    
    
    /**
         * Demande à l'utilisateur deux valeurs 
         * et affiche la valeur minimal
         * @param args inutilisé
         */
    public static void main(String[] args) {
        
        int valeur1;
        int valeur2;
		
		int minimum;

        Scanner entrScanner = new Scanner(System.in);

        System.out.print("Entrez un première valeur : ");
        valeur1 = entrScanner.nextInt();
        System.out.print("Entrez un deuxième valeur : ");
        valeur2 = entrScanner.nextInt();

        if (valeur1 < valeur2) {
            minimum = valeur1;
        } else {
            minimum = valeur2;
        }
		
		System.out.printf("Le minimum entre %d et %d est %d",valeur1,valeur2, minimum);
		
        entrScanner.close();
    }
}
