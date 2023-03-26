/*
 * EstBissextile.java                                      09/10/2022
 */

package iut.info1.programmation.barrios.initiationb;

import java.util.Scanner;

/**
 * Manipulation de l'opérateur logique
 * et l'utilisation de l'entrée standard
 * @author François de Saint Palais
 */
public class AfficheEstBissextile {

    /**
     * Demande à l'utilisateur une année,
     * calcul si elle est bissextile et
     * renvoie sur l'entrée standard vrai ou faux.
     * @param args inutilisé
     */
    public static void main(String[] args) {
        Scanner analyseurLexical = new Scanner(System.in);
        
        int anneeATester;

        System.out.print("Entrez une année à vérifier : ");
        anneeATester = analyseurLexical.nextInt();
        analyseurLexical.close();

        if (EstBissextile(anneeATester)) {
            System.out.printf("%d est une année bissextile",anneeATester);
        } else {
            System.out.printf("%d n'est pas une année bissextile",anneeATester);
        }        
    }

    /**
     * Retourne true si annee est une année bissextile false sinon
     * @param annee L'année à tester
     * @return true si annee est bissextile et false sinon
     */
    public static boolean EstBissextile(int annee) {
        return (annee % 4 == 0 && annee % 100 != 0)
               || annee % 400 == 0;
    }
    
}
