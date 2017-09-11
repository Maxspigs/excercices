package Projet;

public class Serveur extends Bien {
	private String description;
	private boolean isCloud;
	
	public Serveur(int id, String description, boolean isCloud, double cout, double valeur) {
		super.id = id;
		super.cout = cout;
		super.valeur = valeur;
		this.description = description;
		this.isCloud = isCloud;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCloud() {
		return this.isCloud;
	}

	public void setCloud(boolean isCloud) {
		this.isCloud = isCloud;
	}

	@Override
	public String toString() {
		return "Serveur [ID=" + super.id + " description=" + this.description + ", isCloud=" + this.isCloud + "]";
	}
	
	
}
