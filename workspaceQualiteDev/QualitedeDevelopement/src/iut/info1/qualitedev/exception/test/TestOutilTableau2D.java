/*
 * Utilisation de la classe OutilTableau2D                           11/21
 * UtilisationTableau2D.java
 */
package iut.info1.qualitedev.exception.test;

import java.util.Scanner;
import iut.info1.qualitedev.exception.OutilSaisie;
import iut.info1.qualitedev.exception.OutilTableau2D;

/**
 * Cette classe permet de tester le bon fonctionnement de la gestion des exceptions
 * définies dans la classe OutilTableau2D   
 * @author INFO2
 * @version 1.0
 */
public class TestOutilTableau2D {
    
    /** pour les saisies au clavier */
    private static Scanner entree = new Scanner(System.in);
    
    
    /** Lorsqu'un test est répété, il sera répété 3 fois */
    private static final int NB_TEST = 3;

    /** Matrice carrrée qui sert de jeu de test */
    private static final int[][] MATRICE_CARREE = { {4, 9, 17, 26, 13},
                                                    {-3, 2, 8, -6, 30},
                                                    {12, 9, 1, 3, 11},
                                                    {7, -2, 0, 6, 15},
                                                    {11, 10, -5, 3, -1}};
    
    /** Matrice rectangulaire qui sert de jeu de test */
    private static final int[][] MATRICE_RECTANGLE = { {4, 9, 17, 26, 13, 5, -9},
                                                     {-3, 2, 8, -6, 30, -1, 18},
                                                     {12, 9, 1, 3, 11, -5, -2},
                                                     {7, -2, 0, 6, 15, 8, -3},
                                                     {11, 10, -5, 3, -1, 0, 10}};
    
    /** Matrice irrégulière qui sert de jeu de test */
    private static final int[][] MATRICE_IRREGUL = { {4, 9, 17, 26, 13},
                                                     {-3, 2, 8, -6, 30, -1, 18},
                                                     {12, 9, 1},
                                                     {7, -2, 0, 6, 15, 8},
                                                     {11, 10, -5, 3, -1}};
    
    /** Matrice nulle (référence nulle) */
    private static final int[][] MATRICE_NULLE = null;
    
    
    
    /* ------------------------  Test de sommeLigne  ------------------------ */
    
    /**
     * Affiche sur la console la somme de la ligne numéro numLigne de la 
     * matrice argument. Si le numéro de ligne est incorrect, un message
     * d'erreur est affiché.
     * @param matrice       matrice à partir de laquelle le calcul est fait
     * @param numLigne      numéro de la ligne dont la somme est affichée
     */
    public static void afficherSommeLigne(int[][] matrice, int numLigne) {
        try {
            System.out.print("Somme de la ligne " + numLigne 
                             + " = " + OutilTableau2D.sommeLigne(matrice, numLigne));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Calcul  impossible.");
            System.out.println(e.getMessage());
        }
        // TODO : compléter
    }
    
    
    /**
     * Méthode de test de la méthode sommeLigne
     * Le test est interactif : l'utilisateur entre un numéro de ligne
     * La somme des valeurs de cette ligne est affichée, pour chacune
     * des 4 matrices jeux de tests
     */
    public static void testSommeLigne() {
       
        int ligneATester;
        System.out.println("TEST DE LA METHODE sommeLigne :\n"
                           + "---------------------------------");
        for (int numTest = 1; numTest <= NB_TEST; numTest++) {
            System.out.println("\n******** TEST " + numTest + "/" + NB_TEST + " ********");           
            ligneATester = OutilSaisie.saisirEntier("Entrez un numéro de ligne : ");
            
            // on affiche la somme de ligneATester pour chacune des 3 matrices de test
            System.out.println("\n  1)  Résultat pour la matrice carrée : ");
            // TODO : appeler afficherSommeLigne
            afficherSommeLigne(MATRICE_CARREE, ligneATester);
            
            System.out.println("\n  2)  Résultat pour la matrice rectangulaire : ");
            // TODO : appeler afficherSommeLigne
            afficherSommeLigne(MATRICE_RECTANGLE, ligneATester);
            
            System.out.println("\n  3)  Résultat pour la matrice irrégulière : ");
            // TODO : appeler afficherSommeLigne
            afficherSommeLigne(MATRICE_IRREGUL, ligneATester);
            
            System.out.println("\n  4)  Résultat pour la matrice nulle : ");
            // TODO : appeler afficherSommeLigne
            afficherSommeLigne(MATRICE_NULLE, ligneATester);
        }
        
    }
        
    
    
