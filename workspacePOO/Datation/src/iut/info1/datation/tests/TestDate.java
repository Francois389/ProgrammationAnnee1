/**
 * 
 */
package iut.info1.datation.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import iut.info1.datation.Date;

/**
 * @author francois.desaintpala
 *
 */
class TestDate {

	@Test
	@DisplayName ("testDateNotOk")
	void testDateNotOk() {
		assertThrows(IllegalArgumentException.class, ()->new Date(31,12,-1));
		assertThrows(IllegalArgumentException.class, ()->new Date(31,12,1849));
		assertThrows(IllegalArgumentException.class, ()->new Date(1,1,2101));
		assertThrows(IllegalArgumentException.class, ()->new Date(3,0,1910));
		assertThrows(IllegalArgumentException.class, ()->new Date(17,13,2020));
		assertThrows(IllegalArgumentException.class, ()->new Date(0,1,2000));
		assertThrows(IllegalArgumentException.class, ()->new Date(-1,12,2023));
		assertThrows(IllegalArgumentException.class, ()->new Date(31,2,2023));
		assertThrows(IllegalArgumentException.class, ()->new Date(31,4,2005));
		assertThrows(IllegalArgumentException.class, ()->new Date(31,6,1997));
		assertThrows(IllegalArgumentException.class, ()->new Date(31,9,1870));
		assertThrows(IllegalArgumentException.class, ()->new Date(31,11,2020));
		assertThrows(IllegalArgumentException.class, ()->new Date(30,2,1920));
		assertThrows(IllegalArgumentException.class, ()->new Date(29,2,2001));
		assertThrows(IllegalArgumentException.class, ()->new Date(0  ,1 ,2023));
		assertThrows(IllegalArgumentException.class, ()->new Date(32 ,1 ,2023));
		assertThrows(IllegalArgumentException.class, ()->new Date(31 ,4 ,2023));
		assertThrows(IllegalArgumentException.class, ()->new Date(20 ,0 ,2023));
		assertThrows(IllegalArgumentException.class, ()->new Date(20 ,13,2023));
		assertThrows(IllegalArgumentException.class, ()->new Date(31 ,12,1849));
		assertThrows(IllegalArgumentException.class, ()->new Date(1  ,1 ,2101));
		assertThrows(IllegalArgumentException.class, ()->new Date(29 ,2 ,2023));
	}
	
	@Test
	void testDateOk() {
		assertDoesNotThrow(()->new Date(1 ,1 ,1850));
		assertDoesNotThrow(()->new Date(31,12,2100));
		assertDoesNotThrow(()->new Date(28,2 ,2023));
		assertDoesNotThrow(()->new Date(29,2 ,2020));
		assertDoesNotThrow(()->new Date(31,3 ,2020));
	}

}
