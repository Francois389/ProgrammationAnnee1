/*
 * PolynomeSecondDegree.java                             15 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.cahiervacancesb;

import java.util.Scanner;

/**
 * Calcul des solutions d'un polynome du second degré
 * @author François de Saint Palais
 */
public class PolynomeSecondDegree {
    
    /**
     * Demande les coefficients réels a, b, c.
     * Résout l'équation si cela est possible
     * Vérifie les solutions
     */
    public static void main(String[] args) {
        
        Scanner analyseurEntree = new Scanner(System.in);

        float a;
        float b;
        float c;
        float determinant;
        float x1;
        float x2;

        boolean saisieValide;

        System.out.println("Résolution d'une équation du second degré de la forme ax^2+bx+c = 0.");
        a = 0; //Pour le contrôle du compilateur
        b = 0;
        c = 0;
        do {
            System.out.print("Entrez le réel a : ");
            saisieValide = analyseurEntree.hasNextDouble();
            if (saisieValide) {
                a = analyseurEntree.nextFloat();
                System.out.print("Entrez le réel b : ");
                saisieValide = analyseurEntree.hasNextDouble();
            }
            if (saisieValide) {
                b = analyseurEntree.nextFloat();
                System.out.print("Entrez le réel c : ");
                saisieValide = analyseurEntree.hasNextDouble();
            }
            if (saisieValide) {
                c = analyseurEntree.nextFloat();
            } else {
                System.out.println("\nVous n'avez pas saisie un nombre réel !\n");
            }
        } while (!saisieValide);
        analyseurEntree.close();

        determinant = b*b - 4*a*c;
        if (determinant < 0) {
            System.out.println("Aucune solution réel !");

        } else if (determinant == 0) {
            x1 = b/(2*a);
            System.out.printf("L'unique solution de %fx^2 + %fx + %f " 
                              + "dans les r\u00e9el est %f",a,b,c,x1);
            if (a*(x1*x1)+b*x1+c == 0) {
                System.out.printf("%f * %f^2 + %f * %f + %f == 0",a,x1,b,x1,c);
            }
            
        } else {
            x1 = (float) ((-b + Math.sqrt(determinant)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(determinant)) / (2 * a));
            System.out.printf("L'\u00e9quation %fx^2 + %fx + %f admet dans " 
                              + "les r\u00e9el, deux solutions : " 
                              + "\nx1 = %f\nx2 = %f\n",a,b,c,x1,x2);
            if (a*(x1*x1)+b*x1+c == 0 && a*(x2*x2)+b*x2+c == 0) {
                System.out.printf("%f * %f^2 + %f * %f + %f == 0" 
                                   + "\n%f * %f^2 + %f * %f + %f == 0",
                                   a,x1,b,x1,c,
                                   a,x2,b,x2,c);
            }
        }

    }
}
