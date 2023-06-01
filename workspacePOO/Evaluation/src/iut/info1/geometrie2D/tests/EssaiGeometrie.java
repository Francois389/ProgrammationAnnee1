/**
 * EssaiGeometrie.java                       1 juin 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.geometrie2D.tests;

import iut.info1.geometrie2D.Point2D;
import iut.info1.geometrie2D.Rectangle2D;

/**
 * //TODO Commenter la responsabilités de la classe EssaiGeometrie
 * @author de Saint Palais François
 *
 */
public class EssaiGeometrie {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Point2D a,
                b;
        
        Rectangle2D[] figures = new Rectangle2D[3];
        
        a = new Point2D(100.0, 25.2);
        b = new Point2D(150.0, 125.4);
        
        System.out.println("Voici les coins supérieru gauche : " + a
                           + "\net inférieur droit " + b
                           + "d'un premier rectangle : ");
        
        figures[0] = new Rectangle2D(a, b);
        System.out.println(figures[0]);
        
        System.out.println("\nVoici un deuxième rectangle : ");
        /*
         * Rectangle défini pas son coin supérieur gauche,
         * sa longueur et sa hauteur :
         */
        figures[1] = new Rectangle2D(new Point2D(130.0, 50.2),75.0,95.3);
        System.out.println(figures[1]);
        
        figures[2] = figures[0].reunion(figures[1]);
        System.out.println("\nLe plus petit rectangle contenent ces deux "
                           + "rectangle est : \n"
                           + figures[2]
                           + "\nde périmétre " + figures[2].perimetre());
        
    }

}
