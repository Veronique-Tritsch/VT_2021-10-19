import java.util.Scanner;

public class ConvertirDesKmEnMiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nbDeKm;
		float nbDeMiles ;
		String valeurSaisieParLUtilisateur ;

		do
		{
			nbDeKm = 0;
			System.out.println("Entrez un nb de km compris entre 0,01 et 1000000 pour le convertir en miles ou appuyer sur \"q\" pour quitter le programme") ;
			Scanner sca = new Scanner(System.in) ;

			valeurSaisieParLUtilisateur = sca.next() ;
			if (valeurSaisieParLUtilisateur.equals("q")) {
				System.exit(0) ;
			}
			else {
				try {
					nbDeKm = Float.parseFloat(valeurSaisieParLUtilisateur) ;
				} catch (NumberFormatException ex) {
					//ex.printStackTrace() ;
					System.out.println("mauvaise valeur");
				}
			}
		} while (nbDeKm < 0.01 || nbDeKm > 1000000) ;
		nbDeMiles = nbDeKm/1.609f ;
		System.out.println(nbDeKm+" km donnent "+nbDeMiles+" miles") ;


	}

}
