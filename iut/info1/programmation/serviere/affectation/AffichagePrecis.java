/* 
 * Affiche des résultats dans un format imposé 
 * AffichagePrecis.java 
 */ 
package iut.info1.programmation.serviere.affectation;

import java.util.Scanner; 

/** 
 * Ce programme saisit deux entiers et affiche le résultat de différents calculs  
 * effectués à partir de ces entiers. 
 * @author INFO1 
 * @version 1.0 
 */ 
public class AffichagePrecis { 

    /** 
     * Programme principal 
     * @param args     argument non utilisé 
     */ 
    public static void main(String[] args) { 

        // déclartion d'un objet Scanner pour effectuer des saisies 
        Scanner entree = new Scanner(System.in); 

        int valeur1;            // premier entier saisi par l'utilisateur 
        int valeur2;            // deuxieme entier saisi par l'utilisateur 

        // saisie des deux entiers 
        System.out.print("Donnez un nombre entier : "); 
        valeur1 = entree.nextInt(); 
        System.out.print("Donnez un deuxième nombre entier : "); 
        valeur2 = entree.nextInt();

        System.out.println("Voici différents calculs effectués à partir de ces entiers : ");

        System.out.println("Addition : "+valeur1+" + "+valeur2+" = "+(valeur1 + valeur2));
        System.out.println("Soustraction : "+valeur1+" - "+valeur2+" = "+(valeur1 - valeur2));
        System.out.println("Multiplication : "+valeur1+" * "+valeur2+" = "+(valeur1 * valeur2));
        System.out.println("Division : "+valeur1+" / "+valeur2+" = "+(valeur1 / valeur2));

        System.out.println("      \"Au revoir !\"");

        entree.close();
    }
}