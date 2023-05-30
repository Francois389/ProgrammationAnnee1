/**
 * PointGPS.java                       15 mai 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.geographie;

/**
 * Un point GPS sur le géosphére WGS84
 * @author François de Saint Palais
 */
public class PointGPS {

    /** Latitude en dégrées décimal */
    private double latitude;
    
    /** Longitude en dégrées décimal */
    private double longitude;
    
    public PointGPS(double latitude, double longitude) {
        // TODO Auto-generated constructor stub
        if (    latitude < -90.0  ||  90.0 < latitude
            || longitude < -180.0 || 180.0 < longitude) {
            throw new IllegalArgumentException("Erreur : la latitude doit étre "
                    + "compris entre -90 et 90 et la longitude entre -180 et "
                    + "180");
        }
        this.latitude = latitude;
        this.longitude = longitude;
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
    
    public double distance(LocalisationGPS autrePoint) {
        return LocalisationGPS.RAYON_TERRE 
               * Math.acos(Math.sin(this.getLatRad()) * Math.sin(autrePoint.getLatRad()))
               + Math.cos(this.getLatRad()) 
               * Math.cos(autrePoint.getLatRad())
               * Math.cos(autrePoint.getLonRad() - this.getLonRad());
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
