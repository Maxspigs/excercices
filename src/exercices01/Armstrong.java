package exercices01;

public class Armstrong {
	
	public static boolean nombreArmstrong(String input){
		boolean isArmstrong = false;
		int[] chiffre = new int[input.length()];
		int total = 0;
		
		for (int i = 0; i < input.length(); i++) {
			chiffre[i] = Character.getNumericValue(input.charAt(i));	
		}
		for (int j = 0; j < input.length(); j++) {
			total += chiffre[j] * chiffre[j] * chiffre[j];
		}
		
		System.out.println(total);
		if(total == Integer.parseInt(input)){
			isArmstrong = true;
		}
		return isArmstrong;
	}

	public static void main(String[] args) {
		System.out.println("Quel nombre vous-voulez entrer ? " + nombreArmstrong("371"));
		
	}

}
