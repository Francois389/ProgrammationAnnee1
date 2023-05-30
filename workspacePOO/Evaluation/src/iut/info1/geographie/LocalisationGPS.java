/**
 * LocalisationGPS.java                       15 mai 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.geographie;

/**
 * Lieu localisé pars ses coordonnées GPS (latitude ; longitude)
 * sur le géodésique WGS 84
 * @author de Saint Palais François
 *
 */
public class LocalisationGPS extends PointGPS {
    
    final static double RAYON_TERRE = 6371.0;
    
    /** Nom identifiant ce lieu (peut être la chaîne vide) */
    private String nomLieu;
    
    /**
     * Définition d'un lieu avec son nom et ses coordonnées
     * @param nomDuLieu nom identifiant ce lieu (facultatif)
     * @param latitude latitude en degrès décimaux (de -90 à 90)
     * @param longitude longitude en degrés décimaux (de -180 à 180)
     */
    public LocalisationGPS(String nomDuLieu, double latitude, double longitude) {
        super(latitude,longitude);
        nomLieu = nomDuLieu;
    }



    @Override
    public String toString() {
       String chaine = nomLieu + " " +"(";
        if (getLatDeg() >= 0.0) {
            chaine += "+" + getLatDeg();
        } else {
            chaine += "-" + getLatDeg();
        }
        chaine += " ; " ;
        
        if (getLonDeg() >= 0.0) {
            chaine += "+" + getLonDeg();
        } else {
            chaine += "-" + getLonDeg();
        }
        
        return chaine + ")";
    }
    
    

}
