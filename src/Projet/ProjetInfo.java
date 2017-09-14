package Projet;

import java.util.Scanner;

/**
 * La Classe ProjetInfo est une classe pour tester les objets Entreprise, Ordinateur, 
 * ReseauMateriel et Serveur.
 */
public class ProjetInfo {

	/**
	 * The main est la fonction qui représente le programme principale pour
	 * tester les objets appartenant à une enteprise.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		Entreprise DELL = new Entreprise("Dell", "Une compagnie qui c'est ou sont leur priorités : L'ARGENT");
		Scanner scan = new Scanner(System.in);
		String choix;

		Bien ordinateur1 = new Ordinateur("Alienware", "Linux", 1000.99, 2999.99);
		Bien ordinateur2 = new Ordinateur("Alienware", "Linux", 1000.99, 2999.99);
		Bien ordinateur3 = new Ordinateur("Alienware", "Linux", 1000.99, 2999.99);

		Bien serveur1 = new Serveur("Php", true, 5999.99, 15999.99);
		Bien serveur2 = new Serveur("Php", true, 52999.99, 259999.99);
		Bien serveur3 = new Serveur("Php", true, 60000.99, 600000);

		Bien reseau1 = new ReseauMateriel("Cisco", "RJ45", true, 50493.99, 1000000.99);
		Bien reseau2 = new ReseauMateriel("Alienware", "WIFI", false, 1000.99, 2999.99);
		Bien reseau3 = new ReseauMateriel("Alienware", "Fibre obtique", false, 1, 299900.99);

		DELL.ajouterBien(ordinateur1);
		DELL.ajouterBien(ordinateur2);
		DELL.ajouterBien(ordinateur3);
		DELL.ajouterBien(serveur1);
		DELL.ajouterBien(serveur2);
		DELL.ajouterBien(serveur3);
		DELL.ajouterBien(reseau1);
		DELL.ajouterBien(reseau2);
		DELL.ajouterBien(reseau3);

		do {
			DELL.afficheMenu();
			choix = scan.nextLine();
			switch (choix) {
			case "1":
				DELL.afficheSousMenuBienInformatique();
				choix = scan.nextLine();
				if(choix.equals("1")){
					System.out.println("Veuillez rentrer le numéro d'ID que vous rechercher.");
					choix = scan.nextLine();
					DELL.affiche(Integer.parseInt(choix = scan.nextLine()));
				}else{
				DELL.afficheInventaire();	
				}
				break;
			case "2":
				System.out.println("Il y a "+ DELL.calculerOrdinateur() + " ordinateurs dans la compagnie.");
				break;
			case "3":
				System.out.println("Le coût total de l'équipement est de " + DELL.coutTotal() + "$.");
				break;
			case "4":
				System.out.println("Aurevoir et bonne journée !");
				break;

			default:
				System.out.println("Entrez un choix valide.");
				scan.close();
				break;
			}
		} while (!choix.equals("4"));
	}

}
