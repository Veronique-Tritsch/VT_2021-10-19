import java.util.Scanner;

public class Quatri�meProjet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String motDePasse ;
		boolean codeJuste = false ;

		int i = 0 ;


		Scanner sca = new Scanner(System.in) ;

		do {

			System.out.println ("Saisissez un mot de passe") ;
			motDePasse = sca.nextLine() ;
			if (motDePasse.equals("Bonjour"))  
			{codeJuste = true; 
			System.out.println ("Vous �tes connect�"); }
						
		i++ ;
		}
		while (i<3 && codeJuste == false) ; 
		if (codeJuste==false)  {
			System.out.println("R�pondez par un mot � la qestion suivante. Qu'est-ce que je fais ?") ;
			motDePasse = sca.nextLine() ;
			if (motDePasse.equals("formation")) { 
				System.out.println ("Vous �tes connect�"); }
			else {
				System.out.println ("Compte bloqu�"); }

		}


	}

}
