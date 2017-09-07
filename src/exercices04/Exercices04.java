package exercices04;

public class Exercices04 {

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
	
	public static void main(String[] args) {
		int[] tab = new int[16];
		tab = aleatoire();
		for (int i = 0; i < 16; i++) {
			System.out.println("Chiffre Numero " + (i+1) + " : " + tab[i]);
		}
		
	}
}
