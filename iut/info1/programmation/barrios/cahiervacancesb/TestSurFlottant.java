/*
 * TestSurFlottant.java                                  15 dec.2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.cahiervacancesb;

/**
 * Manipulation des flottants
 * @author François de Saint Palais
 */
public class TestSurFlottant {

    /**
     * Ce programme a pour objectif de tester les possibilités des flottants,
     * mais aussi les limites
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        float a;
        float b;

        b = 1.0F;
        a = 999999e-6F;

        System.out.printf("%f - %f = %f\n\n",b,a, b - a);

        a = Float.MAX_VALUE;
        b = Float.MIN_NORMAL;

        System.out.printf("Max = %f\nMin = %f\nMax + Min = %f\n\n",a , b, a + b);


        a = 0.0f;
        b = -0.0f;
        System.out.printf("%f == %f -> %b",a,b, a == b);
    }
}