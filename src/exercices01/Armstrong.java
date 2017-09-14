package exercices01;

import java.util.Scanner;

/**
 * The Class Armstrong.
 * 
 * @author Maxime Pigeon
 */
public class Armstrong {

	/**
	 * Cette fonction sert pour vérifier si le nom entrer est un nombre
	 * Armstrong.
	 *
	 * @param input représente ce que l'utilisateur à passer en param.
	 * @return true, si cela a fonctionné
	 */
	public static boolean nombreArmstrong(String input){
		try{
		boolean isArmstrong = false;
		int[] chiffre = new int[input.length()];
		int total = 0;
		
		for (int i = 0; i < input.length(); i++) {
			chiffre[i] = Character.getNumericValue(input.charAt(i));	
		}
		for (int j = 0; j < input.length(); j++) {
			total += chiffre[j] * chiffre[j] * chiffre[j];
		}
		
		if(total == Integer.parseInt(input)){
			isArmstrong = true;
		}
		return isArmstrong;
		}
		catch(Exception e){
				System.out.println("Vous devez rentrer des entiers.");
				return false;
		}
	}

	/**
	 * The main method pour tester si un nombre est un nombre narcissique.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrez un nombre pour vérifier qu'il est narcissique.");
		String input = scan.nextLine();
		scan.close();
		if(nombreArmstrong(input)){
			System.out.println(input + " est un nombre narcissique de type 4 ");
		}
		else{
			System.out.println("L'entré que vous avez fait n'est pas un nombre narcissique.");
		}
	}

}
