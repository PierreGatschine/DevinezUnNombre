package Game;

import java.util.Scanner;

public class Toto {
	
	
	
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	GameDisplay.displayTitle();
	
	
		for (int i=0; i<10; i++) {
			
			System.out.println("Tapez: 0 pour sortir du jeu");	
			System.out.println("Tapez: 1 pour jouer");
			
			
			int n1 = reader.nextInt();
			
			System.out.println("\n*****************************************************\n\n");
			
			
			
			
			if(n1 == 1) {
				
				System.out.println("Vous avez mis " + GameIhm.nombreMystere() + " essais pour decouvrir le nombre");
				System.out.println("\n*****************************************************\n\n");
				
			}
			else {
				System.out.println("\n*****************************************************\n\n");
				System.out.println("Bye bye!");
			}
			
		}	
	
	
	}

}