    /* ------------------------  Test de Afficher  ------------------------ */
    
    
    /**
     * Méthode de test de la méthode afficher
     * Elle affiche les  4 matrices jeux de tests
     */
    public static void testAfficher() {
        System.out.println("TEST DE LA METHODE afficher :\n"
                           + "----------------------------");
        // TODO : gérer l'erreur
        // on affiche les 4 matrices de test
        try {
            System.out.println("\n  1)  Résultat pour la matrice carrée : ");
            OutilTableau2D.afficher(MATRICE_CARREE);
            System.out.println("\n  2)  Résultat pour la matrice rectangulaire : ");
            OutilTableau2D.afficher(MATRICE_RECTANGLE);
            System.out.println("\n  3)  Résultat pour la matrice irregulière : ");
            OutilTableau2D.afficher(MATRICE_IRREGUL);
            System.out.println("\n  4)  Résultat pour la matrice nulle : ");
            OutilTableau2D.afficher(MATRICE_NULLE);        
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
        
    
    /* ------------------------  Test de matriceCarree  ------------------------ */
 
    
    
    /**
     * Méthode de test de la méthode matriceCarree
     * Elle affiche le résultat du test pour les  4 matrices jeux de tests
     */
    public static void testMatriceCarree() {
        System.out.println("TEST DE LA METHODE matriceCarree :\n"
                           + "-------------------------------");
        // TODO : gérer l'erreur      
        // on affiche le résultat pour les 4 matrices de test
        try {
            System.out.print("\n  1)  Résultat pour la matrice carrée : ");
            System.out.println(OutilTableau2D.matriceCarree(MATRICE_CARREE) 
                               ? "carrée" : "pas carrée");
            
            System.out.print("\n  2)  Résultat pour la matrice rectangulaire : ");
            System.out.println(OutilTableau2D.matriceCarree(MATRICE_RECTANGLE) 
                    ? "carrée" : "pas carrée");
           
            System.out.print("\n  3)  Résultat pour la matrice irregulière : ");
            System.out.println(OutilTableau2D.matriceCarree(MATRICE_IRREGUL) 
                    ? "carrée" : "pas carrée");
            
            
            System.out.println("\n  4)  Résultat pour la matrice nulle : ");
            System.out.println(OutilTableau2D.matriceCarree(MATRICE_NULLE) 
                    ? "carrée" : "pas carrée");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Imposible de tester le matrice.");
            System.out.println(e.getMessage());
        }
        
    }
    
    
    /* ------------------------  Test de sommePremiereDiag  ------------------------ */
 
    
    /**
     * Affiche sur la console la somme de la première diagonale de la  
     * matrice argument. Si ce n'est pas possible, un message
     * d'erreur est affiché.
     * @param matrice       matrice à partir de laquelle le calcul est fait
     */
    public static void afficherSommePremiereDiag(int[][] matrice) {
        System.out.print("      Somme de la diagonale = " );
        // TODO : afficher la somme de la diagonale
        System.out.println( OutilTableau2D.sommePremiereDiag(matrice));
    }
    
    /**
     * Méthode de test de la méthode sommePremiereDiag
     * Elle affiche le résultat du test pour les  4 matrices jeux de tests
     */
    public static void testsommePremiereDiag() {
        System.out.println("TEST DE LA METHODE sommePremiereDiag :\n"
                           + "--------------------------------------");
                
        try {
            System.out.println("\n  1)  Résultat pour la matrice carrée : ");
            afficherSommePremiereDiag(MATRICE_CARREE);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Calcul impossible");
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\n  2)  Résultat pour la matrice rectangulaire : ");
            afficherSommePremiereDiag(MATRICE_RECTANGLE);
        } catch (Exception e) {
            // TODO: handle exception
                        System.out.println("Calcul impossible");
            System.out.println(e.getMessage());
        }
        
        try {
            System.out.println("\n  3)  Résultat pour la matrice irregulière : ");
            afficherSommePremiereDiag(MATRICE_IRREGUL);            
        } catch (Exception e) {
            // TODO: handle exception
                        System.out.println("Calcul impossible");
            System.out.println(e.getMessage());
        }
       
        try {
            System.out.println("\n  4)  Résultat pour la matrice nulle : ");
            afficherSommePremiereDiag(MATRICE_NULLE);      
        } catch (Exception e) {
            // TODO: handle exception
                        System.out.println("Calcul impossible");
            System.out.println(e.getMessage());
        }
        
    }
    
    
    
    /* ------------------------  Test de sommeColonne  ------------------------ */
 
 
    /**
     * Affiche sur la console la somme de la colonne numéro numColonne de la 
     * matrice argument. Si le numéro de colonne est incorrect, un message
     * d'erreur est affiché.
     * @param matrice       matrice à partir de laquelle le calcul est fait
     * @param numColonne    numéro de la colonne dont la somme est affichée
     */
    public static void afficherSommeColonne(int[][] matrice, int numColonne) {
        System.out.print("Somme de la colonne " + numColonne + " = " );
        // TODO : compléter
        System.out.println(OutilTableau2D.sommeColonne(matrice, numColonne));
    }
    
 
    
    /**
     * Méthode de test de la méthode sommeColonne
     * Le test est interactif : l'utilisateur entre un numéro de colonne
     * La somme des valeurs de cette colonne est affichée, pour chacune
     * des 4 matrices jeux de tests
     */
    public static void testSommeColonne() {
       
        int colonneATester;
        System.out.println("TEST DE LA METHODE sommeColonne :\n"
                           + "---------------------------------");
        for (int numTest = 1; numTest <= NB_TEST; numTest++) {
            System.out.println("\n******** TEST " + numTest + "/" + NB_TEST + " ********");           
            colonneATester = OutilSaisie.saisirEntier("Entrez un numéro de colonne : ");
            
            // on affiche la somme de colonneATester pour chacune des 4 matrices de test
            try {
                System.out.println("\n  1)  Résultat pour la matrice carrée : ");
                afficherSommeColonne(MATRICE_CARREE, colonneATester);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Calcul impossible.");
                System.out.println(e.getMessage());
            }

            try {
                System.out.println("\n  2)  Résultat pour la matrice rectangulaire : ");
                afficherSommeColonne(MATRICE_RECTANGLE, colonneATester);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Calcul impossible.");
                System.out.println(e.getMessage());
            }

             try {
                 System.out.println("\n  3)  Résultat pour la matrice irregulière : ");
                 afficherSommeColonne(MATRICE_IRREGUL, colonneATester);
             } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Calcul impossible.");
                System.out.println(e.getMessage());
             }

             try {
                 System.out.println("\n  4)  Résultat pour la matrice nulle : ");
                 afficherSommeColonne(MATRICE_NULLE, colonneATester);
             } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Calcul impossible.");
                System.out.println(e.getMessage());
             }
        }
        
    }
    
    /**
     * Méthode de test de la méthode estPresent
     * Le test est interactif : l'utilisateur entre un nombre à chercher.
     * On affiche si true si la valeur est trouvé false sinon.
     */
    public static void testEstPresent() {
        int nbChercher;
        System.out.println("TEST DE LA METHODE estPresent :\n"
                + "---------------------------------");
        nbChercher = OutilSaisie.saisirEntier("Entrez un élément à trouver dans les matrices : ");
        
        try {
            System.out.printf("\n  1)  %d est présent dans la matrice carrée : ",nbChercher);
            System.out.println(OutilTableau2D.estPresent(MATRICE_CARREE,nbChercher));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
        }

        try {
            System.out.printf("\n  2)  %d est présent dans la matrice rectangulére : ",nbChercher);
            System.out.println(OutilTableau2D.estPresent(MATRICE_RECTANGLE,nbChercher));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
        }

         try {
             System.out.printf("\n  3)  %d est présent dans la matrice ieréguliére : ",nbChercher);
             System.out.println(OutilTableau2D.estPresent(MATRICE_IRREGUL,nbChercher));
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
         }

         try {
             System.out.printf("\n  4)  %d est présent dans la matrice nulle : ",nbChercher);
             System.out.println(OutilTableau2D.estPresent(MATRICE_NULLE,nbChercher));
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
         }
    }
    
    /**
     * Méthode de test de la méthode valeurMaximal
     */
    public static void testValeurMaximal() {
        System.out.println("TEST DE LA METHODE valeurMaximal :\n"
                + "---------------------------------");
        
        try {
            System.out.print("\n  1)  Le valeur maximal dans la matrice carrée est : ");
            System.out.println(OutilTableau2D.valeurMaximal(MATRICE_CARREE));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("\n  2)  Le valeur maximal dans la matrice rectangle est : ");
            System.out.println(OutilTableau2D.valeurMaximal(MATRICE_RECTANGLE));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
        }

         try {
             System.out.print("\n  3)  Le valeur maximal dans la matrice irréguliére est : ");
             System.out.println(OutilTableau2D.valeurMaximal(MATRICE_IRREGUL));
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
         }

         try {
             System.out.print("\n  4)  Le valeur maximal dans la matrice nulle est : ");
             System.out.println(OutilTableau2D.valeurMaximal(MATRICE_NULLE));
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
         }
    }
    
    /**
     * Méthode de test de la méthode indexSommeLigneMaximum
     */
    public static void testIndexSommeLigneMaximum() {
        System.out.println("TEST DE LA METHODE indexSommeLigneMaximum :\n"
                + "---------------------------------");
        
        try {
            System.out.print("\n  1)  L'indice de la ligne dont la somme est maximal dans la matrice carrée est : ");
            System.out.println(OutilTableau2D.indexSommeLigneMaximum(MATRICE_CARREE));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("\n  2)  L'indice de la ligne dont la somme est maximal dans la matrice rectangle est : ");
            System.out.println(OutilTableau2D.indexSommeLigneMaximum(MATRICE_RECTANGLE));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
        }

         try {
             System.out.print("\n  3)  L'indice de la ligne dont la somme est maximal dans la matrice irréguliére est : ");
             System.out.println(OutilTableau2D.indexSommeLigneMaximum(MATRICE_IRREGUL));
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
         }

         try {
             System.out.print("\n  4)  L'indice de la ligne dont la somme est maximal dans la matrice nulle est : ");
             System.out.println(OutilTableau2D.indexSommeLigneMaximum(MATRICE_NULLE));
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
         }
    }
    
    
    /** 
     * 
     */
    public static void testSommeAntidiagonale() {
        System.out.println("TEST DE LA METHODE sommeAntidiagonale :\n"
                + "---------------------------------");
        
        try {
            System.out.print("\n  1)  La somme de l'anti-diagonale la matrice carrée est : ");
            System.out.println(OutilTableau2D.sommeAntidiagonale(MATRICE_CARREE));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("\n  2)  La somme de l'anti-diagonale de la matrice rectangle est : ");
            System.out.println(OutilTableau2D.sommeAntidiagonale(MATRICE_RECTANGLE));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
        }

         try {
             System.out.print("\n  3)  La somme de l'anti-diagonale de la matrice irréguliére est : ");
             System.out.println(OutilTableau2D.sommeAntidiagonale(MATRICE_IRREGUL));
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
         }

         try {
             System.out.print("\n  4) La somme de l'anti-diagonale de la matrice nulle est : ");
             System.out.println(OutilTableau2D.sommeAntidiagonale(MATRICE_NULLE));
         } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Recherche impossible.");
            System.out.println(e.getMessage());
         }
    }
    
    /**
     * Programme principal qui lance les méthodes de test
     * @param args  argument non utilisé
     */
    public static void main(String[] args) {
        
        // testSommeLigne();
        // testAfficher();
        // testMatriceCarree();
        // testsommePremiereDiag();
        //testSommeColonne();
        //testEstPresent();
//        testValeurMaximal();
//        testIndexSommeLigneMaximum();
//        testSommeAntidiagonale();
        
        
    }

}