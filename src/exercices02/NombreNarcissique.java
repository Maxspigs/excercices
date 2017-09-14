package exercices02;

import java.util.Scanner;

/**
 * La classe NombreNarcissique vérifie qu'un nombre est un nombre narcissique. 
 * Un nombre de narcissque est un nombre qu'une fois
 * décomposé et qu'on multiplie par 4 ce nombre tout en additionnant les autres
 * chiffre décomposé on revient au même chiffre.
 * Ex : 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
 * 
 * @author Maxime Pigeon
 */
public class NombreNarcissique {

	/**
	 * Nombre narcissique est une fonction qui sert à vérifier si
	 * le chiffre rentré en paramètre est un nombre narcissque.
	 *
	 * @param input the input
	 * @return true, if successful
	 */
	public static boolean nombreNarcissique(String input){
		boolean isNarcissique = false;
		try{
			int[] chiffre = new int[input.length()];
			int total = 0;
			
			for (int i = 0; i < input.length(); i++) {
				chiffre[i] = Character.getNumericValue(input.charAt(i));	
			}
			for (int j = 0; j < input.length(); j++) {
				total += chiffre[j] * chiffre[j] * chiffre[j] * chiffre[j];
			}
			if(total == Integer.parseInt(input)){
				isNarcissique = true;
			}
			return isNarcissique;
		}
		catch(Exception e){
			System.out.println("Vous devez rentrer des entiers.");
			return false;
		}
		
	}

	/**
	 * La méthode principale pour tester un nombre narcissique.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez un nombre pour vérifier qu'il est narcissique.");
		String input = scan.nextLine();
		if(nombreNarcissique(input)){
			System.out.println( input + " est un nombre narcissique de type 4 ");
		}
		else{
			System.out.println("L'entré que vous avez fait n'est pas un nombre narcissique.");
		}
		scan.close();
	}
	

}
