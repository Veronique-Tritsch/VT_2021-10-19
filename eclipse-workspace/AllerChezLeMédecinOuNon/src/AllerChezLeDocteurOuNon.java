import java.util.Scanner;

public class AllerChezLeDocteurOuNon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean aDejaEteMalade ;
		float temperature ;
		
		boolean laTemperatureAToujoursEteBonne = true ;

		for (int i = 0 ; i<= 3 ; i =i+1) 
		{
			System.out.println ("Quelle est votre temp�rature (en �C) ?") ;
			Scanner sc = new Scanner(System.in) ;

			temperature = sc.nextFloat() ;
			
			boolean bonneTemperature = (temperature > 36.6 && temperature < 37.6) ;
			
			if (bonneTemperature == true) {
				System.out.println ("Vous n'avez pas de fi�vre")  ;
			}
			else {
				laTemperatureAToujoursEteBonne = false ;
				System.out.println ("Vous avez de la fi�re. Consultez un docteur") ;
			}
		}

		if (laTemperatureAToujoursEteBonne == true) {
			System.out.println ("En 4 mesures de votre temp�rature, vous n'avez jamais �t� f�brile") ;

		}


	}

}
