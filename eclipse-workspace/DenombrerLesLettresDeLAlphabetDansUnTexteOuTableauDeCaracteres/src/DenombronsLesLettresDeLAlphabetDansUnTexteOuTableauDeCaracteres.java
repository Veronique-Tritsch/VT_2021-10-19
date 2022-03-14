import java.util.Scanner;

public class DenombronsLesLettresDeLAlphabetDansUnTexteOuTableauDeCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String texte ;
		char [] alphabet = {'a' , 'b' , 'c' , 'd', 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o', 'p' , 'q' , 'r' , 's' , 't', 'u', 'v' , 'w' , 'x' , 'y', 'z' } ;
		int []  nombreDeFoisUneLettreDeLAlphabetEstPresenteDansLeTexte = new int[26] ;	
		
		do {
			System.out.println("Saisissez un texte d'au moins 120 caractères.");
			Scanner sca = new Scanner (System.in) ;
			texte = sca.nextLine() ;	
		} 
		while (texte.length() <120) ;
		
		for (int i = 0 ; i< texte.length(); i++) {
			for (int j =0 ; j<26 ; j++) {
			if (texte.charAt(i) == alphabet[j]) {
			nombreDeFoisUneLettreDeLAlphabetEstPresenteDansLeTexte[j] = nombreDeFoisUneLettreDeLAlphabetEstPresenteDansLeTexte[j]+1 ;}
			}
		}
		for (int k=0 ; k<26 ; k++) {
			System.out.println("La lettre " + alphabet[k] +" se trouve " + nombreDeFoisUneLettreDeLAlphabetEstPresenteDansLeTexte[k] + " fois dans le texte.");
		}
	}

}
