/**
 * 
 */
package iut.info1.sdd;

/**
 * @author francois.desaintpala
 * @param <E>
 *
 */
public class PileRecursive<E> implements Pile<E> {

	private E sommet;
	private PileRecursive<E> corps;

	/**
	 * 
	 */
	public PileRecursive() {
		// TODO Auto-generated constructor stub
	}
	
	public PileRecursive(E sommet, PileRecursive<E> corps){
		this.sommet = sommet;
		this.corps = corps;
	}

	@Override
	public boolean isVide() {
		// TODO Auto-generated method stub
		
		return sommet == null;
	}

	@Override
	public Pile<E> empiler(E aAjouter) {
		Pile.super.empiler(aAjouter);
		corps = new PileRecursive<>(sommet, corps);
		sommet = aAjouter;
		return this;
	}

	@Override
	public Pile<E> depiler() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E sommet() {
		// TODO Auto-generated method stub
		return null;
	}

}
