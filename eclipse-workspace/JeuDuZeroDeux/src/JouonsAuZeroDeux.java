import java.util.Random;
import java.util.Scanner;

public class JouonsAuZeroDeux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean quitter ;
		int totalOrdi ;
		int totalJoueur ;
		int nbOrdi ;
		int nbJoueur ;

		quitter = false ;
		totalOrdi = 0 ;
		totalJoueur = 0 ;
		Scanner sca = new Scanner(System.in) ;

		Random valeurOrdi = new Random() ;

		do {
			System.out.println ("Saisissez le chiffre 0, 1 ou 2 ou un entier n�gatif pour quitter le jeu.") ;

			nbJoueur = sca.nextInt();

			nbOrdi = valeurOrdi.nextInt (3) ;

			if (nbJoueur < 0) {
				quitter = true ;}
			if (Math.abs(nbJoueur-nbOrdi) == 2 ) {
				if (nbJoueur>nbOrdi) {
					totalJoueur = totalJoueur + 1 ;
					System.out.println("L'ordinateur a jou� " + nbOrdi + ". Vous avez donc remport� un point et avez ainsi un total de "+ totalJoueur + " point(s). ") ; }
				else {totalOrdi = totalOrdi + 1 ;
				System.out.println("L'ordinateur a jou� " + nbOrdi + ". L'ordinateur a donc remport� un point et a ainsi un total de " + totalOrdi + " point(s)") ;} 
			}
			if (Math.abs(nbJoueur - nbOrdi)	== 1) {
				if (nbJoueur<nbOrdi) {
					totalJoueur = totalJoueur + 1 ;
					System.out.println("L'ordinateur a jou� " + nbOrdi + ". Vous avez donc remport� un point et avez ainsi un total de "+ totalJoueur + " point(s).") ; }
				else {totalOrdi = totalOrdi + 1;
				System.out.println("L'ordinateur jou� " + nbOrdi + ". L'ordinateur a donc remport� un point et a ainsi un total de "+ totalOrdi + " point(s).") ; }
			}
			if (nbJoueur - nbOrdi == 0) {
				System.out.println("M�mes nombres donn�s. Ni vous ni l'ordinateur n'avez remport� de point.") ;}
		}
		while (totalOrdi<5 && totalJoueur<5 && quitter == false) ;

		if (totalOrdi>totalJoueur && quitter == false) {
			System.out.println("L'ordinateur a gagn�.");}

		else if (totalJoueur > totalOrdi && quitter == false) {
			System.out.println("Vous avez gagn� contre l'ordinateur."); }
		else if (quitter == true) {
			System.out.println ("Vous avez mis fin au jeu.") ;}
		sca.close() ;
	}


}


