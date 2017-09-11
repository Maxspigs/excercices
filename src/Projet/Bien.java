/**
 * 
 */
package Projet;

/**
 * @author Max
 *
 */
public abstract class Bien {
	protected int id;
	protected double valeur;
	protected double cout;
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValeur() {
		return this.valeur;
	}
	public void setValeur(double valeur) {
		this.valeur = valeur;
	}
	public double getCout() {
		return this.cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	
	
}
