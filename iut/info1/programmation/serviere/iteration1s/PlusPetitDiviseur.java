/*
 * Recherche d'un diviseur d'un nombre de référence
 * PlusPetitDiviseur.java                   11/22
 */
package iut.info1.programmation.serviere.iteration1s;

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
        Scanner analyseurEntree = new Scanner(System.in);
        
		
		// TODO : déclararer des variables et les instructions
        int saisie;
        int plusPetitDiviseur;

        boolean saisieOk;
        boolean saisieUn;
        
		saisieOk = false;
        saisieUn = false;
        saisie = 1;
		do {
            System.out.print("Entrez un nombre de référence (au moins égal à 1) :");
            if (analyseurEntree.hasNextInt()) {
                saisie = analyseurEntree.nextInt();
                if (1 < saisie) {
                    saisieOk = !saisieOk;
                    analyseurEntree.close();
                } else if (saisie == 1){
                    System.out.println("1 n'a pas d'autre diviseur que lui-même.");
                    saisieUn = true;
                } else {
                    System.out.println("Erreur. Cet entier est trop petit." 
                                        + " Recommencez.");
                }
            } else {
                System.out.println("Erreur. Il faut donner un nombre entier." 
                                    + " Recommencez.");
                analyseurEntree.next();
                analyseurEntree.nextLine();
            }
        } while (!saisieOk && !saisieUn);

        

        if (saisieOk) {
            plusPetitDiviseur = 2;
            while (saisie % plusPetitDiviseur != 0) {
                plusPetitDiviseur ++;
            }
            System.out.printf("Le plus petit diviseur de %d (autre que 1) est %d",
                                saisie, plusPetitDiviseur );
        }
		
        
    }
}
