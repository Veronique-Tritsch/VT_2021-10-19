import java.util.Scanner;

public class CalculDesMPremiersNombresParfaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbDeNbParfaitsATrouver ;
		int nbCourantDeNbParfaits ;
		int nbParfaitPotentiel ;
		int diviseur ;

		Scanner sc = new Scanner(System.in);


		System.out.println("Entrer un nombre entier N qui correspondra au nombre des N premiers nombres parfaits");
		nbDeNbParfaitsATrouver = sc.nextInt() ;

		nbCourantDeNbParfaits = 1 ;


		nbParfaitPotentiel = 2 ;

		while (nbCourantDeNbParfaits <= nbDeNbParfaitsATrouver) {
			int somme=0 ;
			for (diviseur =1 ; diviseur < nbParfaitPotentiel-1 ; diviseur++)	
			{
				if(nbParfaitPotentiel % diviseur == 0) {
					somme = somme + diviseur ;	
				}
			}
			if (somme==nbParfaitPotentiel) {
				nbCourantDeNbParfaits = nbCourantDeNbParfaits + 1 ;
				System.out.println(nbParfaitPotentiel+" est parfait");
			}

			nbParfaitPotentiel = nbParfaitPotentiel+1 ;	

		}

		sc.close() ;
	}	
}


