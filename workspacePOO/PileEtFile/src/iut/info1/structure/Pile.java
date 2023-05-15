/**
 * Pile.java                       12 mai 2023
 * IUT de Rodez, pas de copyleft, pas de copyright
 */
package iut.info1.structure;

import java.util.List;

/**
 * //TODO Commenter la responsabilités de la classe Pile
 * @author François de Saint Palais
 *
 */
public class Pile {
    
    private List<Object> pile;

    public Pile() {
        //TODO Écrire constructeur
    }
    
    public Object getSommet() {
        //TODO Retourner l'élement au sommet de la pile
        return null;
    }
    
    public Pile empiler(Object element) {
        //TODO ajouter element à this
        return this;
    }
    
    
    public Pile depiler() {
        //TODO supprimer l'élement au sommet de this
        return this;
    }
    
    public boolean estVide() {
        //TODO 
        return false;
    }
}
