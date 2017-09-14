package exercices06;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * La classe Password est une classe qui permet de générer aléatoirement 50 mots de passe.
 */
public class Password {

	/**
	 * randomPassword est une fonction qui prend en paramètre un choix.
	 * Ce choix génère un chiffre aléatoire ou un caractere 
	 * selon le choix choisit.
	 *
	 * @param choix the choix
	 * @return the string
	 */
	public static String randomPassword(int choix) {
		char[] SPECIAL_CHAR = { ';', '?', '$', '!' };
		String password = "";
		switch (choix) {
		case 1:
			password = ("" + (int) (Math.random() * 10 + 0));
			break;
		case 2:
			password = ("" + (char) (Math.random() * (91 - 65) + 65));
			break;
		case 3:
			password = ("" + (char) (Math.random() * (97 - 123) + 123));
			break;
		case 4:
			password = ("" + SPECIAL_CHAR[(int) (Math.random() * 4 + 0)]);
			break;
		default:
			break;
		}
		return password;
	}

	/**
	 * generatePassword est une fonction qui permet de générer un Password.
	 *
	 * @return the string
	 */
	public static String generatePassword() {
		String password = "";
		ArrayList<String> caractere = new ArrayList<>();
		int longeurPassword = (int) (Math.random() * (11 - 6) + 6);
		caractere.add(randomPassword(1));
		caractere.add(randomPassword(2));
		caractere.add(randomPassword(2));
		caractere.add(randomPassword(3));
		caractere.add(randomPassword(4));

		for (int i = 0; i < longeurPassword - 5; i++) {
			caractere.add(randomPassword((int) (Math.random() * 4 + 1)));
		}

		Collections.shuffle(caractere);
		for (int i = 0; i < caractere.size(); i++) {
			password += caractere.get(i);
		}
		return password;
	}

	/**
	 * The main est le programme principale qui permet de mettre les password dans un fichier.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){

		Set<String> passwordContainer = new HashSet<>();
		while (passwordContainer.size() != 50) {
			passwordContainer.add(generatePassword());
		}
		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("motDePasse.txt")));
			for (String password : passwordContainer) {
				writer.write(password);
				writer.newLine();
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Une erreur s'est produite lors de la création du fichier ou de son écriture.");
		}

	}

}
