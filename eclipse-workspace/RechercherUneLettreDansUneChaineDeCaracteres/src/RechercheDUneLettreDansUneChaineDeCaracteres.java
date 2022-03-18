import java.util.Scanner;

public class RechercheDUneLettreDansUneChaineDeCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char caractere	;
		String chaine ;
		int longueurDeChaine ;
		int j ;
		int[] PositionnementDuCaractereDansLeTexte = new int[200] ;
		int index ;


		System.out.println("Saisissez un texte quelconque et concluez-le par un point.");
		Scanner sca = new Scanner (System.in) ;
		chaine = sca.nextLine() ; 

		longueurDeChaine = chaine.length() ;

		String caractereAChercher ;
		/* Répétition d'une boucle tant qu'on n'a pas introduit au moins un caractère*/
		do {
			System.out.println("Saisissez un (seul) caractère");
			caractereAChercher =sca.nextLine() ; 
		}
		while (caractereAChercher.length() < 1 ) ;
		// Affectation du 1er caractère saisi à la variable caractere
		caractere = caractereAChercher.charAt(0) ;

		int nbDeFoisEstPresenteLaLettre = 0 ;


		if (longueurDeChaine == 1) {

			System.out.println ("La chaîne est vide") ;
		}
		else {
			index = 0 ;

			for (int i=0 ; i<(chaine.length()-1) ; i++) {

				if (chaine.charAt(i) == caractere) {

					nbDeFoisEstPresenteLaLettre++ ;
					PositionnementDuCaractereDansLeTexte[index] = i+1 ;
					index++;

				}

			}
			if (nbDeFoisEstPresenteLaLettre == 0) {
				System.out.println("Le caractère n'est pas présent dans le texte.");	
			}
			else { 
				System.out.println("le caractere " + caractere + " est présent " + nbDeFoisEstPresenteLaLettre + " fois dans le texte.");

				for (int k=0 ; k <index ; k++) {
					System.out.println("le caractere " + caractere + " est présent à la " + PositionnementDuCaractereDansLeTexte[k] + "ème position dans le texte.");
				}


			}

		}

	}

}
