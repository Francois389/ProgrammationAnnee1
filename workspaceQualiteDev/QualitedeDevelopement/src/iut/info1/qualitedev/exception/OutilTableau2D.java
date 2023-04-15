/*
 * Classe contenant différents traitements sur les tableaux à 2 dimensions
 * Les tableaux gérés contiendront des entiers.                        11/21
 * fichier OutilTableau2D.java
 */
package iut.info1.qualitedev.exception;


/**
 * Cette classe contient différentes méthodes permettant de traiter des tableaux
 * à 2 dimensions : initialiser une matrice, afficher/saisir son contenu,
 * calculer des sommes d'un sous-ensemble de valeurs de la matrice,
 * rechercher selon différents critères (présence, maximum ...)
 *     
 * @author C. Servières
 * @version 1.0
 * 
 */
public class OutilTableau2D {

    /** Message d'erreur si le tableau argument n'est pas créé (référence nulle) */
    private static final String ERREUR_REF_NULLE = 
            "Erreur. La matrice argument n'a pas été créée.";
    
    /** Message d'erreur si une ligne n'existe pas */
    private static final String ERREUR_LIGNE_INVALIDE = 
            "Erreur. La ligne numéro %d n'existe pas.";
    
    /** Message d'erreur si une colonne n'existe pas */
    private static final String ERREUR_COLONNE_INVALIDE = 
            "Erreur. La colonne numéro %d n'existe pas.";
    
    /** Message d'erreur si une colonne n'existe pas pour une ligne précise */
    @SuppressWarnings("unused")
    private static final String ERREUR_COL_INVALIDE_SUR_LIG = 
            "Erreur. La colonne numéro %d n'existe pas pour la ligne %d.";
    
    /** Message d'erreur si la matrice n'est pas carrée */
    private static final String ERREUR_MATRICE_NON_CARREE = 
            "Erreur. La matrice argument n'est pas carrée.";
    
    /** Message d'erreur si la matrice est irréguliére */
    private static final String ERREUR_MATRICE_IRREGULIERE =
            "Erreur. La matrice argument n'est pas réguliére.";
    
    private static final String ERREUR_MATRICES_INCOMPATIBLE = 
            "Erreur. Les deux matrice ne sont pas compatible pour l'opération.";
  
    
    
