/*
 * Affiche les entiers dont le carré est inférieur à une limite
 * CarreInferieur.java                          11/22
 * 
 */
package iut.info1.programmation.serviere.iteration1s;

import java.util.Scanner;

/**
 * Affiche les entiers strictement positifs dont le carré est inférieur ou égal
 * à une valeur limite entrée par l'utilisateur
 * 
 * @author INFO1
 * @version 1.0
 * 
 */
public class CarreInferieurGestionErreur {

	/**
	 * Programme principal
	 * @param argsargument non utilsé
	 */
	public static void main(String args[]) {

		// déclaration d'un objet Scanner pour les opérations de saisie
		Scanner analyseurEntree = new Scanner(System.in);

		int limite; 		// valeur limite entrée par l'utilisateur
			
		String carreValide;

        boolean saisieOk;

		// saisie de la valeur limite
        saisieOk = false;
        limite = 0;
        do {
            System.out.print("Entrez une valeur limite (au moins 1): ");
            if (analyseurEntree.hasNextInt()) {
                limite = analyseurEntree.nextInt();
                if (1 <= limite) {
                    saisieOk = !saisieOk;
                    analyseurEntree.close();
                } else {
                    System.out.println("Cette valeur est trop petite. Recommencez.");
                }
            } else {
                System.out.println("Vous n'avez pas saisi un entier. Recommencez.");
                analyseurEntree.next();
                analyseurEntree.nextLine();
            }
        } while (!saisieOk);

		
		
		/*
		 * Boucle while
		 */
		int nb = 1;
		carreValide = "";
		while (nb*nb <= limite) {
			carreValide += nb + "  ";
			nb++;
		}
		if (carreValide.length() == 0) {
			System.out.print("Aucun entier strictement positif n'a un carré inférieur à 0");
		} else {
			System.out.print(carreValide);
		}
		

	}
}