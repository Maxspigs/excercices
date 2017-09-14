/**
 * 
 */
package Projet;

// TODO: Auto-generated Javadoc
/**
 * The Class Bien.
 *
 * @author Max
 */
public abstract class Bien {
	
	protected int id;
	protected double valeur;
	protected double cout;
	protected static int compteur;
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the valeur.
	 *
	 * @return the valeur
	 */
	public double getValeur() {
		return this.valeur;
	}
	
	/**
	 * Sets the valeur.
	 *
	 * @param valeur the new valeur
	 */
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	
	/**
	 * Gets the cout.
	 *
	 * @return the cout
	 */
	public double getCout() {
		return this.cout;
	}
	
	/**
	 * Sets the cout.
	 *
	 * @param cout the new cout
	 */
	public void setCout(double cout) {
		this.cout = cout;
	}
	
	
}
