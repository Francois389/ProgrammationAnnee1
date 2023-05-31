/**
 * TestPile.java                       12 mai 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package test.iut.info1.structure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import iut.info1.structure.Pile;

/**
 * //TODO Commenter la responsabilités de la classe TestPile
 * @author François de Saint Palais
 *
 */
class TestPile {

	@BeforeEach
	void pReset() {
		Pile p = new Pile();
	}
	
	@Test
	void testPile() {
		Pile p = new Pile();
		assertTrue(p.estVide());
	}

	@Test
	void testEstVide() {
		Pile p = new Pile();
		assertTrue(p.estVide());
		
		p.empiler("un element a empiler");
		assertFalse(p.estVide());
	}
	
	@Test
	void testGetSommet() {
		
	}
	
	@Test
	void testEmpiler() {
		Pile pile = new Pile();
		assertEquals(Pile.class, pile.empiler("element a empiler").getClass());
		assertFalse(pile.estVide());
	}

}
