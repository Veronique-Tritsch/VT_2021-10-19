import java.util.Scanner;

public class UnExerciceEstIlBienCompris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String questionA ;
		String questionB ;
		String questionC ;

		System.out.println("Veuillez lire l'�nonc�") ;
		//Le signe \ avant les guillemets d'ouverture et de fermeture indiqueront que des guillemets doivent �tre plac�es dans le texte qui appara�tra � l'�cran

		System.out.println("L'�nonc� est-il compris ? R�pondre par \"oui\" ou par \"non\".") ; 
		Scanner sc = new Scanner(System.in) ;
		questionA = sc.next() ;

		if(!questionA.equals("oui")) {

			System.out.println("Veuillez relire votre �nonc�") ; 
			System.out.println("L'�nonc� est-il maintenant compris ?") ;
			questionB = sc.next() ;

			if (questionB.equals("non")) {
				System.out.println("Demandez de l'aide aux formateurs") ;		
			}

		}
		System.out.println("Veuillez saisir le pseudo-code") ;
		System.out.println("Le pseudo-code est_il juste ?") ;
		questionC = sc.next() ;

		if (questionC.equals("non")) {
			System.out.println("Faites les corrections n�cessaires") ;
		}
		System.out.println("Codez le programme") ;
		System.out.println("Constituez le jeu d'essai") ;
		
		System.out.println("Tester le programme") ;

	}
}
	