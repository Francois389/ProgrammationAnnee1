/*
 * FactureEDF.java                                         13-10-2022
 * Affiche votre facture EDF
 */

 package iut.info1.programmation.serviere.constante;
 
 import java.util.Scanner; 
 
 public class FactureEDF {
    /**
     * Affiche la facture EDF de l'utilisateur
     * @author François de Saint Palais
     */

    public static void main(String[] args) {
        /**
         * Demande à l'utilisateur le nouveau relévé et l'ancien relevé de son compteur
         * et lui affiche sa facture EDF
         */
        Scanner analyseurLexical = new Scanner(System.in);

        final double PRIX_KWH_HT = 0.0883;
        final double ABONNEMENT_MENSUEL = 5.56;
        final double TAUX_TVA_CONSO_POURCENT = 0.2;
        final double TAUX_TVA_ABONNEMENT_POURCENT = 0.055;
        final double CONVERSION_EUROS_FRANC = 6.55957;
        
        System.out.print("Entrez l'ancien relevé : ");
        int ancienReleve = analyseurLexical.nextInt();
        System.out.print("Entrez le nouveau relevé : ");
        int nouveauReleve = analyseurLexical.nextInt();

        int consomation = nouveauReleve - ancienReleve;
        double montantHT = consomation * PRIX_KWH_HT + ABONNEMENT_MENSUEL;
        double montantTVA = TAUX_TVA_CONSO_POURCENT * consomation * PRIX_KWH_HT 
                            + ABONNEMENT_MENSUEL * TAUX_TVA_ABONNEMENT_POURCENT;
        double total = montantHT + montantTVA;
        double totalFranc = total * CONVERSION_EUROS_FRANC;

        if (ancienReleve <= nouveauReleve) {
            System.out.println("Consommation ................. : " + consomation);
            System.out.printf("Montant hors taxes ........... : %.3f \n", montantHT);
            System.out.printf("Montant de la TVA ............ : %.3f \n", montantTVA);
            System.out.printf("Total ........................ : %.3f \n", total);
            System.out.printf("Total en francs .............. : %.3f \n", totalFranc);
        } else {
            System.out.println("Erreur : l'ancien releve est supérieur aux nouveau relevé");
        }
        analyseurLexical.close();
    }
 }