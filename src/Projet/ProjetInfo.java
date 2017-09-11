package Projet;

import java.util.Scanner;

public class ProjetInfo {

	public static void main(String[] args) throws Exception {
		Entreprise DELL = new Entreprise(0, "Dell", "Une compagnie qui c'est ou sont leur priorités : L'ARGENT");
		Scanner scan = new Scanner(System.in);
		String choix;

		Bien ordinateur1 = new Ordinateur(1, "Alienware", "Linux", 1000.99, 2999.99);
		Bien ordinateur2 = new Ordinateur(2, "Alienware", "Linux", 1000.99, 2999.99);
		Bien ordinateur3 = new Ordinateur(3, "Alienware", "Linux", 1000.99, 2999.99);

		Bien serveur1 = new Serveur(4, "Php", true, 5999.99, 15999.99);
		Bien serveur2 = new Serveur(5, "Php", true, 52999.99, 259999.99);
		Bien serveur3 = new Serveur(6, "Php", true, 60000.99, 600000);

		Bien reseau1 = new ReseauMateriel(7, "Cisco", "RJ45", true, 50493.99, 1000000.99);
		Bien reseau2 = new ReseauMateriel(8, "Alienware", "WIFI", false, 1000.99, 2999.99);
		Bien reseau3 = new ReseauMateriel(9, "Alienware", "Fibre obtique", false, 1, 299900.99);

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
