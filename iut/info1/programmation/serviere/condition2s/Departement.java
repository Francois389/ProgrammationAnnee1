/*
 * Affiche le lieu de residence en fonction du departement
 * DepartementDeFrance.java                         11/22
 */
package iut.info1.programmation.serviere.condition2s;

import java.util.Scanner;

/**
 * L'utilisateur entre un numero de departement.
 * Si celui-ci est invalide, le programme previent l'utilisateur.
 * Dans le cas contraire, le programme indique où reside la personne :
 *    - a Paris
 *    - en petite couronne
 *    - en Ile de France
 *    - en Province
 * @author Servières
 * @version 1.0
 */
public class Departement {
    
    /**
     * Programme principal
     * @param args  argument non utilise
     */
    public static void main(String[] args) {
        
        // declaration d'un objet scanner pour les saisies au clavier
        Scanner analyseurEntree = new Scanner(System.in);

        int departement;

        String message = "Vous habitez ";
        
        // saisie du departement
        System.out.print("Entrez votre num\u00e9ro de departement : ");
        departement = analyseurEntree.nextInt();
        analyseurEntree.close();
        
        // on affiche le lieu de residence (ou departement invalide)
        if ((1 > departement || departement > 95) 
            && (departement < 971 || 974 < departement) 
            && departement != 976) {
            System.out.println("Attention vous avez saisie" 
                               + " un numero d\u00e9partement invalide. "); 
        } else if (departement == 95) {
            message += "\u00e0 Paris";
        } else if (92 <= departement && departement <= 94) {
            message += "la petite couronne";
        } else if (departement == 75 || departement == 77 || departement == 78 
                   || departement == 91 || departement == 95) {
            message += "en Ile de France";
        } else if (971 <= departement && departement <= 974 || departement == 976) {
            message += "en Outre-Mer";
        }
        else {
            message += "en Province";
        }
        System.out.println(message);
    }

}