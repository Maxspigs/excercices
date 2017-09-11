package Projet;

public class ReseauMateriel extends Bien{
	private String marque;
	private String typeCable;
	private boolean isTCP;
	
	public ReseauMateriel(int id, String marque, String typeCable, boolean isTCP, double cout, double valeur) {
		super.id = id;
		super.cout = cout;
		super.valeur = valeur;
		this.marque = marque;
		this.typeCable = typeCable;
		this.isTCP = isTCP;
	}
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getTypeCable() {
		return this.typeCable;
	}

	public void setTypeCable(String typeCable) {
		this.typeCable = typeCable;
	}

	public boolean isTCP() {
		return this.isTCP;
	}

	public void setTCP(boolean isTCP) {
		this.isTCP = isTCP;
	}

	@Override
	public String toString() {
		return "ReseauMateriel [ID= " + super.id + "marque=" + marque + ", typeCable=" + typeCable + ", isTCP=" + isTCP + "]";
	}

	
}
