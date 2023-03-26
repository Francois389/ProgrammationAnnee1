/*
 * CalculTVAIf.java                                        17/10/2022
 */

package iut.info1.programmation.serviere.constante;

import java.util.Scanner;

public class CalculTVAIf {
    /**
     * Calcule la TVA sur un produit
     * @author François de Saint Palais
     */

    public static void main(String[] args) {
        /**
         * Demande à l'utilisateur un montant hors taxe, 
         * vérifie si cela est un nombre decimal
         * ouis demande à l'utilisateur une TVA, vérifie si cela fait partie
         * des 4 possibilité (20, 10, 5.5, 2.1 %) retourne une erreur sinon.
         * Dans le cas où les valeurs sont correct affiche 
         * le montant de la TVA et le prix TTC
         */

        Scanner analyseurLexical = new Scanner(System.in);
        final String ERREUR_SAISIE = "Taux invalide. Les calculs seront faits  avec le taux 20.0 %.\n";

        System.out.print("Entrez le montant hors taxes : ");
        double montantHT = analyseurLexical.nextDouble();

        System.out.print("Entrez le taux de TVA : ");
        double tauxTVA = analyseurLexical.nextDouble();
        if (tauxTVA != 20 
            && tauxTVA != 10 
            && tauxTVA != 5.5 
            && tauxTVA != 2.1) { 
                System.out.println(ERREUR_SAISIE);
                tauxTVA = 20;
            }
        
        double montantTVA = montantHT * tauxTVA / 100;
        double montantTTC = montantHT + montantTVA;

        System.out.printf("Montant de la TVA ........ : %3.2f\n",montantTVA);
        System.out.printf("Montant TTC .............. : %3.2f\n", montantTTC);

        analyseurLexical.close();
    }
}
