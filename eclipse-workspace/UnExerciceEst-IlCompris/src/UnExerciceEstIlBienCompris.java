import java.util.Scanner;

public class UnExerciceEstIlBienCompris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String questionA ;
		String questionB ;
		String questionC ;

		System.out.println("Veuillez lire l'énoncé") ;
		//Le signe \ avant les guillemets d'ouverture et de fermeture indiqueront que des guillemets doivent être placées dans le texte qui apparaîtra à l'écran

		System.out.println("L'énoncé est-il compris ? Répondre par \"oui\" ou par \"non\".") ; 
		Scanner sc = new Scanner(System.in) ;
		questionA = sc.next() ;

		if(!questionA.equals("oui")) {

			System.out.println("Veuillez relire votre énoncé") ; 
			System.out.println("L'énoncé est-il maintenant compris ?") ;
			questionB = sc.next() ;

			if (questionB.equals("non")) {
				System.out.println("Demandez de l'aide aux formateurs") ;		
			}

		}
		System.out.println("Veuillez saisir le pseudo-code") ;
		System.out.println("Le pseudo-code est_il juste ?") ;
		questionC = sc.next() ;

		if (questionC.equals("non")) {
			System.out.println("Faites les corrections nécessaires") ;
		}
		System.out.println("Codez le programme") ;
		System.out.println("Constituez le jeu d'essai") ;
		
		System.out.println("Tester le programme") ;

	}
}
	