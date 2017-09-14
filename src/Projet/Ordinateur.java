package Projet;

/**
 * La classe Ordinateur représente un objet ordinateur qui possède une marque et
 * une OS.
 * 
 * @author Maxime Pigeon.
 */
public class Ordinateur extends Bien {
	
	private String marque;
	private String typeOs;
	
	/**
	 * Instancie une nouvelle ordinateur.
	 *
	 * @param marque the marque
	 * @param typeOs the type os
	 * @param cout the cout
	 * @param valeur the valeur
	 */
	public Ordinateur(String marque, String typeOs, double cout, double valeur) {
		super.id = Bien.compteur;
		Bien.compteur++;
		super.cout = cout;
		super.valeur = valeur;
		this.marque = marque;
		this.typeOs = typeOs;
	}

	/**
	 * Gets la marque.
	 *
	 * @return la marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * Sets la marque.
	 *
	 * @param marque la nouveau marque
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * Gets le type os.
	 *
	 * @return le type os
	 */
	public String getTypeOs() {
		return typeOs;
	}

	/**
	 * Sets le type os.
	 *
	 * @param typeOs le nouveau type os
	 */
	public void setTypeOs(String typeOs) {
		this.typeOs = typeOs;
	}

	/*
	 *  Retourne l'objet ordinateur en String.
	 */
	public String toString() {
		return "Ordinateur [ID = " + super.id + "marque=" + this.marque + ", typeOs=" + this.typeOs + "]";
	}

	
}
