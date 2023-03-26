/*
 * CombienDuree                                          29 oct. 2022
 * IUT de Rodez, pas de copyright
 */

package iut.info1.programmation.serviere.condition1s;

import java.util.Scanner;

/**
 * Utilisation des blocs conditionelles
 * @author Francçois de Saint Palais
 */
public class CombienDuree {

    /**
     * Demande à l'utilisateur 3 durée en HH:MM,SS
     * et affiche le nombre de durée différente.
     * @param inutilisé
     */
    public static void main(String[] args) {
        
        int heure1;
        int minute1;
        int seconde1;
        int heure2;
        int minute2;
        int seconde2;
        int heure3;
        int minute3;
        int seconde3;

        int dureeDifferente = 3;

        Scanner analyseurScanner = new Scanner(System.in);

        
        System.out.print("Entrez le nombre d'heure d'une premiére durée : ");
        heure1 = analyseurScanner.nextInt();
        System.out.print("Entrez le nombre de minute de la premiére durée : ");
        minute1 = analyseurScanner.nextInt();
        System.out.print("Entrez le nombre de seconde de la premiére durée : ");
        seconde1 = analyseurScanner.nextInt();

        System.out.print("Entrez le nombre d'heure d'une deuxième durée : ");
        heure2 = analyseurScanner.nextInt();
        System.out.print("Entrez le nombre de minute de la deuxième durée : ");
        minute2 = analyseurScanner.nextInt();
        System.out.print("Entrez le nombre de seconde de la deuxième durée : ");
        seconde2 = analyseurScanner.nextInt();

        System.out.print("Entrez le nombre d'heure d'une troisième durée : ");
        heure3 = analyseurScanner.nextInt();
        System.out.print("Entrez le nombre de minute de la troisième durée : ");
        minute3 = analyseurScanner.nextInt();
        System.out.print("Entrez le nombre de seconde de la troisième durée : ");
        seconde3 = analyseurScanner.nextInt();


        if (heure1 == heure2 && minute1 == minute2 && seconde1 == seconde2) {
            dureeDifferente --;
        }
        if (heure1 == heure3 && minute1 == minute3 && seconde1 == seconde3) {
            dureeDifferente --;
        }
        if (heure3 == heure2 && minute3 == minute2 && seconde3 == seconde2) {
            dureeDifferente --;
        }

        System.out.printf("Vous avez saisie %d durée différente", dureeDifferente);

        analyseurScanner.close();
    }
    
}
