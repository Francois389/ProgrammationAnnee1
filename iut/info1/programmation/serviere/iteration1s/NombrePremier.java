/*
 * NombrePremier.java                                    01 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */
package iut.info1.programmation.serviere.iteration1s;

import java.util.Scanner;

/**
 * Vérifie si un nombre saisie est un nombre premier
 * @author INFO1
 * @version 1.0
 */
public class NombrePremier {
    
    /**
     * Demande un entier naturels non nul et non 1.
     * Gére les erreurs de saisie.
     * @param args argument non utilisé
     */
    public static void main(String[] args) {
        
        // objet Scanner pour les saisies
        Scanner analyseurEntree = new Scanner(System.in);
        
		
		// TODO : déclararer des variables et les instructions
        int nbATester;
        int diviseur;

        boolean saisieOk;
        boolean saisieUn;
        
		saisieOk = false;
        saisieUn = false;
        nbATester = 1;
		do {
            System.out.print("Entrez un nombre : ");
            if (analyseurEntree.hasNextInt()) {
                nbATester = analyseurEntree.nextInt();
                if (1 < nbATester) {
                    saisieOk = !saisieOk;
                    analyseurEntree.close();
                } else {
                    System.out.println("Le programme ne gere " 
                                        + "pas les nombres negatifs.");
                }
            } else {
                System.out.println("Erreur. Il faut donner un nombre entier." 
                                    + " Recommencez.");
                analyseurEntree.next();
                analyseurEntree.nextLine();
            }
        } while (!saisieOk && !saisieUn);

        

        if (saisieOk) {
            diviseur = 2;
            while (nbATester % diviseur != 0 && diviseur < nbATester/2) {
                diviseur ++;
            }
            if (diviseur >= nbATester/2) {
                System.out.printf("%d est premier", nbATester);
            } else {
                System.out.printf("%d n'est pas premier", nbATester);
            }
        }
		
        
    }
}
