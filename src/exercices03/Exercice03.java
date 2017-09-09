package exercices03;

import exercices01.Armstrong;
import exercices02.NombreNarcissique;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercice03 {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = null;
		String read;
		String[] tab = new String[100];
		int compteur = 0;
		// try{
		reader = new BufferedReader(new FileReader("../exercices/src/data/data-01.txt"));
		while ((read = reader.readLine()) != null) {
			tab = read.split(" ");
			String test = tab[0];
			compteur++;
			if(Armstrong.nombreArmstrong(test)){
				System.out.println(test + " est un nombre Armstrong");
			}
			else if(NombreNarcissique.nombreArmstrong(test)){
				System.out.println(test + " est un nombre Narcissique");
			}
			else{
				continue;
			}
			

		}
		reader.close();

	}

}

/*
 * FileWriter writer = new FileWriter("C:/Users/Max/Desktop", true);
 * writer.write("Jeudi, 31 AOUT 2017"); writer.close();
 */

// }
// catch(Exception e){
// System.out.println("Erreur");
// }