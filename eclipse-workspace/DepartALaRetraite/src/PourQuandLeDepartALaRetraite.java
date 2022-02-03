import java.util.Scanner;

public class PourQuandLeDepartALaRetraite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ageDeLIndividu ;

		Scanner sca = new Scanner(System.in) ;

		System.out.println("Entrez un nombre correspondant à votre âge?") ;

		ageDeLIndividu = sca.nextInt() ;

		String resultat = NbDAnneesAvantLaRetraite (ageDeLIndividu) ; 

		System.out.println(resultat);

	} // fin de la fonction main

	public static String NbDAnneesAvantLaRetraite (int age) {

		if (age>= 0 && age<60) { 
			int NdDAnneesAvantLaRetraite = 60-age ;
			return "Le nombre d'années à effectuer avant la retraite est "+NdDAnneesAvantLaRetraite+" an(s)" ;
		}
		else if (age == 60) {
			return "Vous êtes à la retraite cette année" ;
		}
		else if (age> 60) {
			int NdDAnneesDejaAlaRetraite = age-60 ; 
			return "Vous êtes à la retraite depuis "+NdDAnneesDejaAlaRetraite+ " an(s)" ;
		}
		else {
			return "Vous n'êtes pas encore né(e)" ;
		}

	} // fin de la fonction NbDAnneesAvantLaRetraite	

} // fin de la classe

