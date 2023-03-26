/*
 * Combien d'année sont-elles nécessaires pour doubler une somme ?
 * DoublerSomme.java                                    11/22
 */
package iut.info1.programmation.serviere.iteration1s;
import java.util.Scanner;

/**
 * Détermine combien d'années sont nécessaires pour doubler une somme placée.
 * L'utilisateur entre la somme initiale et le taux de placement
 * 
 * @author INFO1
 * @version 1.0
 * 
 */
public class DoublerSomme {

	/**
	 * Programme principal
	 * @param args argument non utilsé
	 */
	public static void main(String[] args) {

		// déclaration d'un objet Scanner pour les opérations de saisie
		Scanner analyseurEntree = new Scanner(System.in);
			
		int sommeInitiale;
		int nbAnnee;

		double tauxPlacement;
		double sommeFutur;

		boolean saisieOk;


		// Saisie de la somme initiale et du taux de placement
		sommeInitiale = 0;
		saisieOk = false;
		do {
            System.out.print("Entrez la somme initiale : ");
            if (analyseurEntree.hasNextInt()) {
                sommeInitiale = analyseurEntree.nextInt();
                if (1 <= sommeInitiale) {
                    saisieOk = !saisieOk;
                    analyseurEntree.close();
                } else {
                    System.out.println("Cette valeur est trop petite. Recommencez.");
					saisieOk = true;
                }
            } else {
                System.out.println("Vous n'avez pas saisi un entier. Recommencez.");
                analyseurEntree.next();
                analyseurEntree.nextLine();
				saisieOk = true;
            }
        } while (!saisieOk);

		tauxPlacement = 0;
		do {
			System.out.print("Entrez le taux de placement : ");
            if (analyseurEntree.hasNextInt()) {
                tauxPlacement = analyseurEntree.nextInt();
                if (1 <= tauxPlacement) {
                    saisieOk = !saisieOk;
                    analyseurEntree.close();
                } else {
                    System.out.println("Cette valeur est trop petite. Recommencez.");
					saisieOk = true;
                }
            } else {
                System.out.println("Vous n'avez pas saisi un entier. Recommencez.");
                analyseurEntree.next();
				analyseurEntree.nextLine();
				saisieOk = true;
            }
        } while (!saisieOk);
		
		nbAnnee = 0;
		sommeFutur = sommeInitiale;
		do {
			sommeFutur += (sommeFutur * tauxPlacement / 100);
			nbAnnee ++;
		} while (sommeFutur < sommeInitiale * 2);

		// on affiche le résultat
		System.out.printf("Pour doubler la somme, il faut %d" 
				           + " annees", nbAnnee);

	}
}

// exemple : pour doubler 500 euros, placés à 5% il faut 15 ans