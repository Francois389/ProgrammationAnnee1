/*
 * FactureLibrairie.java                                   23-10-2022
 * IUT de Rodez, pas de doit d'auteur
 */

package iut.info1.programmation.serviere.condition1s;

import java.util.Scanner;

/**
 * Utilisation des bloc conditionelle 
 * pour afficher le prix d'une commande.
 * @author François de Saint Palais
 */
public class FactureLibrairie {
    
    /**
     * Demande à l'utilisateur son âge et le nombre de livre acheté.
     * Il affichera en retour le montant HT, le montant de la TVA,
     * le montant des frais de transport et le montant total TTC.
     * 
     * Si le client a moins de 25, 
     *     une reduction de 10% sera appliqué sur le montant HT
     * Si le montant TTC de la commande dépasse 50 euros, 
     *     les frais de port sont gratuit sinon ils sont de 4,6 euros
     * 
     * Les nombre seront afficher avec deux choffres aprés la virgule
     * @param args inutilisé
     */
    public static void main(String[] args) {
        int ageUtilisateur;
        int nbLivreAchete;
        double montantHT;
        double montantTTC;
        double farisDePort = 4.6;
        final int AGE_REDUCTION = 25;
        final double REDUCTION = 0.9;
        final double TVA_LIVRE = 1.055;
        final double PRIX_LIVRE_HT = 18.5;
        

        Scanner analyseurLexical = new Scanner(System.in);

        System.out.print("Entrez votre âge : ");
        ageUtilisateur = analyseurLexical.nextInt();
        System.out.print("Entrez le nombre de livre acheté : ");
        nbLivreAchete = analyseurLexical.nextInt();

        montantHT = nbLivreAchete * PRIX_LIVRE_HT;
        
        if (ageUtilisateur < AGE_REDUCTION) {
            montantTTC = montantHT * REDUCTION* TVA_LIVRE;
        }
        else {
            montantTTC = montantHT * TVA_LIVRE;
        }

        if (montantTTC > 50) {
            farisDePort = 0;
        }
        montantTTC += farisDePort;
        System.out.printf("Le montant des livres est de %.2f euros\n", (nbLivreAchete * PRIX_LIVRE_HT));
        System.out.printf("Le montant de la TVA est de %.2f %% \n", ((TVA_LIVRE - 1) * 100));
        System.out.printf("Les frais de transport sont de %.2f euros\n", farisDePort);
        System.out.printf("Le montant total TTC est de %.2f euros\n", montantTTC);

        analyseurLexical.close();
    }
}
