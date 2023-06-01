/**
 * Rectangle2D.java                       1 juin 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.geometrie2D;

/**
 * //TODO Commenter la responsabilités de la classe Rectangle2D
 * @author de Saint Palais François
 *
 */
public class Rectangle2D {

    private Point2D hautGauche;
    
    private Point2D basDroit;
    
    private double hauteur;
    
    private double longueur;

    /**
     * @param hautGauche
     * @param basDroit
     * @param hauteur
     * @param longueur
     */
    public Rectangle2D(Point2D hautGauche, Point2D basDroit) {
        if (hautGauche.getX() > basDroit.getX()
            || hautGauche.getY() > basDroit.getY()) {
            throw new IllegalArgumentException("Erreur : vous avez inversé les "
                                               + "deux points");
        }
        this.hautGauche = hautGauche;
        this.basDroit = basDroit;
        this.hauteur = basDroit.getY() - hautGauche.getY();
        this.longueur = basDroit.getX() - hautGauche.getX();
    }

    /**
     * @param hautGauche
     * @param hauteur
     * @param longueur
     */
    public Rectangle2D(Point2D hautGauche, double hauteur, double longueur) {
        if (hauteur < 0.0 || longueur < 0.0) {
            throw new IllegalArgumentException("Erreur : Les dimension doivent "
                                               + "être positive");
        }
        this.hautGauche = hautGauche;
        this.hauteur = hauteur;
        this.longueur = longueur;
        this.basDroit = new Point2D(hautGauche.getX() + longueur,
                                    hautGauche.getY() + hauteur);
    }

    /**
     * 
     * @param rectangle2d
     * @return
     */
    public Rectangle2D reunion(Rectangle2D autre) {
        Point2D a = new Point2D(hautGauche.getX() < autre.hautGauche.getX() ? 
                                hautGauche.getX() : autre.hautGauche.getX(),
                                hautGauche.getY() < autre.hautGauche.getY() ? 
                                hautGauche.getY() : autre.hautGauche.getY());
        Point2D b = new Point2D(hautGauche.getX() > autre.hautGauche.getX() ? 
                                hautGauche.getX() : autre.hautGauche.getX(),
                                hautGauche.getY() > autre.hautGauche.getY() ? 
                                hautGauche.getY() : autre.hautGauche.getY());
        return new Rectangle2D(a, b);
    }

    /**
     * 
     * @return
     */
    public double perimetre() {
        return 2 * hauteur + 2 * longueur;
    }

    @Override
    public String toString() {
        Point2D hautDroit = new Point2D(basDroit.getX(), hautGauche.getY());
        Point2D basGauche = new Point2D(hautGauche.getX(), basDroit.getY());
        return "rectangle [" + hautGauche+ ", " + hautDroit + ", " 
                + basDroit + ", " + basGauche + "]";
    }
    
    
    
    
}
