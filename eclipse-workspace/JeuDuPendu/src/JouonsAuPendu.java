import java.util.Scanner;

public class JouonsAuPendu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mot ; 
		char[] tableauDeCaracteres = new char[15] ;
		char caractere ;
		String letter ;
		int indice ;
		boolean caractereTrouve ;


		Scanner sca = new Scanner(System.in) ;

		do {
			System.out.println("Veuillez saisir un mot d'au moins 5 lettres");
			mot = sca.nextLine() ;
		}
		while (mot.length() < 5) ;

		tableauDeCaracteres[0] = mot.charAt(0);
		tableauDeCaracteres[mot.length()-1] = mot.charAt(mot.length()-1) ;
		for (int i = 1 ; i < mot.length()-1 ; i++) {
			tableauDeCaracteres[i] = '-' ; }


		for (int i = 0 ; i< mot.length() ; i++) {

			System.out.print(tableauDeCaracteres[i]) ; }

		indice = 0 ;
		do {
			System.out.println("\nproposez un caractère (ou une lettre)") ;
			letter = sca.next() ;
			caractere = letter.charAt(0) ;
			caractereTrouve = false ;

			for (int j = 1 ; j < mot.length()-1 ; j++ ) {
				if (caractere == mot.charAt(j)) {
					tableauDeCaracteres[j] = caractere ;
					caractereTrouve = true ;}
				if (caractereTrouve == false && j == mot.length()-2)
				{ indice++ ;}
			}
		}
		while (indice < 6 || caractereTrouve == true) ;














	}

}
