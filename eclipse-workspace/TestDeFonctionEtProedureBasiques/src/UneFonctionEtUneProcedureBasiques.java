import java.util.Scanner;

public class UneFonctionEtUneProcedureBasiques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase ;

		double nb1 ;
		double nb2 ;
		double leResultat ;

		System.out.println ("Entrez une phrase ou un texte.") ;
		Scanner sca = new Scanner(System.in) ;
		phrase = sca.nextLine() ;


		// Appel de la proc�dure ecritUnMessage() 
		ecritUnMessageSimple (phrase) ;

		
		System.out.println ("Entrez un nombre.") ;
		nb1 = sca.nextDouble() ;

		System.out.println ("Saisissez un deuxi�me nombre.") ;
		nb2 = sca.nextDouble() ;

		// Appel de la fonction additionner() 
		leResultat = additionner(nb1 , nb2) ;

		System.out.println ("La somme de ces deux nombres est : " + leResultat) ;


	}


	/* D�claration des m�thodes ecritUnMessage() et additionner() 
	 * dans la classe UneFonctionEtUneProcedureBasiques
	 * donc en dehors de la proc�dure main*/

	public static void ecritUnMessageSimple (String message) {
		System.out.println ("Bonjour ! "+ message +". Au revoir !") ;
	}


	public static double additionner (double nombre1 , double nombre2) {
		double resultat ;
		resultat = nombre1 + nombre2 ;
		return resultat ;
	}


}
