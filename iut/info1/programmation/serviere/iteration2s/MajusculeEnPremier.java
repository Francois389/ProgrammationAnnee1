/* 
 * MajusculeEnPremier.java                               01 dec. 2022
 */
package iut.info1.programmation.serviere.iteration2s;
import java.util.Scanner;

/**
 * Effectue la saisie d'une chaîne qui débute par une lettre majuscule.
 * La saisie est recommencée en cas d'erreur. 
 * @author François de Saint Palais
 * @version 1.0
 */
public class MajusculeEnPremier {

    /**
     * Programme principal
     * @param args argument non utilisé
     */
    public static void main(String[] args) {
      
        // pour les saisies
        Scanner analyseurEntree = new Scanner(System.in);

        String saisie;

        boolean saisieMajuscule;
        
		// TODO : coder le programme

        do {
            System.out.print("Donnez une cha\u00eene d\u00e9butant par une majuscule : ");
            saisie = analyseurEntree.next();
            if (Character.isUpperCase(saisie.charAt(0))) {
                saisieMajuscule = true;
            } else {
                System.out.println("Erreur. La cha\u00eene entr\u00e9e ne convient pas." 
                                    + " Recommencez.");
                analyseurEntree.nextLine();
                saisieMajuscule = false;
            }
        } while (!saisieMajuscule);
        System.out.printf("Vous avez donn\u00e9e la cha\u00eene %s", saisie);
        analyseurEntree.close();
    }
}
