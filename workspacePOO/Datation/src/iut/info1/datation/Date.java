/*
 * Date.java                                            08 févr. 2023
 * IUT de Rodez, pas de droit d'auteur
 */

package iut.info1.datation;

import java.util.Objects;

/**
 * Date grégorienne de la forme jj/mm/aaaa
 * dans une période AN_MIN à AN_MAX
 *
 * @author François de Saint Palais
 */
public class Date implements Comparable<Date>{

    /** Numéro d'année minimal du calendrier */
    public static final int AN_MIN = 1850;

    /** Numéro d'année maximal du calendrier */
    public static final int AN_MAX = 2100;

    /** Séparateur de date pour la locale française */
    private static final String SEPARATEUR = "/";
    
    public final static int[] DUREE_STANDARD_MOIS 
    = {31,28,31,30,31,30,31,31,30,31,30,31}; 
    
    /**  */
    private int dateHache;

    /**
     * Initialise la date jj/mm/aaaa si valide
     * @param jj   le numéro de jour entre 1 et 31
     * @param mm   le numéro de mois entre 1 et 12
     * @param aaaa le numéro d'année entre AN_MIN et AN_MAX
     * @throws IllegalArgumentException si la date n'est pas valide
     */
    public Date(int jj, int mm, int aaaa) {
        super();
        if (!isValide(jj, mm, aaaa)) {
            throw new IllegalArgumentException(String.format(
                    "Date(%d,%d,%d) invalide", jj,mm,aaaa));
        } else {
            dateHache = jj + (mm*100) + (aaaa*10_000);
        }
    }

    /** @return le numéro de jour entre 1 et 31*/
    public int getJj() {
        return dateHache % 100;
    }

    /** @return le numéro de mois entre 1 et 12*/
    public int getMm() {
        return (dateHache % 10_000) / 100;
    }

    /** @return le numéro d'année entre AN_MIN et AN_MAX*/
    public int getAaaa() {
        return dateHache / 10_000;
    }

    /* non javadoc - @see java.lang.Object#toString() */
    @Override
    public String toString() {
        return ((""+getJj()).length() < 2 ? "0" + getJj() : getJj())
               + SEPARATEUR + 
               ((""+getMm()).length() < 2 ? "0" + getMm() : getMm()) 
               + SEPARATEUR + getAaaa();
    }

    @Override
	public int hashCode() {
		return Objects.hash(dateHache);    
	}
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return dateHache == other.dateHache;
	}

/** Vérifier la validité d'une date grégorienne
    * @param jour  jour de la date
    * @param mois  mois de la date
    * @param annee année de la date
    * @return      true si la date est valide, false sinon
    */
   private static boolean isValide(int jour, int mois, int annee) {
       
       return     AN_MIN <= annee && annee <= AN_MAX 
              &&       1 <= mois  &&  mois <=   12   
              &&       1 <= jour 
              && (jour <= DUREE_STANDARD_MOIS[mois - 1]
                  /* sauf cas du 29/2 d'une année bissextile */
                  || (jour == 29 // && mois == 2
                      && isBissextile(annee))
                 );
   }
   
   public static boolean isBissextile(int annee) {
       return      annee % 4 == 0 
               && (annee % 100 != 0 || annee % 400 == 0);
   }

	@Override
	public int compareTo(Date o) {
		return this.dateHache - o.dateHache;
	}
}
