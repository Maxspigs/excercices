package exercices01;

public class Armstrong {

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

	public static void main(String[] args) {
		if(nombreArmstrong("1234")){
			System.out.println("1634 est un nombre narcissique de type 4 ");
		}
		else{
			System.out.println("L'entré que vous avez fait n'est pas un nombre narcissique.");
		}
	}

}
