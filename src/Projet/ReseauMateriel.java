package Projet;


/**
 * The Class ReseauMateriel représente un objet de réseau.
 * 
 * @author Maxime Pigeon
 */
public class ReseauMateriel extends Bien{
	
	private String marque;
	private String typeCable;
	private boolean isTCP;
	
	/**
	 * Instancie un nouveau ReseauMateriel.
	 *
	 * @param marque the marque
	 * @param typeCable the type cable
	 * @param isTCP the is TCP
	 * @param cout the cout
	 * @param valeur the valeur
	 */
	public ReseauMateriel(String marque, String typeCable, boolean isTCP, double cout, double valeur) {
		super.id = Bien.compteur;
		Bien.compteur++;
		super.cout = cout;
		super.valeur = valeur;
		this.marque = marque;
		this.typeCable = typeCable;
		this.isTCP = isTCP;
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
	 * @param marque la nouvelle marque
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * Gets le type de cable.
	 *
	 * @return le type de cable
	 */
	public String getTypeCable() {
		return this.typeCable;
	}

	/**
	 * Sets le type cable.
	 *
	 * @param typeCable le nouveau type cable
	 */
	public void setTypeCable(String typeCable) {
		this.typeCable = typeCable;
	}

	/**
	 * Regarde si il est TCP.
	 *
	 * @return true, si est tcp
	 */
	public boolean isTCP() {
		return this.isTCP;
	}

	/**
	 * Sets le tcp.
	 *
	 * @param isTCP le nouveau tcp
	 */
	public void setTCP(boolean isTCP) {
		this.isTCP = isTCP;
	}

	/* 
	 * toString est une fonction qui retourne l'objet en string.
	 */
	@Override
	public String toString() {
		return "ReseauMateriel [ID= " + super.id + "marque=" + marque + ", typeCable=" + typeCable + ", isTCP=" + isTCP + "]";
	}

	
}
