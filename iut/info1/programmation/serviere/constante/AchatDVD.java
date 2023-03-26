/*
 * Achat.DVD                                               17/10/2022
 */

package iut.info1.programmation.serviere.constante;

import java.util.Scanner;


public class AchatDVD {
    /**
     * Affiche le montant hort frais de port 
     * le montant des frais de port 
     * le montant total à payer
     * le nb de point cadeau
     * @author François de Saint Palais
     */

     public static void main(String[] args) {
        /**
         * Demande à l'utilisateur le nb de DVD et de magazine
         * il gagne 1 point cadeau par tranche de 15€ d'achat sans les frais de port
         */

        final int PRIX_DVD = 39;
        final int PRIX_MAGAZINE = 9;
        final int FRAIS_DE_PORT = 7;
        final int TRANCHE_POINT_CADEAU = 15;

        Scanner analyseurLexical = new Scanner(System.in);

        System.out.print("Nombre de DVD acheté : ");
        int nbDVD = analyseurLexical.nextInt();
        System.out.print("Nombre de magazine acheté : ");
        int nbMagazine = analyseurLexical.nextInt();

        int total = nbDVD * PRIX_DVD + nbMagazine * PRIX_MAGAZINE;
        int totalAvecFraisPort = total + FRAIS_DE_PORT;
        int nbPointCadeau = total/TRANCHE_POINT_CADEAU;

        System.out.println("Montant hors frais de port : " + total);
        System.out.println("Montant Frais de port : " + FRAIS_DE_PORT);
        System.out.println("Montant total à payer : " + totalAvecFraisPort);
        System.out.println("Nombre de point cadeau obtenus : " + nbPointCadeau);

        analyseurLexical.close();
     }
}
