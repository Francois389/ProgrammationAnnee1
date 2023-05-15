/**
 * PointGPS.java                       15 mai 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.geographie;

import java.lang.Math;

/**
 * //TODO Commenter la responsabilités de la classe PointGPS
 * @author François de Saint Palais
 *
 */
public class PointGPS {

    private double latitude;
    
    private double longitude;
    
    public PointGPS(double latitude, double longitude) {
        // TODO Auto-generated constructor stub
        if (-90.0 <= latitude && latitude <= 90.0 
            && -180.0 <= longitude && longitude <= 180.0 ) {
            this.latitude = latitude;
            this.longitude = longitude;
        } else {
            throw new IllegalArgumentException("Erreur : la latitude doit étre "
                    + "compris entre -90 et 90 et la longitude entre -180 et "
                    + "180");
        }
    }
    
    public double getLatDeg () {
        return latitude;
    }

    public double getLatRad () {
        return Math.toRadians(latitude);
    }

    public double getLonDeg () {
        return longitude;
    }
    

    public double getLonRad () {
        return Math.toRadians(longitude);
    }

    @Override
    public String toString() {
        String chaine = "(";
        if (latitude >= 0.0) {
            chaine += "+" + latitude;
        } else {
            chaine += "-" + latitude;
        }
        chaine += " ; " ;
        
        if (longitude >= 0.0) {
            chaine += "+" + longitude;
        } else {
            chaine += "-" + longitude;
        }
        
        return chaine + ")";
    }
    
    
}
