
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
		
		Scanner sc = new Scanner(System.in) ;
		
		do {
			System.out.println("Fait-il beau ?") ;

			questionA = sc.next() ;
		} while (!(questionA.equals("non") || questionA.equals("oui"))) ;

		if (questionA.equals("oui")) {
			do {			
				System.out.println("Le v�lo fonctionne-t-il correctement ?") ;
				questionB = sc.next() ;
			} while (!(questionB.equals("non") || questionB.equals("oui"))) ;

			if (questionB.equals("oui")) {
				System.out.println("Allez faire du v�lo") ; 
			}
			else {
				System.out.println("Allez chez le garagiste") ;
				do {
					System.out.println("Le v�lo est-il r�parable imm�diatement ?") ; 
					questionE = sc.next() ;
				} while (!(questionE.equals("non") || questionE.equals("oui"))) ;

				if (questionE.equals("non")) {
					System.out.println("Laissez le v�lo en r�paration et allez cueillir des joncs autour de l'�tang") ;
				}
				else {
					System.out.println("Allez faire du v�lo") ;
				}
			}			
		} 
		else {
			do { 
				System.out.println("Madame Bovary est-il dans la biblioth�que de votre salon ?" ) ;
				questionC = sc.next()  ;
			} while (!(questionC.equals("non") || questionC.equals("oui"))) ;
		

			if (questionC.equals("non")) {
				System.out.println("Allez � la biblioth�que municipale") ;
				do {
					System.out.println("Madame Bovary est-il disponible � l'emprunt ?") ;
					questionD = sc.next() ;
				} while (!(questionD.equals("non") || questionD.equals("oui"))) ;
				
				// J'emprunte un livre � la biblioth�que
				if (questionD.equals("oui")) {
					System.out.println("Empruntez Madame Bovary") ;
					livreChoisi = "Madame Bovary" ;
				}
				else {
					System.out.println("Empruntez un roman policier") ;
					livreChoisi = "roman policier" ;
				}
				System.out.println("Rentrez chez vous") ;
			} 
			else {
				livreChoisi = "Madame Bovary" ;
			}	
			System.out.println("Lisez le livre "+livreChoisi+" dans le fauteuil") ;
			sc.close() ;
		}
	}

}		
