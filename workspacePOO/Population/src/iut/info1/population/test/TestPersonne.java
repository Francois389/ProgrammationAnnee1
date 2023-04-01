/**
 * TestPersonne.java                       29 mars 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.population.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import iut.info1.datation.Date;
import iut.info1.population.Personne;

/**
 * //TODO Commenter la responsabilités de la classe TestPersonne
 * @author François de Saint Palais
 *
 */
class TestPersonne {

    private List<Personne> correctes;
    
    @BeforeEach
    void regenererJeuTest () {
        correctes = new ArrayList<>(10);
        correctes.add(new Personne("100010100100101","François","de Saint Palais",new Date(1,1,2000)));
        correctes.add(new Personne("145039512732156","Jean Pierre","Martin",new Date(1,3,1945)));
        correctes.add(new Personne("145039512732156","Jean-Pierre","Martin",new Date(1,3,1945)));
    }
    
    /**
     * Test method pour {@link iut.info1.population.Personne#Personne(String, String, String, Date)}
     * Avec des valeurs incorrectes.
     */
    @Test
    @DisplayName ("TestConstructeur NotOk")
    void testPersonneNotOk() {
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("0","François","de Saint Palais",new Date(1,1,2000)));
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("000000000000000","François","de Saint Pa1ais",new Date(1,1,2000)));        
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("100010100100101","","de Saint Palais",new Date(1,1,2000)));
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("100010100100101","        ","de Saint Palais",new Date(1,1,2000)));
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("100010100100101","François","",new Date(1,1,2000)));
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("140010100100101","François","de Saint Palais",new Date(1,1,2040)));
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("210062A26661258","0phélie","Martin",new Date(1,6,2010)));
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("100010100100101","François","de Saint Pa1ais",new Date(1,1,2000)));        
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("               ","François","de Saint Pa1ais",new Date(1,1,2000)));        
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("100010100100101","François","de Saint Palais",new Date(1,1,2020)));
        assertThrows(IllegalArgumentException.class, 
                ()->new Personne("100010100100101","François","de Saint Palais",new Date(1,5,2000)));
    }
    
    @Test
    @DisplayName ("TestConstructeur Ok")
    void testPersonneOk() {
        //TODO Écrire les test du constructeur ok
        List<Personne> correctes;
        correctes = new ArrayList<>(10);
        correctes.add(new Personne("100010100100101","François","de Saint Palais",new Date(1,1,2000)));
        correctes.add(new Personne("145039512732156","Jean Pierre","Martin",new Date(1,3,1945)));
        correctes.add(new Personne("145039512732156","Jean-Pierre","Martin",new Date(1,3,1945)));
    }

    /**
     * Test method for {@link iut.info1.population.Personne#getNIR()}.
     */
    @Test
    void testGetNIR() {
        assertEquals("100010100100101", new Personne("100010100100101","François","de Saint Palais",new Date(1,1,2000)));
        assertEquals("145039512732156", new Personne("145039512732156","Jean Pierre","Martin",new Date(1,3,1945)));
        
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
