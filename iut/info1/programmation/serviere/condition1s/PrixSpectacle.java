/*
 * PrixSpectacle.java                                      23-10-2022
 * IUT de Rodez, pas droit d'auteur
 */

package iut.info1.programmation.serviere.condition1s;

import java.util.Scanner;

/**
 * Utilisation des bloc conditionelle 
 * pour afficher le prix d'un billet de spectacle
 * Servière
 * @author François de Saint Palais
 */
public class PrixSpectacle {
    
    /**
     * Demande à l'utilisateur le type de spectacle qu'il veut
     * aller voir, 
     * sa catégorie (scolaire, étudiant),
     * son âge et s'il a une carte adhérente
     * 
     * Si le spectateur est un étudiant ou est scolaire, 
     *     il obtient une reduction de 8€
     * Sinon s'il a moins de 25, 
     *     il obtient une réduction de 4€, non cumulable
     * Si il a une carte d'adhérent,
     *     il obtinet une reduction sur un ou plusieur spectacle 
     *     en fonction de sa catégorie
     *     scolaire : tous
     *     étudiant : opéra, danse
     *     moins 25 : opéra
     *     plus 25 : danse
     * 
     * Il affichera en retour la reduction ainsi que le montant
     * du billet
     * @param args inutilisé
     */
    public static void main(String[] args) {
        final int PRIX_THEATRE = 25;
        final int PRIX_OPERA = 32;
        final int PRIX_CONCERT = 27;
        final int PRIX_DANSE = 29;
        String categorie;
        int age;
        boolean carteAdherent;
        String reponseCarteAdherent;
        int reductionAccorde = 0;
        String spectacleChoisie;
        int montantFinal = 0;

        Scanner analyseurLexical = new Scanner(System.in);
        
        
        System.out.print("Entrez votre categorie " + 
                        "(scolaire / etudiant / autre) : ");
        categorie = analyseurLexical.next();
        System.out.print("Entrez votre âge : ");
        age = analyseurLexical.nextInt();
        System.out.print("Etes vous adhérent ? (Y/N) : ");
        reponseCarteAdherent = analyseurLexical.next();
        System.out.print("Entrez le spectacle que vous aller voir. " + 
                        "(Théatre : t / Opéra : o / Concert : c / Dance : d) : ");
        spectacleChoisie = analyseurLexical.next();

        
        carteAdherent = reponseCarteAdherent.equalsIgnoreCase("Y");

        if (categorie.equalsIgnoreCase("scolaire")) {
            reductionAccorde = -8;
            if (carteAdherent) {
                reductionAccorde += -3;
            }
        }
        else if (categorie.equalsIgnoreCase("etudiant")) {
                reductionAccorde = -8;
                if (carteAdherent 
                    && (spectacleChoisie.equalsIgnoreCase("o") 
                    || spectacleChoisie.equalsIgnoreCase("d"))) {
                    reductionAccorde += -3;
                }
        }
        else if (age <= 25) {
            reductionAccorde = -4;
            if (carteAdherent && spectacleChoisie.equalsIgnoreCase("o")) {
                reductionAccorde += -3;
            }
        }
        else if (carteAdherent && spectacleChoisie.equalsIgnoreCase("o")) {
            reductionAccorde += -3;
        }
        
        if (spectacleChoisie.equalsIgnoreCase("t")) {
            montantFinal = PRIX_THEATRE + reductionAccorde;
        }
        else if (spectacleChoisie.equalsIgnoreCase("o")) {
            montantFinal = PRIX_OPERA + reductionAccorde;
        }
        else if (spectacleChoisie.equalsIgnoreCase("c")) {
            montantFinal = PRIX_CONCERT + reductionAccorde;
        }
        else if (spectacleChoisie.equalsIgnoreCase("d")) {
            montantFinal = PRIX_DANSE + reductionAccorde;
        }

        System.out.printf("\n\nVotre reduction pour ce spectacle est de %d\n" 
                        + "Le montant final est de %d euros",(-reductionAccorde),montantFinal);

        analyseurLexical.close();
    }
}