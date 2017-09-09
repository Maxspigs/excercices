package exercices03;

import exercices01.Armstrong;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LireFichier {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("../exercices/src/data/data-01.txt"));
		int caractere;
		while ((caractere = reader.read()) != -1) {
			System.out.print((char) caractere);
		}
		reader.close();

		/*
		 * FileWriter writer = new FileWriter("C:/Users/Max/Desktop", true);
		 * writer.write("Jeudi, 31 AOUT 2017"); writer.close();
		 */
	}

}
