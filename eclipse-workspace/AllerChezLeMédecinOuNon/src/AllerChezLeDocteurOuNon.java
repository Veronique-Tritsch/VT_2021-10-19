import java.util.Scanner;

public class AllerChezLeDocteurOuNon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean aDejaEteMalade ;
		float temperature ;
		
		boolean laTemperatureAToujoursEteBonne = true ;

		for (int i = 0 ; i<= 3 ; i =i+1) 
		{
			System.out.println ("Quelle est votre température (en °C) ?") ;
			Scanner sc = new Scanner(System.in) ;

			temperature = sc.nextFloat() ;
			
			boolean bonneTemperature = (temperature > 36.6 && temperature < 37.6) ;
			
			if (bonneTemperature == true) {
				System.out.println ("Vous n'avez pas de fièvre")  ;
			}
			else {
				laTemperatureAToujoursEteBonne = false ;
				System.out.println ("Vous avez de la fière. Consultez un docteur") ;
			}
		}

		if (laTemperatureAToujoursEteBonne == true) {
			System.out.println ("En 4 mesures de votre température, vous n'avez jamais été fébrile") ;

		}


	}

}
