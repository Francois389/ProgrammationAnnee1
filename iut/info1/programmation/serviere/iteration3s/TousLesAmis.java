

/*
 * TousLesAmis.java                                      14 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */
package iut.info1.programmation.serviere.iteration3s;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Ce programme recherche toutes les paires de nombres amis (m,n) telles que : m
 *   n < m et n < 10000 
 *   m et  n sont amis
 * Deux nombres m et n sont dits "amis" si la
 * somme des diviseurs de m (m non compris) est égale à n, et si réciproquement,
 * la somme des diviseurs de n (n non compris) est égale à m.
 * 
 * @author François de Saint Palais
 * @version 1.0
 */
public class TousLesAmis {

    /**
     * Programme principal
     * @param args      argument non utilisé
     */
    public static void main(String[] args) {

        final int LIMITE = 100000;       // limite de la recherche

        LocalTime debut,
                  fin;
        
        Duration tempsEcouler;

        int dernierM,
            sommeDiviseurM;

        // on recherche les paires (n,m) de nombres amis avec m<n et n <= limite
        System.out.println("Avec la limite " + LIMITE
                           + " les paires de nombres amis sont ");
        dernierM = 220; //initialisation aux premier nombre ami
        debut = LocalTime.now();

        for (int m = 284; m < LIMITE; m++) {
            sommeDiviseurM = SommeDiviseur(m);

            for (int n = dernierM; n < m; n++) {
                if (sommeDiviseurM == n && SommeDiviseur(n) == m) {
                    System.out.printf("(%5d,%5d) %5d ms\n",n,m,Duration.between(debut, LocalTime.now()).toMillis());
                    dernierM = m;
                }
            }
        }
        fin = LocalTime.now();
        tempsEcouler = Duration.between(debut, fin);
        System.out.println(tempsEcouler.toMillis() + " ms");
    }

    public static int SommeDiviseur(int n) {
        int diviseur,
            sommeDiviseur;

        diviseur = 1;
        sommeDiviseur = 0;
        while (diviseur < n && diviseur != n) {
            if (n % diviseur == 0) {
                sommeDiviseur += diviseur;
            }
            diviseur ++;
        }
        return sommeDiviseur;
    }
}