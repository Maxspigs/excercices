package exercices04;

/**
 * La classe Exercices04 est un programme qui permet de générer un nombre
 * aleatoire dans un tableau qui contient 16 entiers, dont le point commun
 * est que la différence entre 02 entiers est égale à 92.
 * 
 * @author Maxime Pigeon
 */
public class Exercices04 {

	/**
	 * Aleatoire est une fonction qui permet de crée un chiffre aléatoire et d'y
	 * additioner 92 pour ensuite les mettre dans un tableau et retourné de tableau.
	 *
	 * @return the int[]
	 */
	public static int[] aleatoire(){
		int[] tab = new int[16];
		int chiffre = (int) (Math.random() * 10000 + 1);
		
		for (int i = 0; i < tab.length; i++) {
			if(i == 0){
				tab[i] = chiffre;
				continue;
			}
			tab[i] = tab[i-1] + 92;
		}
		return tab;
	}
	
	/**
	 * The main est le programme principale qui permet d'afficher les numéros dans le tableau.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int[] tab = new int[16];
		tab = aleatoire();
		for (int i = 0; i < 16; i++) {
			System.out.println("Chiffre Numero " + (i+1) + " : " + tab[i]);
		}
		
	}
}
