/*
 * XPuissanceN.java                                      15 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.cahiervacancesb;

import java.util.Scanner;

/**
 * Calcul d'une puissance
 * @author François de Saint Palais
 */
public class XPuissanceN {
    
    /**
     * Calcul de x puissance n
     * avec x réel
     * et n entier naturel
     * 0^0 = 1
     * @param args inutilsé
     */
    public static void main(String[] args) {
        
        Scanner analyseurEntree = new Scanner(System.in);

        double x;
        double total;

        int n;

        boolean saisieValide;

        x = 2.;
        n = 2;
        do {
            System.out.print("Entrez un r\u00e9el (ex: 2,5) : ");
            saisieValide = analyseurEntree.hasNextDouble();
            if (saisieValide) {
                x = analyseurEntree.nextDouble();
    
                System.out.print("Entrez un entier naturel : ");
                saisieValide = analyseurEntree.hasNextInt();
            }
            if (saisieValide) {
                n = analyseurEntree.nextInt();
            } else {
                System.out.println("Vous n'avez pas entrez un nombre.");
                analyseurEntree.next();
                analyseurEntree.nextLine();
            }
        } while (!saisieValide);
        analyseurEntree.close();

        total = 1;
        for (int i = 0;  i < n; i++) {
            total *= x;
        }
        System.out.printf("%f",total);

    }
}
