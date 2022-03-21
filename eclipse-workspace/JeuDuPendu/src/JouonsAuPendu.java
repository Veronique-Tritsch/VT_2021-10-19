import java.util.Scanner;

public class JouonsAuPendu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mot ; 
		
		char caractere ;
		String letter ;
		int indice ;
		boolean caractereTrouve ;


		Scanner sca = new Scanner(System.in) ;

		do {
			System.out.println("Veuillez saisir un mot d'au moins 5 lettres");
			/* Pour éviter les problèmes de casse, on récupère la chaîne de caractères mot en majuscules. 
			 * On ne comparera par après que des lettres en majuscules
			 */
			mot = sca.nextLine().toUpperCase() ;
		}
		while (mot.length() < 5) ;
		/* On déclare "TableauDeCaracteres" qui est un tableau de caractères 
		 * constitué de mot.length() caractères
		 */
		char[] tableauDeCaracteres = new char[mot.length()] ;
		/* On affecte au premier et dernier terme de "tableauDeCaracteres" 
		 * respectivement la première et la dernière lettre du de la chaîne de caractères "mot"
		 * et aux autres termes on affecte un tiret
		 */
		tableauDeCaracteres[0] = mot.charAt(0);
		tableauDeCaracteres[mot.length()-1] = mot.charAt(mot.length()-1) ;
		/* On affecte aux termes de tableauDeCaracteres 
		 * qui ne sont pas aux extrémités la valeur "-" 
		 */
		for (int i = 1 ; i < mot.length()-1 ; i++) {
			tableauDeCaracteres[i] = '-' ; }


		for (int i = 0 ; i< mot.length() ; i++) {

			System.out.print(tableauDeCaracteres[i]) ; }

		indice = 0 ;
		String valeurActuelle;
		do {
			
			System.out.println("\nproposez un caractère (ou une lettre)") ;
			/* il y a un "if ternaire" dans l'instruction qui suit (après le mot "essai") :
			 * on mettra un "s" à "essai" si le nombre (6-indice) est supérieur à 1 */
			System.out.println("vous avez encore droit à " + (6-indice) +" essai"+((6-indice) > 1 ? "s":""));
			/* Pour éviter des casses différentes lors des comparaisons 
			 * on récupère la chaîne de caractères string en majuscules. */
			letter = sca.next().toUpperCase() ;
			caractere = letter.charAt(0) ;
			caractereTrouve = false ;

			for (int j = 1 ; j < mot.length()-1 ; j++ ) {
				if (caractere == mot.charAt(j)) {
					tableauDeCaracteres[j] = caractere ;
					caractereTrouve = true ;}
				if (caractereTrouve == false && j == mot.length()-2)
				{ indice++ ;}
			}
			for (int i = 0 ; i< mot.length() ; i++) {
				System.out.print(tableauDeCaracteres[i]) ; }
			/*copyValueOf est une fonction qui convertit 
			un tableau de caractères en chaîne de caractères
			*/
			valeurActuelle = String.copyValueOf(tableauDeCaracteres);
		} while ((indice < 6 || caractereTrouve == true) && !mot.equals(valeurActuelle)) ;

		if (mot.equals(valeurActuelle)) {
			System.out.println("le mot " + valeurActuelle + " a été trouvé");
		}












	}

}
