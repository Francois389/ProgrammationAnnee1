/**
 * Personne.java                       23 mars 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.population;

import iut.info1.datation.Date;

/**
 * Définit une personne.
 * Cette personne est défini par :
 * <ul>
 *     <li>son NIR (dit aussi numéro INSEE)</li>
 *     <li>son nom</li>
 *     <li>son prénom</li>
 *     <li>sa date de naissance</li>
 * </ul>
 * @author François deSaint Palais
 *
 */
public class Personne {
    
    private static final String REGEX_PRENOM_INVALIDE 
    = "[^0-9*-/+&~\\\"#\\\\{(|`_^@)\\[\\]=},?.;:!§ù%¨$£¤²]*";

    /** L'âge maximal d'un individu. 
     * Au delà la date de naissance serais jugé invalide. */
    final static int AGE_MAX = 130;
    
    /** Le Numéro d'Inscription au Répertoire 
     * des personnes physiques il identifie chaque individu 
     * de manière unique*/
    private String NIR;
    
    /** Le nom de la personne */
    private String nom;
    
    /** Le prénom de la personne */
    private String prenom;
    
    /** La date de naissance de la personne */
    private Date dateNaiss;

    /**
     * Constructeur d'une Personne
     * @param nIR Le numéro NIR (ou INSEE)
     * @param nom Le nom
     * @param prenom Le prénom
     * @param dateNaiss La date de naissance. La date doit être valide.
     */
    public Personne(String nIR, String nom, String prenom, Date dateNaiss) {
        super();
        if (!estValide(nIR, nom, prenom, dateNaiss)) {
            throw new IllegalArgumentException("Erreur. "
                                               + "Une des entrés est invalide");
        }
        NIR = nIR;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
    }
    
    /** Retourne la valeur de NIR */
    public String getNIR() {
        return NIR;
    }

    /** Retourne la valeur de nom */
    public String getNom() {
        return nom;
    }

    /** Retourne la valeur de prenom */
    public String getPrenom() {
        return prenom;
    }

    /** Retourne la valeur de dateNaiss */
    public Date getDateNaiss() {
        return dateNaiss;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + ", né le " + dateNaiss + ". NIR : " + NIR;
    }
    
    /**
     * Retourne l'age que la personne aura a l'anné visé.
     * @param anneeVise
     * @return
     */
    public int ageEn(int anneeVise) {
        int age;
        
        return 0;
    }

    private boolean estValide(String nir, String nom, 
                              String prenom, Date dateNaiss) {
        return    nirEstValide(nir) && nomEstValide(nom) 
               && prenomEstValide(prenom) && dateNaissEstValide(dateNaiss);
    }

    private boolean dateNaissEstValide(Date dateDeNaissance) {
        // TODO écrire corps de dateNaissEstValide
        return dateDeNaissance.getAaaa() >= 1900 ||
                dateDeNaissance.getAaaa() < 2024;
    }

    private boolean prenomEstValide(String prenom) {
        // TODO écrire le corps de prenomEstValide
        return    !prenom.isBlank() 
               && prenom.matches(REGEX_PRENOM_INVALIDE);
    }

    private boolean nomEstValide(String nom) {
        // TODO écrire le corps de nomEstValide
        return prenomEstValide(nom);
    }

    private boolean nirEstValide(String nir) {
        // TODO écrire le corps de nirEstValide
        if (nir.isBlank()) {
            return false;
        }
        return true;
    }
}
