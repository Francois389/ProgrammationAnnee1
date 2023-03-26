/*
 * HoraireTravail.java                                   18 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.serviere.iteration2s;

import java.util.Scanner;

/**
 * Utilisation de l'instruction switch avec plusieurs valeurs pour un même cas.
 * 
 * @author François de Saint Palais
 */
public class HoraireTravail {
    
    /**
     * Détermine l'horaire de debut de journée pour un salarié en fonction de
     * du jour de la semaine, et du numero de la semaine dans le mois.
     * 
     * Le salarié ne travail pas le dimanche.
     * il travail un samedi sur 2 (ou presque) 
     *     plus précisement le preméire et la troisieme semaine du mois. 
     *     Dans ce cas, sa journée débute à 8 heure 30
     * le mardi et le jeudi, il commence à 8 heure ou 9 heure selon la semaine.
     *     La premiére semaine du mois il commence à 8 heure 
     *     la suivante 9 heures.
     *     Ainsi de suite en alternance.
     * le cinquieme lundi du mois, il ne travaille pas. 
     *     Quand il travail le lundi, il débute à 9 heures.
     * les trois premier mercredi du mois il commence à 8 heure, 
     *     les autre à 14 heures
     * il ne travaila pas les 2 premiers vendredi du mois. 
     *     Le premier vendredi du mois où il travaille, 
     *     sa journée débute à 9 heure, 
     *     le suivant à 8h30 et eventuellement le suivant à 9h. 
     */
    public static void main(String[] args) {
        
        final String PAS_DE_TRAVAIL = "La personne ne travaille pas ce " 
                                      + "jour-la ! ",
                     COMMENCE_9 = "La personne débute à 9 heures",
                     COMMENCE_8 = "La personne débute à 8 heures",
                     COMMENCE_8_30 = "La personne débute à 8 heures 30",
                     COMMENCE_14 = "La personne débute à 14 heures";

        Scanner analyseurEntree = new Scanner(System.in);

        String jour;
        
        int numeroSemaine;

        boolean saisieOk;

        // saisie des données
        //initialisation pour le compilateur
        jour = "";
        numeroSemaine = 0;
        do {
            System.out.print("'L'undi  'M'ardi  'm'ercredi  'J'eudi" 
                             + "  'V'endredi 'S'amedi  'D'imanche\n" 
                             + "Entrez le jour de la semaine ....... : ");
            saisieOk = analyseurEntree.hasNextLine();
            if (saisieOk) {
                jour = analyseurEntree.next();
                if (jour.length() > 1) {
                    saisieOk = false;
                } else {
                    saisieOk = "LMmJVSD".contains(jour);
                    if (saisieOk) {
                        System.out.print("Entrez le rang de la semaine " 
                                         + "(de 1 à 5 )....... :");
                        saisieOk = saisieOk && analyseurEntree.hasNextInt();
                    }
                }
            }

            if (saisieOk) {
                numeroSemaine = analyseurEntree.nextInt();
                saisieOk = numeroSemaine >= 1 && numeroSemaine <= 5;
            } else {
                saisieOk = false;
                analyseurEntree.nextLine();
            }
        } while (!saisieOk);
        analyseurEntree.close();

        // traitement
        switch (jour) {
        case "L":
            if (numeroSemaine == 5) {
                System.out.println(PAS_DE_TRAVAIL);
            } else {
                System.out.println(COMMENCE_9);
            }
            break;
        case "M", "J":
            if (numeroSemaine % 2 == 0) {
                System.out.println(COMMENCE_9);
            } else {
                System.out.println(COMMENCE_8);
            }
            break;
        case "m":
            if (numeroSemaine <= 3) {
                System.out.println(COMMENCE_8);
            } else {
                System.out.println(COMMENCE_14);
            }
            break;
        case "V":
            if (numeroSemaine <= 2) {
                System.out.println(PAS_DE_TRAVAIL);
            } else if (numeroSemaine == 3) {
                System.out.println(COMMENCE_9);
            } else if (numeroSemaine == 4) {
                    System.out.println(COMMENCE_8_30);
            } else {
                System.out.println(COMMENCE_9);
            }
            break;
        case "S":
            if (numeroSemaine % 2 == 0) {
                System.out.println(COMMENCE_8_30);
            } else {
                System.out.println(PAS_DE_TRAVAIL);
            }
            break;
        default:
            System.out.println(PAS_DE_TRAVAIL);
            break;
        }

    }
}
