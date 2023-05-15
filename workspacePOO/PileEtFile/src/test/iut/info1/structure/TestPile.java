/**
 * TestPile.java                       12 mai 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package test.iut.info1.structure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import iut.info1.structure.Pile;

/**
 * //TODO Commenter la responsabilités de la classe TestPile
 * @author François de Saint Palais
 *
 */
class TestPile {

    /**
     * Test method for {@link iut.info1.structure.Pile#Pile()}.
     */
    @Test
    void testPileOk() {
        // TODO
        Pile a = new Pile();
        assertEquals(Pile.class, a.getClass());
    }

    /**
     * Test method for {@link iut.info1.structure.Pile#Pile()}.
     */
    @Test
    void testPileNOk() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link iut.info1.structure.Pile#getSommet()}.
     */
    @Test
    void testGetSommet() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link iut.info1.structure.Pile#empiler(java.lang.Object)}.
     */
    @Test
    void testEmpiler() {
        // TODO
        Pile a = new Pile();
        
    }

    /**
     * Test method for {@link iut.info1.structure.Pile#depiler()}.
     */
    @Test
    void testDepiler() {
        fail("Not yet implemented"); // TODO
    }

    /**
     * Test method for {@link iut.info1.structure.Pile#estVide()}.
     */
    @Test
    void testEstVide() {
        fail("Not yet implemented"); // TODO
    }

}
