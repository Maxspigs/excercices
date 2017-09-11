package Projet;

import java.util.ArrayList;

public class Entreprise {
	private int id;
	private String name;
	private String description;
	private ArrayList<Bien> inventaire = new ArrayList<>();
	
	public Entreprise(int id, String name, String description){
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public void start(){
		
	}
	
	public int calculerOrdinateur(){
		int compteur = 0;
		for(Bien ordinateur : inventaire ){
			if(ordinateur instanceof Ordinateur){
				compteur++;
			}
		}
		return compteur;
	}
	
	public void affiche(int id){
		for(Bien item : inventaire ){
			if(item.id == id){
				item.toString();
			}
		}
	}
	
	public void afficheInventaire(){
		for (Bien bien : inventaire) {
			System.out.println(bien.toString());
		}
	}
	
	public double coutTotal(){
		double coutTotal = 0;
		for(Bien item : inventaire ){
			coutTotal += item.valeur;	
		}
		return coutTotal;
	}
	
	public void afficheMenu(){
		System.out.println("************************************");
		System.out.println(this.name);
		System.out.println(this.description);
		System.out.println("************************************");
		System.out.println("Veuilez choisir parmis les choix suivant");
		System.out.println("1- Consulter les informations d'un bien informatique particulier");
		System.out.println("2- Consulter le nombre total d'ordinateurs");
		System.out.println("3- Calculer le coût d'achat total de ses biens");
		System.out.println("4- Quittez l'application");
	}
	
	public void afficheSousMenuBienInformatique(){
		System.out.println("1- Afficher un bien par son ID.");
		System.out.println("2- Afficher tous les biens de l'inventaire.");
	}
	
	public void ajouterBien(Bien item){
		this.inventaire.add(item);
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Bien> getInventaire() {
		return this.inventaire;
	}

	public void setInventaire(ArrayList<Bien> inventaire) {
		this.inventaire = inventaire;
	}
	
	
}
