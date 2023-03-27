/**
 * 
 */
package test.outilcalcul;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import principal.outilcalcul.*;

/**
 * @author francois.desaintpala
 *
 */
class CalculTest {

	/** Valeurs à tester pour l'opérande de gauche */
    private static final int[] VAL_GAUCHE = {-1000, -199, -2, -1, 0, 1, 2, 123, 3000};
    
    /** Valeurs à tester pour l'opérande de droite */
    private static final int[] VAL_DROITE = {-1000, -98, -2, -1, 0, 1, 2, 325, 3000};
    
    /** Valeurs à tester pour l'opérande de droite de la division */
    private static final int[] VAL_DROITE_DIV = {-1000, -98, -2, -1, 10, 1, 2, 25, 3000};
    
    /** Résultats obtenus pour l'addition */
    private static int[] resultatAddition;
    
    /** Résultats obtenus pour la multiplication */
    private static int[] resultatMutiplication;
    
    /** Résultats obtenus pour la division */
    private static int[] resultatDivision;
    
    
    @BeforeAll
    static void setUpClass() {
        System.out.println("Lancement des tests de la classe Calcul");

        // on renseigne les résultats attendus
        resultatAddition = new int[VAL_GAUCHE.length];
        resultatMutiplication = new int[VAL_GAUCHE.length];
        for (int i = 0; i < VAL_GAUCHE.length; i++) {
            resultatAddition[i] = VAL_GAUCHE[i] + VAL_DROITE[i];
            resultatMutiplication[i] = VAL_GAUCHE[i] * VAL_DROITE[i];
        }
    
        // on renseigne les résultats attendus pour la division
        resultatDivision = new int[VAL_GAUCHE.length];
        for (int i = 0; i < VAL_GAUCHE.length; i++) {
            resultatDivision[i] = VAL_GAUCHE[i] / VAL_DROITE_DIV[i];
        }
    }
    
    @AfterAll
    static void tearDownClass() {
        System.out.print("\n------------ FIN TEST Calcul ------------\n");
    }
    
    @Test
    @DisplayName("ajouter")
    void testAjouter() {
        // on renseigne resCalcule avec le résulat renvoyé par ajouter
        int[] resCalcule = new int[VAL_GAUCHE.length];
        for (int i = 0; i < resCalcule.length; i++) {
            resCalcule[i] = new Calcul(VAL_GAUCHE[i], VAL_DROITE[i]).ajouter();
        }
    
        // on vérifie que les tableaux resultatAddition et resCalcule sont identiques
        assertArrayEquals(resultatAddition, resCalcule);
    }

    @Test
    @DisplayName("multiplier")
    void testMultiplier() {
        // on renseigne resCalcule avec le résultat renvoyé par multiplier
        int[] resCalcule = new int[VAL_GAUCHE.length];
        for (int i = 0; i < resCalcule.length; i++) {
            resCalcule[i] = new Calcul(VAL_GAUCHE[i], VAL_DROITE[i]).multiplier();
        }
        
        // on vérifie que les tableaux resultatMultiplication et resCalcule sont identiques
        assertArrayEquals(resultatMutiplication, resCalcule);
    }
    
    
    @Test
    @DisplayName("diviser sans l'exception")
    void testDiviserSansException() {
        // on renseigne resCalcule avec le résultat renvoyé par diviser
        int[] resCalcule = new int[VAL_GAUCHE.length];
        for (int i = 0; i < resCalcule.length; i++) {
            resCalcule[i] = new Calcul(VAL_GAUCHE[i], VAL_DROITE_DIV[i]).diviser();
        }
        
        // on vérifie que les tableaux resultatDivision et resCalcule sont identiques
        assertArrayEquals(resultatDivision, resCalcule);
    }

    @Test
    @DisplayName("diviser par 0 et avec exception")
    void testDiviserAvecException() {
        System.out.println("diviser (avec exception)");
        
        for (int i = 0; i < VAL_GAUCHE.length; i++) {
            /*
             * on vérifie que l'appel à diviser sur l'objet c provoque la levée
             * de l'exception IllegalArgumentException (puisque division par 0)
             */
            final Calcul c = new Calcul(VAL_GAUCHE[i], 0);
            Throwable erreur = assertThrows(IllegalStateException.class, 
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        c.diviser();
                    }
            });
            
            // on vérifie que le message de l'objet erreur est bien celui attendu
            assertEquals("Impossible de diviser par 0", erreur.getMessage());
        }
    
    }
    
    @Test
    @DisplayName("toString")
    void testToString() {
    	//TODO Ecrire le test de toString
    	String[] a;
    	for (int i = 0; i < VAL_DROITE.length; i++) {
			
		}
    }

}
