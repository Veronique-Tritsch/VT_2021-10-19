
import java.util.Scanner;

public class PromenadeAVeloOuLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String questionA ;
		String questionB ;
		String questionC ;
		String questionD ;
		String questionE ;
		String livreChoisi ="" ;

		System.out.println("Fait-il beau ?") ;
		Scanner sc = new Scanner(System.in) ;
		questionA = sc.next() ;
		if (questionA.equals("oui")) {
			System.out.println("Le vélo fonctionne-t-il correctement ?") ;
			questionB = sc.next() ;

			if (questionB.equals("oui")) {
				System.out.println("Allez faire du vélo") ; 
			}
			else {
				System.out.println("Allez chez le garagiste") ;
				System.out.println("Le vélo est-il réparable immédiatement ?") ; 
				questionE = sc.next() ;
				if (questionE.equals("non")) {
					System.out.println("Laissez le vélo en réparation et allez cueillir des joncs autour de l'étang") ;
				}
				else {
					System.out.println("Allez faire du vélo") ;
				}
			}			
		} else {
			System.out.println("Madame Bovary est-il dans la bibliothèque de votre salon ?" ) ;
			questionC = sc.next()  ;
			if (questionC.equals("non")) {
				System.out.println("Allez à la bibliothèque municipale") ;
				System.out.println("Madame Bovary est-il disponible à l'emprunt ?") ;
				questionD = sc.next() ;
				// J'emprunte un livre à la bibliothèque
				if (questionD.equals("oui")) {
					System.out.println("Empruntez Madame Bovary") ;
					livreChoisi = "Madame Bovary" ;
				}
				else {
					System.out.println("Empruntez un roman policier") ;
					livreChoisi = "roman policier" ;
				}
				System.out.println("Rentrez chez vous") ;
			} else {
				livreChoisi = "Madame Bovary" ;
			}	
			System.out.println("Lisez le livre "+livreChoisi+" dans le fauteuil") ;
		}

	
	}		
}