import java.util.Scanner;

public class PremierProjet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre ;
		
		System.out.println ("Saisissez un nombre compris entre 5 et 10") ;
		Scanner sca = new Scanner (System.in);
		nombre = sca.nextInt() ; 
		if (nombre < 5 ) {
			System.out.println("trop petit") ; 
			}
			else if (nombre > 10) {
			System.out.println("Trop grand") ; 
			}
			else {
				System.out.println("Bon intervalle") ;
		}
		
		
		
		
	}

}
