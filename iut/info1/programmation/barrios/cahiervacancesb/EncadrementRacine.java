/*
 * EncadrementRacine.java                                17 dec. 2022
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.cahiervacancesb;

import java.util.Scanner;

/**
 * EncadrementRacine est une classe qui permet de calculer l'encadrement de la racine carrée d'un nombre.
 * 
 * @author François de Saint Palais
 */
public class EncadrementRacine {
    
    /**
     * Calcule l'encadrement de la racine carrée d'un nombre flottant donnée par l'utilisateur
     * On utilise la méthode de la dichotomie.
     * @param args inutilisé
     */
    public static void main(String[] args) {
        
        Scanner analyseurEntree = new Scanner(System.in);

        float x;
        float inf;
        float sup;
        float millieu;

        //Précision de l'encadrement
        float precision;

        boolean saisieOk;

        //STUB
        x = 4;
        precision = 0.0001f;

        do {
            System.out.print("Entrez un nombre positif : ");
            saisieOk = analyseurEntree.hasNextFloat();

            if (saisieOk) {
                x = analyseurEntree.nextFloat();

                if (x < 0) {
                    System.out.println("Le nombre doit être positif");
                    saisieOk = false;
                }

                System.out.print("Entrez la précision de l'encadrement : ");
                saisieOk = analyseurEntree.hasNextFloat();
            }
            
            if (saisieOk) {
                precision = analyseurEntree.nextFloat();

                if (precision <= 0) {
                    System.out.println("La précision doit être positive");
                    saisieOk = false;
                } else if (precision < 0.000001f) {
                    System.out.println("La précision doit être supérieure à" 
                                       + " 0.000001");
                    saisieOk = false;
                } else {
                    saisieOk = true;
                }

            } else {
                System.out.println("La valeur saisie n'est pas un nombre");
                analyseurEntree.next();
                analyseurEntree.nextLine();
            }
        } while (!saisieOk);
        analyseurEntree.close();    
        
        //détermination de inf et sup minorant et majorant de la racine de x
        inf = (1/(x+1))-1;
        sup = (x/10)+3;
                
        do {
            //Milieu de l'intervalle [inf,sup]
            millieu = (inf+sup)/2;
    
            //Mis à jour de inf et sup en fonction de la valeur de millieu
            if (millieu*millieu > x) {
                sup = millieu;
            } else {
                inf = millieu;
            }
        } while ((sup-inf) > precision);

        //Affichage de l'encadrement
        System.out.printf("L'encadrement de la racine de %f est [%f,%f]\n",
                          x, inf, sup);
    }
}
