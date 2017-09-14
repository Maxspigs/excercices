package exercices03;

import exercices01.Armstrong;
import exercices02.NombreNarcissique;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * La classe Exercice03 est un petit programme qui permet de lire dans un fichier.
 * Puis, affiche les nombres armstrong de type 3 et de type 4 dans ce fichier.
 * 
 * @author Maxime Pigeon
 */
public class Exercice03 {

	/**
	 * Main est le programme principale qui permet de déterminé si un nombre 
	 * est un nombre armstrong de type 3 ou typ 4.
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader reader = null;
		String read;
		String[] tab = new String[100];
		int compteur = 0;
		reader = new BufferedReader(new FileReader("../exercices/src/data/data-01.txt"));
		while ((read = reader.readLine()) != null) {
			tab = read.split(" ");
			String test = tab[0];
			compteur++;
			if(Armstrong.nombreArmstrong(test)){
				System.out.println(test + " est un nombre Armstrong");
			}
			else if(NombreNarcissique.nombreNarcissique(test)){
				System.out.println(test + " est un nombre Narcissique");
			}
			else{
				continue;
			}
			

		}
		reader.close();

	}

}