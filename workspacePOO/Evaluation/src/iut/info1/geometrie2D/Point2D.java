/**
 * Point2D.java                       1 juin 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.geometrie2D;

/**
 * //TODO Commenter la responsabilités de la classe Point2D
 * @author de Saint Palais François
 *
 */
public class Point2D {

    private double x;
    
    private double y;

    /**
     * @param x
     * @param y
     */
    public Point2D(double x, double y) {
        if (x < 0.0 || y < 0.0) {
            throw new IllegalArgumentException("Erreur : Les coordonnée doivent "
                                               + "être positive");
        }
        this.x = x;
        this.y = y;
    }

    /**
     * @return la valeur de x
     */
    public double getX() {
        return x;
    }

    /**
     * @return la valeur de y
     */
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "point(" + x + ", " + y + ")";
    } 

    
}
