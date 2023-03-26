/*
 * MontantInteret.java                                     06/10/2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.affectation;

import java.util.Scanner;

/**
 * Calcul le montant des intérêts obtenus au bout 
 * d’un an, ainsi que la somme obtenue. 
 * @author François de Saint Palais
 */
public class MontantInteret {

    /*
     * Demande à l'utilisateur le montant d'un placement en euros et
     * un taux d’intérêt. 
     * Le programme affiche le montant des intérêts obtenus au bout 
     * d’un an, ainsi que la somme obtenue.
     */
    public static void main(String[] args) {
        Scanner analyseurLexical = new Scanner(System.in);

         double placement;
         double interet;

         System.out.println("********************  Calculs pour un placement financier *******************");

         System.out.print("Entrez la somme placée en euros : ");
         placement = analyseurLexical.nextDouble();

         System.out.print("Entrez le taux de placement : ");
         interet = analyseurLexical.nextDouble();

         System.out.println("Au bout d'un an, les intérêts seront de "+ 
                            Math.round((12 * interet)) +" euros et la somme obtenue égale à "+ 
                            Math.round((placement + interet * 12))  +" euros");
        analyseurLexical.close(); 
    }
    
}
