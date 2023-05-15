/**
 * LocalisationGPS.java                       15 mai 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.geographie.test;

import iut.info1.geographie.LocalisationGPS;

/**
 * Exemple de mise en oeuvre des classes de iut.info1.geographie
 * @author François de Saint Palais
 *
 */
public class EssaiGeographie {

    /** Pas d'instanciation nécessaire pour lancer ce programme de test */
    private EssaiGeographie() {}
    
    /**
     * Affichage sur console du diamétre du géoïde terrestre
     * et de la distance entre 2 points localisé par GPS
     * @param args non utilisé
     */
    public static void main(String [] args) {
        LocalisationGPS poleNord = new LocalisationGPS("Pôle nord", 90.0, 0.0);
        LocalisationGPS poleSud = new LocalisationGPS("Pôle sud", -90.0, 0.0);
        
        LocalisationGPS iut
        = new LocalisationGPS("IUT de Rodez", 44.360248, 2.575638);
        
        LocalisationGPS universite
        = new LocalisationGPS("Université Toulouse Capitole", 43.606335, 1.435553);
        
        System.out.println(universite);
        
        System.out.printf("Circonférence du géoïde (pôle à pôle) = %6.0f km\n\n",
                          + 2.0 * poleNord.distance(poleSud));
        
        System.out.printf("%6.0f km entre\t", iut.distance(universite));
        System.out.println(iut + "\n\t     et\t" + universite);
    }
}
