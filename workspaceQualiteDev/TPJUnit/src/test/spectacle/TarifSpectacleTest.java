/**
 * 
 */
package test.spectacle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import principal.spectacle.TarifSpectacle;
import principal.spectacle.TarifSpectacleBis;
import principal.spectacle.TarifSpectacleErr;

/**
 * @author francois.desaintpala
 *
 */
class TarifSpectacleTest {
	
	/** Valeur du code spectacle, 
     * pour le jeu de tests contenant des valeurs correctes 
     * */
    private static char[] SPECTACLE
    = {'T', 'T', 'T', 'T', 'O', 'O', 'O', 'O', 
       'C', 'C', 'C', 'C', 'D', 'D', 'D', 'D'};
    
    /** Valeur du code catégorie, 
     * pour le jeu de tests contenant des valeurs correctes 
     * */
    private static char[] CATEGORIE 
    = {'S','E','M','P',
       'S','E','M','P',
       'S','E','M','P',
       'S','E','M','P'};
    
    private static char[] CATEGORIE_INVALIDE
    = {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'N', 'O', 'Q', 'R'
       , 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    
    /** Valeur du booléen adhérent, 
     * pour le jeu de tests contenant des valeurs correctes 
     * */
    private static boolean[] ADHERENT 
    = {true,false,true,false,
       false,true,false,true,
       true,false,true,false,
       false,true,false,true,};
    
    /** résultats attendus 
     * pour le jeu de tests contenant des valeurs correctes 
     * */
     private static int[] RESULTAT 
     = {14,17,21,25,24,21,28,32,16,19,23,27,21,18,25,26}; 


	@Test
	void testPrixAPayer() {
		for (int i = 0; i < ADHERENT.length; i++) {
			assertEquals(TarifSpectacle.prixAPayer(SPECTACLE[i],CATEGORIE[i], ADHERENT[i])
					     ,RESULTAT[i]);			
		}
	}

	@Test
	/* Génération d'erreur de test attendue */
	void testPrixAPayerBis() {
		for (int i = 0; i < ADHERENT.length; i++) {
			assertEquals(TarifSpectacleBis.prixAPayer(SPECTACLE[i],CATEGORIE[i], ADHERENT[i])
					,RESULTAT[i]);			
		}
	}
	
	@Test
	void testPrixAPayerBisValeurIncorrecte() {
		for (int i = 0; i < ADHERENT.length; i++) {
			final int I = i;
			assertThrows(IllegalArgumentException.class,new Executable() {
				 @Override
				public void execute() throws Throwable {
					 TarifSpectacleBis.prixAPayer(SPECTACLE[I],CATEGORIE_INVALIDE[I], ADHERENT[I]);
				}
			});	
		}	 
	}
	@Test
	void testPrixAPayerErrValeurIncorrecte() {
		for (int i = 0; i < ADHERENT.length; i++) {
			final int I = i;
			assertThrows(IllegalArgumentException.class,new Executable() {
				@Override
				public void execute() throws Throwable {
					TarifSpectacleErr.prixAPayer(SPECTACLE[I],CATEGORIE_INVALIDE[I], ADHERENT[I]);
				}
			});	
		}	 
	}
}
