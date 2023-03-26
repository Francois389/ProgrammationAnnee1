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
public class PermutationTroisVariable{
	/**
	 * Demande à l'utilisateur d'entrer deux entiers, stocké dans deux
	 * variables, puis permute les contenus des deux variables et
	 * affiche les deux valeurs
	 * @param args inutilisé
	 */
	public static void main(String[] args){
		
		int valeur1;
		int valeur2;
        int valeur3;
		
		Scanner analysateurLexical = new Scanner(System.in);
		
		System.out.println("Entrez un entier");
		valeur1 = analysateurLexical.nextInt();
		System.out.println("Entrez un deuxième entier");
		valeur2 = analysateurLexical.nextInt();
        System.out.println("Entrez un troisième entier");
        valeur3 = analysateurLexical.nextInt();
		
		
		var temp = valeur3;
		valeur3 = valeur2;
        valeur2 = valeur1;
        valeur1 = temp;
		
        System.out.println("valeur1 = " + valeur1 +
                            "\nvaleur2 = " + valeur2 + 
                            "\nvaleur3 = " + valeur3);
		
		analysateurLexical.close();
	}
}