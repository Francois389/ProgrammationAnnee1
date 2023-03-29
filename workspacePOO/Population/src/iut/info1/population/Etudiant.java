/**
 * Etudiant.java                       27 mars 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.population;

import iut.info1.datation.Date;

/**
 * //TODO Commenter la responsabilités de la classe Etudiant
 * @author François de Saint Palais
 *
 */
public class Etudiant extends Personne {

    private String numeroEtudiant;
    
    public Etudiant(String nIR, String nom, String prenom, Date dateNaiss,String numeroEtudiant) {
        super(nIR, nom, prenom, dateNaiss);
        // TODO Vérifier la validité des informations
        this.numeroEtudiant = numeroEtudiant;
    }

    public String getNumeroEtudiant() {
        return numeroEtudiant;
    }

}
