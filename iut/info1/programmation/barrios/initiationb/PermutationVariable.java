/*
 * PermutationVariable.java                          05/10/2022
 * IUT de Rodez, pas de droit d'auteur
 */
package iut.info1.programmation.barrios.initiationb;

import java.util.Scanner;

/**
 * Permute les contenus de deux variables
 * @author François de Saint Palais
 */
public class PermutationVariable{

	/**
	 * Demande à l'utilisateur d'entrer deux entiers, stocké dans deux
	 * variables, puis permute les contenus des deux variables et
	 * affiche les deux valeurs
	 * @param args inutilisé
	 */
	public static void main(String[] args){
		
		Scanner analysateurLexical = new Scanner(System.in);
		int valeur1;
		int valeur2;
		
		int valeur1bis;
		int valeur2bis;
		
		
		System.out.print("Entrez un entier : ");
		valeur1 = analysateurLexical.nextInt();
		valeur1bis = valeur1;
		
		System.out.print("Entrez un deuxième entier : ");
		valeur2 = analysateurLexical.nextInt();
		valeur2bis = valeur2;
		
		
		//Première méthode
		var temp = valeur1;
		valeur1 = valeur2;
		valeur2 = temp;
		
		System.out.println("Entier 1 : " + valeur1 +
							"\nEntier 2 : " + valeur2);
		
		System.out.println("-----Deuxième méthode-----");
		
		//Deuxième méthode
		valeur1bis += valeur2bis;
		valeur2bis = valeur1bis - valeur2bis;
		valeur1bis = valeur1bis - valeur2bis;
		
		System.out.println("Entier 1bis : " + valeur1bis +
							"\nEntier 2bis : " + valeur2bis);
		
		analysateurLexical.close();
	}
}