/**
 * TestPersonneSansJUnit.java                       23 mars 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package test.iut.info1.population;



import iut.info1.datation.Date;
import iut.info1.population.Personne;

/**
 * Test unitaire de la Classe Personne.
 * @author François de Saint Palais
 */
public class TestPersonneSansJUnit {
    private static String[] nirValide;
    private static String[] nomValide;
    private static String[] prenomValide;
    private static Date[] dateNaissValide;    
    private static Personne[] personneValide;

    /**
     * Appelle des différentes méthodes de tests.
     * @param args inutilisé
     */
    public static void main(String[] args) {
        testPersonneNonOk();
        testPersonneOk();
        testToStringPersonne();
    }
    
    
    private static void testToStringPersonne() {
        boolean testReussi = true;
        
        System.out.println("Debut test méthode toString ");
        for (int i = 0; i < personneValide.length; i++) {
            testReussi = testReussi && 
            personneValide[i].toString().equals(
                combinaisonToString(nirValide[i%nirValide.length],
                                    nomValide[i%nomValide.length],
                                    prenomValide[i%prenomValide.length],
                                    dateNaissValide[i%dateNaissValide.length]));
        }
        if (testReussi) {
            System.out.println("\tTest méthode toString reussi");
        } else {
            System.out.println("Echec de test méthode toString.");
        }
    }

    private static String combinaisonToString(String nir, String nom, 
    String prenom, Date dateNaiss) {
        return nom + " " + prenom + ", né le " + dateNaiss + ". NIR : " + nir;
    }


    /**
     * Test du constructeur Personne avec des donnée valide.
     * Si tous les tests ont réussi cette méthode initialisera
     * la liste de Personne personneValide pour d'autre test.
     */
    private static void testPersonneOk() {
        //TODO Écrire les tests
        /** Ce sont des numéros fictif, généré aléatoirement */
        final String[] NIR_VALIDE 
        = {"201030160112301", "102040273298701",
           "204020300123401", "103050486543201", "202030219876501"};

        final String[] NOM_VALIDE 
        = {"de Saint Palais",
           "Dupont", "Martin", "Dubois", "Lefebvre", "Moreau", "Lambert", 
           "Lloris", "Maignan", "Mandanda", "Varane", "Kimpembe", "Koundé", 
           "Lenglet", "Pavard", "Digne", "Hernandez", "Pogba", "Kanté", 
           "Tolisso", "Rabiot", "Bakayoko", "Lemar", "Coman", "Griezmann", 
           "Mbappé", "Benzema", "Giroud", "Dembele", "Thauvin"};
        
        final String[] PRENOM_VALIDE
        = {"François",
           "Hugo", "Mike", "Steve", "Raphaël", "Presnel", "Jules", 
           "Clément", "Benjamin", "Lucas", "Theo", "Paul", "N'Golo", 
           "Corentin", "Adrien", "Tiemoué", "Thomas", "Kingsley", 
           "Antoine", "Kylian", "Karim", "Olivier", "Ousmane", "Florian"};

        final Date[] DATE_NAISS_VALIDE
        = {new Date(10, 8, 1995),
           new Date(2, 11, 1987),
           new Date(21, 4, 2000),
           new Date(15, 12, 1973),
           new Date(29, 7, 1992)
          };
        boolean testReussi = true;
        Personne[] personneValideTest = new Personne[NOM_VALIDE.length];
        
        System.out.println("Debut test constructeur avec valeur valide");
        for (int i = 0; i < NOM_VALIDE.length; i++) {
            testReussi 
            = testReussi && verifierCombinaisonValide(
                            NIR_VALIDE[i%NIR_VALIDE.length],
                            NOM_VALIDE[i%NOM_VALIDE.length],
                            PRENOM_VALIDE[i%PRENOM_VALIDE.length],
                            DATE_NAISS_VALIDE[i%DATE_NAISS_VALIDE.length]);
            if (testReussi) {
                personneValideTest[i] 
                = new Personne(NIR_VALIDE[i%NIR_VALIDE.length],
                        NOM_VALIDE[i%NOM_VALIDE.length],
                        PRENOM_VALIDE[i%PRENOM_VALIDE.length],
                        DATE_NAISS_VALIDE[i%DATE_NAISS_VALIDE.length]);
            }
        }
        if (!testReussi) {
            System.err.println("Echec de test constructeur avec Personne"
                               + " valide.");
        } else {
            System.out.println("\tTest constructeur Personne valides reussi");
            /* On initialise la liste de personne valide 
             * de la classe pour de future test. 
             */
            personneValide = personneValideTest;
            nirValide = NIR_VALIDE;
            nomValide = NOM_VALIDE;
            prenomValide = PRENOM_VALIDE;
            dateNaissValide = DATE_NAISS_VALIDE;
        }
    }

