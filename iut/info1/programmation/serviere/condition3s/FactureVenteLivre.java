/*
 * FactureVenteLivre.java                                          21 nov. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.condition3s;

import java.util.Scanner;

/**
 * Utilisation des blocs conditionelles
 * @author François de Sanit Palais
 */
public class FactureVenteLivre {
    
    /**
     * On demande à l'utilisateur son âge et le nombre de livre acheté
     * une reduction de 5% sera appliqué si l'utilisateur à moins de 25 ans
     * et les frais port seront offert si la somme des prix des livres TTC 
     * est supérieur 50€.
     * 
     * Les livres sont vendus à 18,50€, on appliqueras une TVA de 5,5% 
     * et les frais de port sont de 4,60€
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        final double PRIX_LIVRE = 18.5;
        final double TAUX_TVA = 0.955;
        final double REDUCTION = 0.95;
        final double FRAIS_PORT = 4.6;
        // final int AGE_MIN = 0;
        // final int AGE_MAX = 115;
        final int AGE_REDUCTION = 25;
        final String FACTURE = 
        """
        Montant HT des livres ..... :  %5.2f 
        Réduction déduite ......... :  %5.2f
        Montant TVA ............... :  %5.2f
        Montant frais port ........ :  %5.2f
        Montant total TTC ......... :  %5.2f
        """;

        int nbLivreAchete;
        int ageUtilisateur;

        double hTLivres;
        double reductionDeduite;
        double tva;
        double fraisPort;
        double totalTTC;

        // double prixAPayer;

        Scanner analyseurEntree = new Scanner(System.in);

        System.out.print("Entrez le nombre de livres commandés : ");
        if (!analyseurEntree.hasNextInt()) {
            System.out.println("Attention, il fallait saisir un entier. " 
                                + "Relancez le programme !");
        } else {
            nbLivreAchete = analyseurEntree.nextInt();
            if (nbLivreAchete < 0) {
                System.out.println("Attention : il fallait entrer un entier positif !");
                nbLivreAchete = 1;
            }
            System.out.print("Entrez votre âge : ");
            if (!analyseurEntree.hasNextInt()) {
                System.out.println("Attention : il fallait entrer un entier.");
                ageUtilisateur = 25;
            } else {
                ageUtilisateur = analyseurEntree.nextInt();
                if (ageUtilisateur < 0 && 115 < ageUtilisateur) {
                    System.out.println("Attention : il fallait entrer un entier" 
                                        + " compris  entre 0 et  115");
                    ageUtilisateur = 25;
                }
                System.out.printf("\nLa facture sera établie pour l'achat de %d livre(s)" 
                                + " et un age de %d ans.\n\n", nbLivreAchete, ageUtilisateur);
                
                //Calcul Facture
                hTLivres = nbLivreAchete * PRIX_LIVRE;
                reductionDeduite = ageUtilisateur < AGE_REDUCTION ? REDUCTION * hTLivres : 0;
                tva = (hTLivres - reductionDeduite) * TAUX_TVA;
                totalTTC = hTLivres + tva;
                fraisPort = 50 < tva ? 0 : FRAIS_PORT;
                totalTTC += fraisPort;
                

                System.out.printf(FACTURE, hTLivres, reductionDeduite, tva, fraisPort, totalTTC );


            }
        }
        analyseurEntree.close();
    }
}
