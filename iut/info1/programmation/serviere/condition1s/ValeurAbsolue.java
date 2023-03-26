/*
 * Calcul de la valeur absolue d'un nombre entier    
 * ValeurAbsolue.java                                   10/22
 */
package iut.info1.programmation.serviere.condition1s;

import java.util.Scanner;

/**
 * Ce programme demande à l'utilisateur d'effectuer la saisie d'un entier.
 * Il affiche ensuite la valeur absolue de cet entier.
 * @author François de Saint Palais
 * @version 1.0
 */
public class ValeurAbsolue {
	
	/**
	 * Programme principal
	 * @param args   argument non utilisé
	 */
	public static void main (String[] args) {
		
		// déclaration d'un objet Scanner pour les saisies
		Scanner analyseurEntree = new Scanner(System.in);
				
		int valeur;	// valeur saisie par l'utilisateur
		
		// saisie de l'entier
		System.out.print("Entrez un entier relatif : ");
        valeur = analyseurEntree.nextInt();

		// on calcule et affiche le résultat
		if (valeur < 0) {
            valeur = -valeur;
        }
        System.out.printf("La valeur absolue est %d", valeur);

        analyseurEntree.close();
	}	
}