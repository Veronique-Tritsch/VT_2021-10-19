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
		/* R�p�tition d'une boucle tant qu'on n'a pas introduit au moins un caract�re*/
		do {
			System.out.println("Saisissez un (seul) caract�re");
			caractereAChercher =sca.nextLine() ; 
		}
		while (caractereAChercher.length() < 1 ) ;
		// Affectation du 1er caract�re saisi � la variable caractere
		caractere = caractereAChercher.charAt(0) ;

		int nbDeFoisEstPresenteLaLettre = 0 ;


		if (longueurDeChaine == 1) {

			System.out.println ("La cha�ne est vide") ;
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
				System.out.println("Le caract�re n'est pas pr�sent dans le texte.");	
			}
			else { 
				System.out.println("le caractere " + caractere + " est pr�sent " + nbDeFoisEstPresenteLaLettre + " fois dans le texte.");

				for (int k=0 ; k <index ; k++) {
					System.out.println("le caractere " + caractere + " est pr�sent � la " + PositionnementDuCaractereDansLeTexte[k] + "�me position dans le texte.");
				}


			}

		}

	}

}