    /**
     * Calcule la somme des valeurs situées sur la ligne argument
     * @param table matrice à traiter 
     * @param ligne numéro de la ligne dont on calcule la somme
     * @return somme des valeurs de la ligne
     * @throws IllegalArgumentException levée si TODO : compléter
     */
     public static int sommeLigne(int[][] table, int ligne)  {    
        // TODO : coder la méthode
        int somme = 0;                  // somme des valeurs de ligne   
        if (table == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);            
        } 
        if (ligne > table.length - 1 || ligne < 0) {
            throw new IllegalArgumentException(String.format(ERREUR_LIGNE_INVALIDE, ligne));
        }
        for (int elt : table[ligne]) {
            somme += elt;
        }   
        return somme;
    }
    
    

    /**
     * Cette méthode affiche le tableau à 2 dimensions argument
     * @param table  tableau à afficher (contient des entiers)
     * @throws IllegalArgumentException levée si TODO : compléter    
     */
    public static void afficher(int[][] table) {
        // TODO : coder la méthode
        if (table == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        for (int[] ligne : table) {
            for (int elt : ligne) {
                System.out.printf("%d \t",elt);
            }
            System.out.print("\n");
        }
    }

    
    /**
     * Détermine si une matrice est carrée ou pas
     * @param table matrice à tester
     * @return un booléen égal à vrai ssi la matrice argument est carrée
     * @throws IllegalArgumentException levée si la référence table est nulle
     *         
     */
    public static boolean matriceCarree(int[][] table) {
        // TODO : coder la méthode
        if (table == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        for (int[] ligne : table) {
            if (ligne.length != table.length) {
                return false;
            }
        }
        return true;
    }

    
    /**
     * Calcule la somme des valeurs situées sur la première diagonale de la
     * matrice argument
     * @param table tableau à 2 dimensions à traiter
     * @return un entier égal à la somme des valeurs de la diagonale principale
     * @throws IllegalArgumentException levée si  la matrice n'est pas carré
     *                                            ou si elle est null
     */
    public static int sommePremiereDiag(int[][] table)  {
        int somme;
        // TODO compléter
        if (table == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        if (!matriceCarree(table)) {
            throw new IllegalArgumentException(ERREUR_MATRICE_NON_CARREE);
        }
        somme = 0;
        for (int i = 0; i < table.length; i++) {
            somme += table[i][i];
        }
        return somme;
    }
    
    /**
     * Calcule la somme des valeurs situées sur la colonne argument
     * @param table matrice à traiter
     * @param colonne numéro de la colonne dont on calcule la somme
     * @return somme des valeurs de la colonne
     * @throws IllegalArgumentException levée si la matrice est null
     */
    public static int sommeColonne(int[][] table, int colonne)  {
        int somme = 0;                      // somme des valeurs de la colonne
        // TODO : coder la méthode
        if (table == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        for (int[] ligne : table) {
            if (ligne.length-1 < colonne) {
                throw new IllegalArgumentException(String.format(ERREUR_COLONNE_INVALIDE,colonne));
            }
            somme += ligne[colonne];
        }
        return somme;
    }

    /**
     * Retourne true si eltRechercher est présent dans la matrice
     * @param matrice       matrice où chercher eltRechercher
     * @param eltRechercher l'entier recherché
     * @return true si eltRechercher est présent dans la matrice false sinon
     * @throws IllegalArgumentException levée si la matrice est null
     */
    public static boolean estPresent(int[][] matrice, int eltRechercher) 
    throws IllegalArgumentException {
        if (matrice == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        for (int[] ligne : matrice) {
            for (int elt : ligne) {
                if (elt == eltRechercher) {
                    return true;
                }
            }
        }
        return false;
        
    }
    
    /**
     * Retourne la valeur maximal de la matrice
     * @param matrice la matrice où on cherche le maximum
     * @return valeur max de matrice
     * @throws IllegalArgumentException levée si la matrice est null
     */
    public static int valeurMaximal(int[][] matrice) 
    throws IllegalArgumentException {
        if (matrice == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        int maximum = matrice[0][0];
        for (int[] ligne : matrice) {
            for (int elt : ligne) {
                if (maximum < elt) {
                    maximum = elt;
                }
            }
        }
        return maximum;
    }
    
    /**
     * Retourne l'index de la ligne dont la somme est maximal
     * @param matrice la matrice à traiter
     * @return un nombre
     * @throws IllegalArgumentException
     */
    public static int indexSommeLigneMaximum (int[][] matrice) 
    throws IllegalArgumentException{
        if (matrice == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        int indiceLigneMax = 0;
        int sommeLigneMax = sommeLigne(matrice,indiceLigneMax);
        if (matrice.length > 1) {
            for (int i = 1; i < matrice.length; i++) {
                if (sommeLigne(matrice, i) > sommeLigneMax) {
                    indiceLigneMax = i;
                    sommeLigneMax = sommeLigne(matrice,indiceLigneMax);
                }
            }
        }
        return indiceLigneMax;
    }
    

    /** TODO comment method role
     * @param matrice
     * @return La somme de l'anti diagonale
     * @throws IllegalArgumentException
     */
    public static int sommeAntidiagonale(int[][] matrice) 
    throws IllegalArgumentException{
        if (matrice == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        if (!matriceCarree(matrice)) {
            throw new IllegalArgumentException(ERREUR_MATRICE_NON_CARREE);
        }
        int somme = 0;
        for (int i = 1; i < matrice.length - 1; i++) {
            somme += matrice[i-1][matrice.length-i];
        }
        return somme;
    }
    
    /**
     * Vérifie si une matrice est réguliére ou non, 
     * c'est-à-dire qu'elle est carré ou rectangulaire. 
     * @param matrice la matrice à tester
     * @return true ou false
     */
    public static boolean estReguliere(int[][] matrice) {
        if (matrice == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        int taille = matrice[0].length;
        for (int[] ligne : matrice) {
            if (ligne.length != taille) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Revoie la somme de deux matrice
     * @param premiereMatrice
     * @param deuxiemeMatrice
     * @return la somme de deux matrice
     * @throws IllegalArgumentException Si une des deux matrice est null
     * @throws IllegalArgumentException Si une des deux matrice est iréguliére
     * @throws IllegalArgumentException Si les deux matrice ne sont pas du même type
     */
    public static int[][] sommeMatrice(int[][] premiereMatrice, int[][] deuxiemeMatrice) 
    throws IllegalArgumentException{
        if (premiereMatrice == null || deuxiemeMatrice == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        if (!estReguliere(premiereMatrice) || !estReguliere(deuxiemeMatrice)) {
            throw new IllegalArgumentException(ERREUR_MATRICE_IRREGULIERE);
        }
        if (   premiereMatrice.length    != deuxiemeMatrice.length 
            || premiereMatrice[0].length != deuxiemeMatrice[0].length) {
            throw new IllegalArgumentException(ERREUR_MATRICES_INCOMPATIBLE);
        }
        
        int[][] matriceResultat = 
                new int[premiereMatrice.length][premiereMatrice[0].length];
        for (int i = 0; i < matriceResultat.length; i++) {
            for (int j = 0; j < matriceResultat[i].length; j++) {
                matriceResultat[i][j] = 
                        premiereMatrice[i][j] + deuxiemeMatrice[i][j];
            }
        }
        return matriceResultat;
    }
    
   /** TODO comment method role
 * @param premiereMatrice
 * @param deuxiemeMatrice
 * @return une matrice resultat de la multiplication matricielle
 * @throws IllegalArgumentException
 */
public static int[][] muliplicationMatrice(int[][] premiereMatrice, int[][] deuxiemeMatrice) 
   throws IllegalArgumentException{
       if (premiereMatrice == null || deuxiemeMatrice == null) {
           throw new IllegalArgumentException(ERREUR_REF_NULLE);
       }
       if (!estReguliere(premiereMatrice) || !estReguliere(deuxiemeMatrice)) {
           throw new IllegalArgumentException(ERREUR_MATRICE_IRREGULIERE);
       }
       if (premiereMatrice[0].length != deuxiemeMatrice.length) {
           throw new IllegalArgumentException(ERREUR_MATRICES_INCOMPATIBLE);
       }
       int[][]matriceResultat = 
               new int[premiereMatrice.length][deuxiemeMatrice[0].length];
       
       for (int ligne = 0; ligne < matriceResultat.length; ligne++) {
           for (int colonne = 0; colonne < matriceResultat[ligne].length; 
                colonne++) {
               matriceResultat[ligne][colonne] = 
                       sommeProd(premiereMatrice[ligne], 
                                 getColonne(deuxiemeMatrice, colonne));
           }        
       }
       return matriceResultat;
    }
       
    /**
     * Equivalent à la fonction SOMMEPROD présent dans Excell.
     * Multiplie un à un chaque élement des deux matrices 
     * et retourne la somme de tous ces produits.
     * 
     * @param premiereMatrice
     * @param deuxiemeMatrice
     * @return la somme des produit de chaque élement des deux matrices
     * @throws IllegalArgumentException Si une des deux matrices est null
     * @throws IllegalArgumentException Si les deux matrice ne sont pas de 
     * la même taille
     */
    public static int sommeProd(int[] premiereMatrice, int[] deuxiemeMatrice) 
    throws IllegalArgumentException {
        if (premiereMatrice == null || deuxiemeMatrice == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        if (premiereMatrice.length != deuxiemeMatrice.length) {
            throw new IllegalArgumentException(ERREUR_MATRICES_INCOMPATIBLE);
        }
        
        int somme = 0;
        for (int i = 0; i < premiereMatrice.length; i++) {
            somme += premiereMatrice[i] * deuxiemeMatrice[i];
        }
        return somme;
    }
    
    /**
     * Retourne la colonne d'indice indiceColonne de matrice
     * @param matrice       la matrice à traiter
     * @param indiceColonne l'indice de la colonne recherché
     * @return un tableau de int
     * @throws IllegalArgumentException Si matrice est null
     */
    public static int[] getColonne(int[][] matrice, int indiceColonne) 
    throws IllegalArgumentException{
        if (matrice == null) {
            throw new IllegalArgumentException(ERREUR_REF_NULLE);
        }
        int[] resultat = new int[matrice.length];
        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = matrice[i][indiceColonne];
        }
        return resultat;
    }
}