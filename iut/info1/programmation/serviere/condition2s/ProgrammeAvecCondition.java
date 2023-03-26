/*
 * Differents traitements faisant appel a des instructions conditionnelles
 * ProgrammeAvecCondition.java                  11/22
 */

package iut.info1.programmation.serviere.condition2s;

import java.util.Scanner;

/**
 * Ce programme contient differents traitements codes avec des instructions
 * conditionnelles.
 * 1)   Saisie d'un âge, verification de sa validite et information sur 
 *      une reduction accordee ou pas
 * 2)   Saisie d'un code article et verification de sa validite 
 *      (2, 4,5 ou 6 chiffres)
 * 3)   Saisie d'un etage et verification de sa validite
 * @author François de Saint Palais
 * @version 1.0
 */
public class ProgrammeAvecCondition {
    
    /**
     * Programme principal
     * @param args  argument non utilise
     */
    public static void main(String[] args) {
        
        // declaration d'un objet scanner pour les saisies au clavier
        Scanner analyseurEntree = new Scanner(System.in);
        
        
        /**
         * EXERCICE 1 
         */ 
        int age;        // age saisi au clavier
        System.out.print("Donnez votre age : ");
        age = analyseurEntree.nextInt();
        
        if (0 > age || age > 115) {
            System.out.println("Vous avez entre un age invalide."
                               + " Relancez le programme !");
        } else if (age < 18 || 65 < age) {
            System.out.println("Vous avez droit a une reduction");
        } else {
            System.out.println("Vous n'avez pas droit a une reduction");
        }
        
        
        // EXERCICE 2
        int codeArticle;
        System.out.print("Entrez un code article : ");
        codeArticle = analyseurEntree.nextInt();
        
        // condition code article valide
        if ((10 <= codeArticle && codeArticle <= 99)
            || (1000 <= codeArticle && codeArticle <= 999999)) {
            System.out.println("Code article valide (test avec condition code valide)");
        } else {
            System.out.println("Code article invalide (test avec condition code valide)");  
        }
        
        // condition code article invalide
        if ((10 > codeArticle || codeArticle > 99 )
            && (1000 > codeArticle || codeArticle > 999999)) {
            System.out.println("Code article invalide (test avec condition code invalide)");       
        } else {
            System.out.println("Code article valide (test avec condition code invalide)");
        }
        
        
        // EXERCICE 3
        int etage;
        System.out.print("Entrez le numero de l'etage : ");
        etage = analyseurEntree.nextInt();
        
        // condition etage valide
        if (-2 <= etage && etage <= 20 && etage != 13) {
            System.out.println("L'etage est valide (test avec condition etage valide)");
        } else {
            System.out.println("L'etage est invalide (test avec condition etage valide)");
        }
        
        // VARIANTE : condition etage invalide
        if (-2 > etage || etage > 20 || etage == 13) {
            System.out.println("L'etage est invalide (test avec condition etage invalide)");
        } else {
            System.out.println("L'etage est valide (test avec condition etage invalide)");
        }

        analyseurEntree.close();
        
        
    }

}