    /**
     * Permet de vérifier si la combinaison nir, nom, prenom, dateNaiss
     * est valide pour l'état civil d'une Personne 
     * selon l'état Français.
     * @param nir       Le NIR testé
     * @param nom       Le nom testé
     * @param prenom    Le prénom testé
     * @param dateNaiss La date de naissance testé
     * @return true si l'état civil est valide, false sinon.
     */
    private static boolean verifierCombinaisonValide(String nir, String nom, 
                                                String prenom, Date dateNaiss) {
        try {
            new Personne(nir, nom, prenom, dateNaiss);
            return true;
        } catch (IllegalArgumentException e) {
            System.err.printf("Echec de test pour les valeur : %s, %s, %s, %s%n",
                    nir,nom,prenom,dateNaiss);
            return false;
        }
    }

    /**
     * Test du constructeur Personne avec des données INvalides
     */
    private static void testPersonneNonOk() {
        /** Liste de NIR invalide selon l'état français */
        final String[] nirInvalide 
        = {"0",                //Il faut 15 caractère
           "0123456789012345", //Pas plus de 15 caractère
           "00000000000000",   //Invalide
           ""                  //Chaîne vide
           };  
        
        /** Liste de nom invalide selon l'état français */
        final String[] nomInvalide
        = {"",     //Chaîne vide
           "   ",  //N'est composé que d'espace
           "13",   //Un chiffre
           "\"); DROP TABLE USER;", //Injection SQL
           "M@rtin",
           "Dub0is"
           };
        
        /** Liste de prénom invalide selon l'état français */
        final String[] prenomInvalide
        = {"",     //Chaîne vide
           "   ",  //N'est composé que d'espace
           "13",   //Un chiffre
           "\"); DROP TABLE USER;", //Injection SQL
           "0phélie"
           };
        
        /** Liste de date de naissance invalide*/
        final Date[] dateInvalide
        = {new Date(1, 1, 1850),
           new Date(1,1,2024)
        };
        boolean testReussi = true;
        
        System.out.println("Debut test constructeur avec valeur invalide");
        for (Date date : dateInvalide) {
            for (String nom : nomInvalide) {
                for (String prenom : prenomInvalide) {
                    for (String nir : nirInvalide) {
                        testReussi = testReussi && 
                                     verifierCombinaisonInvalide(nir,nom,prenom,
                                                                 date);
                    }
                }
            }
        }
        
        if (testReussi) {
            System.out.println("\tTest constructeur Personne invalides reussi");
        } else {
            System.out.println("Echec de test constructeur avec Personne"
                               + " invalide.");
        }
    }
    
    /**
     * Permet de vérifier si la combinaison nir, nom , prenom , dateNaiss 
     * est un état civil invalide.
     * @param nir       Le NIR testé
     * @param nom       Le nom testé
     * @param prenom    Le prénom testé
     * @param dateNaiss La date de naissance testé
     * @return true s'il y a eu génération d'une exception false sinon
     */
    private static boolean verifierCombinaisonInvalide(String nir, String nom, 
                                               String prenom, Date dateNaiss) {
        try {
            new Personne(nir, nom, prenom, dateNaiss);
            System.out.printf("Echec de test pour les valeur : %s, %s, %s, %s%n",
                    nir,nom,prenom,dateNaiss);
            return false;
        } catch (IllegalArgumentException e) {
            return true;
        }
    }
}
