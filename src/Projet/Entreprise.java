package Projet;

import java.util.ArrayList;

/**
 * The Class Entreprise représente un objet Entreprise qui est composé de plusieurs attributs
 * comme un nom .
 */
public class Entreprise {
	
	private int id;
	private String name;
	private String description;
	private ArrayList<Bien> inventaire = new ArrayList<>();
	
	private static int compteur = 1;
	
	/**
	 * Instancie une nouvelle entreprise.
	 *
	 * @param name le name
	 * @param description la description
	 */
	public Entreprise(String name, String description){
		this.id = compteur;
		compteur++;
		this.name = name;
		this.description = description;
	}
	
	
	/**
	 * Calculer ordinateur est méthode qui permet de calculer combien d'ordinateur
	 * que l'entreprise possède.
	 *
	 * @return the int
	 */
	public int calculerOrdinateur(){
		int compteur = 0;
		for(Bien ordinateur : inventaire ){
			if(ordinateur instanceof Ordinateur){
				compteur++;
			}
		}
		return compteur;
	}
	
	/**
	 * Affiche l'item qui possède l'id passer en param.
	 *
	 * @param id the id
	 */
	public void affiche(int id){
		for(Bien item : inventaire ){
			if(item.id == id){
				item.toString();
			}
		}
	}
	
	/**
	 * Affiche tout l'inventaire.
	 */
	public void afficheInventaire(){
		for (Bien bien : inventaire) {
			System.out.println(bien.toString());
		}
	}
	
	/**
	 * Cout total est une fonction qui permet de calculer le cout total de tous
	 * l'équipement d'une entreprise.
	 *
	 * @return the double
	 */
	public double coutTotal(){
		double coutTotal = 0;
		for(Bien item : inventaire ){
			coutTotal += item.valeur;	
		}
		return coutTotal;
	}
	
	/**
	 * Affiche le menu du programme.
	 */
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
	
	/**
	 * Affiche le sous menu bien informatique.
	 */
	public void afficheSousMenuBienInformatique(){
		System.out.println("1- Afficher un bien par son ID.");
		System.out.println("2- Afficher tous les biens de l'inventaire.");
	}
	
	/**
	 * Ajouter un bien avec avec un item passer en paramètre.
	 *
	 * @param item le bien qu'on veut rajouter
	 */
	public void ajouterBien(Bien item){
		this.inventaire.add(item);
	}
	
	/**
	 * Gets le id.
	 *
	 * @return le id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets le id.
	 *
	 * @param id le nouveau id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets le name.
	 *
	 * @return le name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets le name.
	 *
	 * @param name le nouveau name
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @param description la nouvelle description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets l'inventaire.
	 *
	 * @return l'inventaire
	 */
	public ArrayList<Bien> getInventaire() {
		return this.inventaire;
	}

	/**
	 * Sets l'inventaire.
	 *
	 * @param l'inventaire du nouvelle inventaire
	 */
	public void setInventaire(ArrayList<Bien> inventaire) {
		this.inventaire = inventaire;
	}
	
	
}
