package Projet;


/**
 * The Class Serveur est une classe qui descend de bien(Classe abstraite) et représente
 * un serveur dans une compagnie.
 */
public class Serveur extends Bien {
	
	private String description;
	private boolean isCloud;

	/**
	 * Crée un nouveau objet Serveur qui prend en paramètre sa configuration.
	 *
	 * @param id the id
	 * @param description the description
	 * @param isCloud the is cloud
	 * @param cout the cout
	 * @param valeur the valeur
	 */
	public Serveur(String description, boolean isCloud, double cout, double valeur) {
		super.id = Bien.compteur;
		Bien.compteur++;
		super.cout = cout;
		super.valeur = valeur;
		this.description = description;
		this.isCloud = isCloud;
	}

	/**
	 * Gets la description.
	 *
	 * @return la description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets la description.
	 *
	 * @param description La nouvelle description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Vérifie si il cloud ou pas.
	 *
	 * @return true, si il est cloud.
	 */
	public boolean isCloud() {
		return this.isCloud;
	}

	/**
	 * Sets le cloud.
	 *
	 * @param isCloud est le nouveau Cloud.
	 */
	public void setCloud(boolean isCloud) {
		this.isCloud = isCloud;
	}

	/*
	 * Retourne l'objet en String.
	 */
	public String toString() {
		return "Serveur [ID=" + super.id + " description=" + this.description + ", isCloud=" + this.isCloud + "]";
	}

}
