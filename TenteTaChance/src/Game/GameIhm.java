package Game;

public class GameIhm {
	
	public static java.util.Scanner scanner = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		GameDisplay.displayTitle();
		
		//System.out.println("Vous avez mis " + nombreMystere() + " essais pour decouvrir le nombre");


	}

	/**
	 * Demande a l'utilisateur de trouver un nombre entre 0 et 20
	 * 
	 * @return Le nombre d'essais qu'il a fallu pour trouver le nombre
	 */
	public static int nombreMystere() {

		int counter = 0; // le nombre d'essais de l'utilisateur
		int nombreMyst = unEntierAuHasardEntre(0, 20); // le nombre mystère!
		int input = 2; // cette variable stoquera les essais de l'utilisateur
		
//		System.out.println("\nC'est un nombre entre 0 et 20!");
		
		while (input != nombreMyst) {
			
			System.out.print("Essayez de deviner : ");
			
			input = scanner.nextInt();
			
			System.out.println();

			if (input > nombreMyst) {
				
				System.out.println("Mon nombre est plus petit.\n");

			} else if (input < nombreMyst) {
				
				System.out.println("Mon nombre est plus grand.\n");

			} else {
				
				System.out.println("\n*****************************************************\n\n");
				System.out.println("Vous avez deviné.\n");
				
				
				
			}

			counter++;
		}
		
		return counter;
		
		
	}

	
	public static int unEntierAuHasardEntre(int valeurMinimale, int valeurMaximale) {
		
		double nombreReel;
		int resultat;

		nombreReel = Math.random();
		
		resultat = (int) (nombreReel * (valeurMaximale - valeurMinimale + 1)) + valeurMinimale;
		
		return resultat;
	}
	
	

}
