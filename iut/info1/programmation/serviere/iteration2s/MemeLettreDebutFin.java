/* 
 * Effectue la saisie d'une chaîne débutant et se terminant par une 
 * même lettre
 * MemeLettreDebutFin.java                                        11/22
 */
package iut.info1.programmation.serviere.iteration2s;
import java.util.Scanner;

/**
 * Effectue la saisie d'une chaîne qui débute et se termine par une même lettre.
 * La saisie est recommencée en cas d'erreur. 
 * @author INFO1
 * @version 1.0
 */
public class MemeLettreDebutFin {

    /**
     * Programme principal
     * @param args argument non utilisé
     */
    public static void main(String[] args) {
      
        // pour les saisies
        Scanner analyseurEntree = new Scanner(System.in);
        
        String chaineSaisie;

        boolean premiereEgaleDeniere;

        // TODO
        
        do {
            System.out.print("Donnez une cha\u00eene d\u00e9butant " 
                            + "et terminant par la même lettre : ");
            chaineSaisie = analyseurEntree.next();
            if (chaineSaisie.charAt(0) 
                == chaineSaisie.charAt(chaineSaisie.length() - 1) 
                && Character.isAlphabetic(chaineSaisie.codePointAt(0))) {
                premiereEgaleDeniere = true;
            } else {
                System.out.println("Erreur. La cha\u00eene entr\u00e9e ne convient pas." 
                                    + " Recommencez.");
                analyseurEntree.nextLine();
                premiereEgaleDeniere = false;
            }
        } while (!premiereEgaleDeniere);

        // la chaîne saisie est affichée pour vérification
        System.out.println("Vous avez donn\u00e9 la cha\u00eene " + chaineSaisie);
        analyseurEntree.close();
    }
}

