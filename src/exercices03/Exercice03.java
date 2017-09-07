package exercices03;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Exercice03 {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("../exercices/src/data/data-01.txt");
		int caractere;
		
		while((caractere = reader.read()) != -1){
			System.out.print((char)caractere);
		}
		reader.close();
		
		/*
		FileWriter writer = new FileWriter("C:/Users/Max/Desktop", true);
		writer.write("Jeudi, 31 AOUT 2017");
		writer.close();
		*/
	}
	
	

}
