/**
 * TestPersonne.java                       29 mars 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.population.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import iut.info1.datation.Date;
import iut.info1.population.Personne;

/**
 * //TODO Commenter la responsabilités de la classe TestPersonne
 * @author francois
 *
 */
class TestPersonne {

    /**
     * Test method for {@link iut.info1.population.Personne#Personne(java.lang.String, java.lang.String, java.lang.String, iut.info1.datation.Date)}.
     */
    @Test
    @DisplayName ("TestConstructeur NotOk")
    void testPersonneNotOk() {
        assertThrows(IllegalArgumentException.class, 
        ()->new Personne("0","François","de Saint Palais",new Date(1,1,2000)));
        assertThrows(IllegalArgumentException.class, 
        ()->new Personne("100010100100101","","de Saint Palais",new Date(1,1,2000)));
        assertThrows(IllegalArgumentException.class, 
        ()->new Personne("100010100100101","François","",new Date(1,1,2000)));
        assertThrows(IllegalArgumentException.class, 
        ()->new Personne("100010100100101","François","de Saint Palais",new Date(1,1,2040)));
    }
    
    @Test
    @DisplayName ("TestConstructeur Ok")
    void testPersonneOk() {
        //TODO Ecrire les test du constructeur ok
//        assertDoesNotThrow(new Personne())
    }

    /**
     * Test method for {@link iut.info1.population.Personne#getNIR()}.
     */
    @Test
    void testGetNIR() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link iut.info1.population.Personne#getNom()}.
     */
    @Test
    void testGetNom() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link iut.info1.population.Personne#getPrenom()}.
     */
    @Test
    void testGetPrenom() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link iut.info1.population.Personne#getDateNaiss()}.
     */
    @Test
    void testGetDateNaiss() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link iut.info1.population.Personne#toString()}.
     */
    @Test
    void testToString() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link iut.info1.population.Personne#ageEn(int)}.
     */
    @Test
    void testAgeEn() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link java.lang.Object#hashCode()}.
     */
    @Test
    void testHashCode() {
        fail("Not yet implemented");
    }

    /**
     * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
     */
    @Test
    void testEquals() {
        fail("Not yet implemented");
    }

}
