package exercices07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * La classe SaltedKey impl�mente un algorithme de salage "SaltedKey"
 * qui crypte un mot de passe et le met dans un fichier.
 *.
 */
public class SaltedKey {

	
	/**
	 * nbRandomEnsemble est une fonction qui prend en param�tre un min et un max.
	 * Il g�re un nombre al�atoire entre le min et le max fournit dans un ensemble.
	 *
	 * @param min the min
	 * @param max the max
	 * @return the key retourne un nombre al�atoire.
	 */
	public static int nbRandomEnsemble(int min, int max){
		int key;
		return key = (int)(Math.random() * (max-min) + min);
	}
	
	/**
	 * Encrypter est une fonction qui prend en param�tre un password.
	 * Ce password sera encrypter de diff�rente fa�on. Si la cl� est impaire, 
	 * elle sera ins�r�e de gauche � droite du mot de passe. Sinon, 
	 * elle sera ins�r�e de droite � gauche du mot de passe.
	 *
	 * @param password the password
	 * @return the string
	 */
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
	
	
	/**
	 * The main est la m�thode permet d'ex�cuter et tester les fonctions d'encryptage du password.
	 *
	 * @param args the arguments
	 */
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
