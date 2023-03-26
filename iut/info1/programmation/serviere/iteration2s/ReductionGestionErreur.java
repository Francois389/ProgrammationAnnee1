
/*
 *  ReductionGestionErreur.java                          01 dec. 2022
 * IUT de Rodez, pas de droit d'auteur          
 */

package iut.info1.programmation.serviere.iteration2s;
import java.util.Scanner;

/**
 * Ce programme détermine le taux de la réduction accordée à un client, selon la
 * quantité de produits commandés, et le délai de paiement habituel. Si
 * l'utilisateur commet une erreur lors de la saisie d'une valeur, la saisie est
 * recommencée.
 * 
 * @author François de Saint Palais
 * @version 1.0
 */
public class ReductionGestionErreur {

    /**
     * Programme principal
     * @param args argument non utilsé
     */
    public static void main(String[] args) {

        // déclaration d'un objet Scanner pour les opérations de saisie
        Scanner analyseurEntree = new Scanner(System.in);

        // constantes définissant les taux de remise et les seuils
        final double TAUX_BAS = 5,        // taux de la remise basse
                     TAUX_MOYEN = 10,     // taux de la remise moyenne
                     TAUX_ELEVE = 15;     // taux de la remise élevée

        final int SEUIL_BAS = 2000,       // seuil pour la remise basse
                  SEUIL_MOYEN = 3000,     // seuil pour la remise moyenne
                  SEUIL_ELEVE = 4000;     // seuil pour la remise élevée

        final String MESSAGE_ERREUR = "Erreur : il faut entrer I, i, S, s ou R, r";

        boolean saisieOk;

        String reponse;

        int quantiteCommander;

        double tauxAccorde;

        saisieOk = false;
        tauxAccorde = 0.0;
		do {
            System.out.print("Donnez le délai de paiement habituel ('I'mmédiat, 'S'ans retard, avec 'R'etard) : ");
            reponse = analyseurEntree.next().toUpperCase();
            if (reponse.length() > 1) {
                System.out.println(MESSAGE_ERREUR);
            } else if (reponse.equals("I")
                       || reponse.equals("R")
                       || reponse.equals("S")) {
                saisieOk = true;
                System.out.print("Entrez la quantité de produits commandés ..... : ");
                quantiteCommander = analyseurEntree.nextInt();
                analyseurEntree.close();
                switch (reponse) {
                    case "I":
                        if (quantiteCommander >= SEUIL_BAS 
                            && quantiteCommander < SEUIL_MOYEN) {
                            tauxAccorde = TAUX_BAS;
                        } else if (SEUIL_MOYEN <= quantiteCommander 
                                   && quantiteCommander < SEUIL_ELEVE) {
                            tauxAccorde = TAUX_MOYEN;
                        } else if (SEUIL_ELEVE <= quantiteCommander) {
                            tauxAccorde = TAUX_ELEVE;
                        }
                        break;
                    case "S":
                        if (SEUIL_MOYEN <= quantiteCommander 
                            && quantiteCommander < SEUIL_ELEVE) {
                            tauxAccorde = TAUX_BAS;
                        } else if (SEUIL_ELEVE <= quantiteCommander) {
                            tauxAccorde = TAUX_MOYEN;
                        }
                        break;
                    case "R":
                        if (SEUIL_ELEVE <= quantiteCommander) {
                            tauxAccorde = TAUX_BAS;
                        }
                        break;
                }
            } else {
                System.out.println(MESSAGE_ERREUR);
            }
        } while (!saisieOk);
		
        // on affiche le résultat
        System.out.printf("Ce client a droit à une remise de " 
                           + " %.2f %%\n",tauxAccorde);
    }
}
