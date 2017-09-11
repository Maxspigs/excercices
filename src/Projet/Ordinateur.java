package Projet;

public class Ordinateur extends Bien {
	private String marque;
	private String typeOs;
	
	public Ordinateur(int id, String marque, String typeOs, double cout, double valeur) {
		super.id = id;
		super.cout = cout;
		super.valeur = valeur;
		this.marque = marque;
		this.typeOs = typeOs;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getTypeOs() {
		return typeOs;
	}

	public void setTypeOs(String typeOs) {
		this.typeOs = typeOs;
	}

	@Override
	public String toString() {
		return "Ordinateur [ID = " + super.id + "marque=" + this.marque + ", typeOs=" + this.typeOs + "]";
	}

	
}
