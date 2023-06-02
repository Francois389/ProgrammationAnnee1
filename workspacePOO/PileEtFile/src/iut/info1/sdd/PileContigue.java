/*
 * PileContigue.java                                    12 mai 2023
 * IUT de Rodez, info1 2022-2023, aucun copyright ni copyleft
 */
package iut.info1.sdd;

import java.util.Arrays;

/** 
 * Collection d'objets à loi de gestion LIFO = Last In First Out
 * <p>
 * Classe non immuable (collection)
 * @author info1 2022-2023
 * @param <E> type (polymorphe) des éléments empilés
 */
public class PileContigue<E> {
    
    /** Nombre max d'objets empilables initialement */
    private static final int CAPACITE_INITIALE = 10;
    
    /** représentation contigue = bloc des références des objets empilés */
    private E[] elements;
    
    /** nombre effectif d'objets empilés = indice du sommet +1 */
    private int taille;

    /** 
     * Initialisation d'une pile vide
     */
    public PileContigue() {
        elements = (E[]) new Object[CAPACITE_INITIALE];
        // taille = 0;  // pile vide
    }
    
    /**
     * Prédicat vérifiant que cette pile ne référence aucun élément
     * @return true si aucun élément empilé, false sinon
     */
    public boolean isVide() {
        return taille == 0; 
    }
    
    /**
     * Ajoute un élément aAjouter au sommet de cette pile
     * <p>
     * Commande (style fonctionnel) modifiant l'état de this
     * @param aAjouter référence de l'élément à empiler (non nulle)
     * @return référence de cette pile après empilement (style fonctionnel)
     * @throws NullPointerException si aAjouter est null
     */
    public PileContigue<E> empiler(E aAjouter) {
        if (aAjouter == null) {
            throw new NullPointerException("Impossible d'empiler la réf. null");
        }
        assurerCapacite();
        elements[taille] = aAjouter;
        taille++;
        return this;
    }
    
    /** 
     * Re-allouer un nouveau tableau en cas de saturation du tableau elements
     * avec recopie des anciens éléments
     */
    private void assurerCapacite() {
        final double GROSSISSEMENT = 1.30;  // 30% de capacité 
        if (taille == elements.length) {
            elements = Arrays.copyOf(elements, 
                                     (int)Math.ceil(taille * GROSSISSEMENT));
        } // else TODO réallouer un tableau plus petit
          //           si le taux de remplissage est trop faible
    }

    /**
     * Retire de cette pile la référence du dernier élément empilé
     * (dernier arrivé premier sorti DAPS)
     * <p>
     * Commande (fonctionnelle) modifiant l'état de cette pile
     * @return cette pile après "dépilement" (style fonctionnel)
     * @throws PileVideException si cette pile est vide
     */
    public PileContigue<E> depiler() {
        preConditionPileNonVide();
        taille--;
        return this;
    }

    /**
     * Accès au dernier empilé sur cette pile
     * @return référence du dernier élément empilé
     * @throws PileVideException si cette pile est vide
     */
    public E sommet() {
        preConditionPileNonVide();
        return elements[taille -1];
    }

    /**
     * Vérifie une pré-condition non vide avant opération
     * @throws PileVideException si pile vide
     */
    private void preConditionPileNonVide() throws PileVideException {
        /* pré-condition : pile non vide */
        if (isVide()) {
            throw new PileVideException("pre-condition pile non vide échoue");
        }
    }
}
