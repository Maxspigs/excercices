package exercices07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class SaltedKey {

	
	public static int nbRandomEnsemble(int min, int max){
		int key;
		return key = (int)(Math.random() * (max-min) + min);
	}
	
	public static String encrypter(String password){
		int saltKey = nbRandomEnsemble(99, 999999);
		String saltKeyString = "";
		if(saltKey%2 == 1){
			saltKeyString = "" + saltKey;
			saltKeyString += password;
			password = saltKeyString;
		}
		else{
			saltKeyString = "" + saltKey;
			StringBuilder nouvelleString = new StringBuilder(saltKeyString);
			nouvelleString.reverse();
			saltKeyString = "";
			saltKeyString = nouvelleString.toString();
			password += saltKeyString;
		}
		return password;
	}
	
	
	public static void main(String[] args) {
		String password;
		ArrayList<String> passwordCrypter = new ArrayList<>();
		
		String read;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("../TPREDA/excercices/src/data/motDePasse.txt"));
			while ((read = reader.readLine()) != null) {
				password = read;
				passwordCrypter.add(encrypter(password));
			}
			reader.close();
		} catch (Exception e) {
			System.out.println("Erreur lors du chargement du fichier");
		}
		// Affiche les passwords crypter.
		for(String saltPassword : passwordCrypter){
			System.out.println(saltPassword);
		}
	}

	
}
