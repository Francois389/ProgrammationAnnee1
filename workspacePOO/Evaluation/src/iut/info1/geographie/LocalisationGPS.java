/**
 * LocalisationGPS.java                       15 mai 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.geographie;

import iut.info1.geographie.PointGPS;
import java.lang.Math;

/**
 * //TODO Commenter la responsabilités de la classe LocalisationGPS
 * @author francois
 *
 */
public class LocalisationGPS {
    
    final static double RAYON_TERRE = 6371.0;
    
    private String nomLieu;
    
    private PointGPS position;

    public LocalisationGPS(String nomDuLieu, double latitude, double longitude) {
        // TODO Auto-generated constructor stub
        nomLieu = nomDuLieu;
        position = new PointGPS(latitude, longitude);
    }

    public double distance(LocalisationGPS autrePoint) {
        return LocalisationGPS.RAYON_TERRE 
               * Math.acos(  Math.sin(this.position.getLatRad()) 
                           * Math.sin(autrePoint.position.getLatRad()))
               +   Math.cos(this.position.getLatRad()) 
                 * Math.cos(autrePoint.position.getLatRad())
               * Math.cos(autrePoint.position.getLonRad() 
                          - this.position.getLonRad());
    }

    @Override
    public String toString() {
        return nomLieu + " " + position ;
    }
    
    

}
