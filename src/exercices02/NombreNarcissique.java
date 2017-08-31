package exercices02;

public class NombreNarcissique {

	public static boolean nombreArmstrong(String input){
		boolean isArmstrong = false;
		int[] chiffre = new int[input.length()];
		int total = 0;
		
		for (int i = 0; i < input.length(); i++) {
			chiffre[i] = Character.getNumericValue(input.charAt(i));	
		}
		for (int j = 0; j < input.length(); j++) {
			total += chiffre[j] * chiffre[j] * chiffre[j] * chiffre[j];
		}
		if(total == Integer.parseInt(input)){
			isArmstrong = true;
		}
		return isArmstrong;
	}

	public static void main(String[] args) {
		
		if(nombreArmstrong("1634")){
			System.out.println("1634 est un nombre narcissique de type 4 ");
		}
		else{
			System.out.println("N'est pas un nombre narcissique.");
		}
	}
	

}
