/*
 * PuissanceEntiere.java                                 03 jan. 2023
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.programmation.barrios.cahiervacancesb;

/**
 * Calcul d'une puissance entière
 * @author François de Saint Palais
 */
public class PuissanceEntiere {
    
    /**
     * 
     * @param args inutilisé
     */
    public static void main(String[] args) {
        //TODO Test
        double[] x = {-1.01,0,1.01},
                 attendu = {1.0,0,10.1};
                 
        int[] n = {0,1,10};


        for (int i = 0; i < n.length; i++) {
            System.out.printf("%f^%d = %f",x[i],n[i],puissance(x[i],n[i]));
            if (puissance(x[i],n[i]) == attendu[i]) {
                System.out.println(" | Valide");
            } else {
                System.out.println(" /!\\Invalide/!\\ ");
            }
        }

    }

    /**
     * Eleve x à la puisssance n
     * @param x le nombre à exponencier
     * @param n la puissance
     * @return <ul> <li> x puissance n </li>
     *              <li> TODO cas NaN et Inf </li>
     *         </ul> 
     * 
     * @throws IllegalArgumentException
     */
    public static double puissance(double x, int n) {
        //TODO corps
        if (n < 0) {
            throw new IllegalArgumentException("Puissance <0 inutilisable");
        } else {
            
        }
        return 1.0; // bouchon
    }
}
