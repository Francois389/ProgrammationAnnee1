/*
 * Minimum.java                                          20 nov. 2022
 */

package iut.info1.programmation.serviere.iteration1s;

import java.util.Scanner;

/**
 * L'utilisateur entre une suite d'entiers terminée par -1, ou toute autre
 * valeur négative. Les entiers significatifs sont supposés être positifs ou nuls. 
 * Le programme détermine et affiche le minimum de ces entiers (valeur négative
 * non comprise)
 * 
 * @author François de Saint Palais
 * @version 1.0
 * 
 */
public class Minimum {

	/**
	 * Programme principal
	 * @param args argument non utilisé
	 */
	public static void main(String[] args) {

		// déclaration d'un objet de type Scanner pour effectuer les saisies
		Scanner analyseurEntree = new Scanner(System.in);
		
		// TODO : déclarer des variables
		int minimum;
		int maximum;
		int saisie;

		boolean premiereSaisieOk;

		/*
		 *  lecture de la suite d'entiers, 
		 *  et recherche du minimum au fur et à mesure de la saisie
		 */
		

        // TODO : écrire le programme
		premiereSaisieOk = true;
		minimum = -1;
		maximum = -1;
		saisie = 0;
		while (premiereSaisieOk) { //Premiére saisie
			System.out.print("Entrez une suite d'entiers terminée par -1 (ou < 0) : "
				            + "\nPremier entier ? ");
			if (analyseurEntree.hasNextInt()) {
				maximum = minimum = saisie = analyseurEntree.nextInt();
				if (saisie < 0) {
					System.out.println("Vous n'avez pas donne d'entier significatif."
										+ " Recherche impossible !!\n");
				} else {
					premiereSaisieOk = !premiereSaisieOk;
				}
			} else {
				System.out.println("Attention il faut saisir en entier !");
				analyseurEntree.nextLine();
			}
		}
		
		do { //Calcul minimum pour d'autre valeur
			System.out.print("Prochain entiers ?");
			if (analyseurEntree.hasNextInt()) {
				saisie = analyseurEntree.nextInt();
				if (saisie < 0) {
					System.out.println("Fin de saisie des entiers.\nCalcul du minimum ...");
				} else if (saisie < minimum) {
					minimum = saisie;
				} else if (maximum < saisie) {
					maximum = saisie;
				}
			} else {
				System.out.println("Attention il faut saisir en entier !");
				analyseurEntree.nextLine();
			}
		} while (saisie > 0);

		analyseurEntree.close();
		
	    System.out.printf("Le minimum des entiers est %d\nLe maximum des entiers est %d", minimum, maximum);


	}
}