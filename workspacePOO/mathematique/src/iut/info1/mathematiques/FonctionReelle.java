/*
 * FonctionReelle.java                             3 jan. 2023
 * IUT de Rodez, info1 2022-2023, pas de copyright ni "copyleft"
 */
package iut.info1.mathematiques;

/**
 * 
 * @author info1 TP2
 */
public class FonctionReelle {

    /**
     * Elevation d'un flottant à une puissance entière naturelle
     * TODO cas particuliers
     * @param x nombre à élevé à la puissance
     * @param n exposant (positif ou nul)
     * @return <ul><li>x puissance n si calculable</li>
     *             <li>TODO cas NaN ou Infinis</li>
     *         </ul>
     * @throws IllegalArgumentException si n négatif
     */
    public static double puissance(double x, int n) {
        // TODO écrire le corps
        if (n < 0) {
            throw new IllegalArgumentException("Exposant <0 non utilisable");
        } else if (n == 0) {
            return 1.0;
        } else if (n == 1) {
            return x;
        }
        // else
        double resultat;
        if (estPair(n)) {
            resultat = puissance(x*x, n/2);
        } else {
            resultat = x * puissance(x*x, (n-1)/2);
        }
        return resultat; // bouchon
    }
    
    /**
     * @param n l'entier à tester
     * @return true si n est pair false sinon
     */
    private static boolean estPair(int n) {
        return n%2 == 0;
    }
}