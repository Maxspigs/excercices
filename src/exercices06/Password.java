package exercices06;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Password {

	public static String randomPassword(int choix){
		char[] SPECIAL_CHAR = {';', '?', '$', '!'};
		String password = "";
		switch(choix){
		case 1 : 
			password = ("" + (int)(Math.random() * 10 + 0));
			break;
		case 2 :
			password = ("" + (char)(Math.random() * (91 - 65) + 65));
			break;
		case 3 : 
			password = ("" + (char)(Math.random() * (97 - 123) + 123));
			break;
		case 4 :
			password = ("" + SPECIAL_CHAR[(int)(Math.random() * 4 + 0)]);
			break;
		default :
			break;		
	}
		return password;
	}
	
	public static String generatePassword(){
		String password = "";
		ArrayList<String> caractere = new ArrayList<>();
		int longeurPassword = (int)(Math.random() * (11 - 6) + 6);
		caractere.add(randomPassword(1));
		caractere.add(randomPassword(2));
		caractere.add(randomPassword(2));
		caractere.add(randomPassword(3));
		caractere.add(randomPassword(4));
		
		for (int i = 0; i < longeurPassword-5; i++) {
			caractere.add(randomPassword((int)(Math.random() * 4 + 1)));
		}

		Collections.shuffle(caractere);
		for (int i = 0; i < caractere.size(); i++) {
			password += caractere.get(i);
		}
		return password;
	}

	
	public static void main(String[] args) {
		Set<String> passwordContainer = new TreeSet<>();
		while(passwordContainer.size() != 50){
			passwordContainer.add(generatePassword());
		}
			
	
	}

}
