import java.util.Scanner;

public class RechercheDUnPalindromeDansUneChaineDeCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String texte ;
		int longueurDuTexte = 0;
		//String[] tableauDeMots ;
		//char [] tableauDeLettres = new char[200]  ; 
		//char [] texteEnCaracteres ;
		//int k ;
		//int j ;
		
		boolean estUnPalindrome ;


		System.out.println ("Saisissez une chaîne de caractères et concluez-la par un point.") ;
		Scanner sca = new Scanner (System.in) ;
		texte = sca.nextLine().toUpperCase() ;

		if (texte.length()<= 1) {
			System.out.println ("La phrase est vide.") ;
			System.exit(0);
		}
		else {

			longueurDuTexte = texte.length() ;	
		} 
		/* Il faut uniquement rentrer dans cette structure alternative "if" si longueurDuTexte >= 2 
		 * et on a donc introduit préalablement un system.exit(0) pour quitter le programme quand la chaîne de caractères "texte" a une longueur inférieure ou égale à 1
		 */
		if (texte.charAt(longueurDuTexte - 1) == '.') {
			/* On enlève au texte le dernier caractère qui est censé être un point */
			texte = texte.substring(0,longueurDuTexte-1 ) ;}
			longueurDuTexte = texte.length();

		/* On enlève les espaces dans la chaîne de caractères "texte" 
		 et on les remplace par une chaîne vide dans la chaîne de caractères texte,
		 en utilisant la fonction replace */
		texte = texte.replace(" ","");
		
		/* On compare le i-ème caractère de la chaîne de caractères "texte" 
		 * au (length-1-i)-ème caractère de la même chaîne de caractères "texte"
		 * autant de fois que et pour les (partie entière de la division euclidienne de la longueur du String "texte" par 2) 
		 * premiers caractères de la chaîne de caractères "texte"
		 */
		
		estUnPalindrome = true ;
		int i = 0 ;
		while (estUnPalindrome && i <texte.length()/2) {
			if (texte.charAt(i) != texte.charAt(texte.length ()-1-i)) {
				estUnPalindrome = false ;
			}
		 i++ ;
		}
		
		/*if (estUnPalindrome) {
			System.out.println("Le texte saisi est un palindrome");
		} else {
			System.out.println ("Le texte saisi n'est pas un palindrome");
		}*/
		System.out.println((estUnPalindrome ? "Le texte saisi est un palindrome" : "Le texte saisi n'est pas un palindrome"));
		
		
		


		//char[] texteEnCaracteres = texte.toCharArray();

		//tableauDeMots = texte.split(" ") ;

		//k = 0 ;
		//for (int i = 0 ; i < tableauDeMots.length ; i++) {
			//j = 0 ;
			//while (j < tableauDeMots[i].length()) {

				//tableauDeLettres[k] = tableauDeMots[i].charAt(j) ;
				//k++ ;
				//j++ ; }

}

}
