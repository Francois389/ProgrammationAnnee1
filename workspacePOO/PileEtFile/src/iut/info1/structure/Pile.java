/**
 * Pile.java                       12 mai 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.structure;

import java.util.List;

/**
 * //TODO Commenter la responsabilités de la classe Pile
 * @author François de Saint Palais
 * @param <E> type (polymorphe) des éléments empilés
 */
public class Pile<E> {
	
	/**
	 * La taille de la pile à l'initialisation
	 */
	private final static int TAILLE_PILE = 10;
    
	/**
	 * Pointe le sommet + 1 de la pile
	 */
	private int taille;
	
    private Object[] elementsEmpile;
    
    /**
     * Créer une instance une pile vide
     */
    public Pile() {
        elementsEmpile = (E[]) new Object[TAILLE_PILE];
        taille = 0;
    }
    
    /**
     * @param element
     * @return La pile auquel on a empiler element
     */
    public Pile<E> empiler(Object element) {
    	if (taille == elementsEmpile.length) {
    		Object[] nouveauTab = new Object[(int) ((int) elementsEmpile.length * 1.4)];
    		for (int i = 0; i < elementsEmpile.length; i++) {
				nouveauTab[i] = elementsEmpile[i];
			}
    		elementsEmpile = nouveauTab;
		}
    	elementsEmpile[taille] = element;
    	taille ++;
    	
        return this;
    }
    
    /**
     * @return
     */
    public Pile<E> depiler() {
        return this;
    }
    
    /**
     * @return
     */
    public E getSommet() {
        return null;
    }
    
    /**
     * @return
     */
    public boolean estVide() {
    	return taille == 0;
    }
}
