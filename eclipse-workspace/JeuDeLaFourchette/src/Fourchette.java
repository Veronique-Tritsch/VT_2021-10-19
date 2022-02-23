import java.util.Scanner;
import java.util.Random;
public class Fourchette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sca = new Scanner(System.in); 
		
		Random monObj = new Random() ;
		

		int nbMachine = monObj.nextInt(101);
		
		int nbUtilisateur ;
		int min = 0;
		int max = 100 ; 
		int nbTentatives = 0 ;

		boolean trouve = false ;

		do {
			System.out.println ("Veuillez saisir un nombre compris entre "+ min +" et " + max+".") ;
			nbUtilisateur = sca.nextInt() ;
			nbTentatives = nbTentatives + 1 ;

			if(nbUtilisateur > nbMachine)
			{max = nbUtilisateur ;
			}
			else if (nbUtilisateur < nbMachine)
			{min = nbUtilisateur ;}
			else {System.out.println("Bravo ! vous avez trouvé en "+ nbTentatives +" tentatives. "
					+ "Le nombre cherché est : " + nbUtilisateur +".");
			trouve = true ;}
		}

		while (trouve == false) ;

		System.out.println ("Jeu terminé.") ;
			}

}