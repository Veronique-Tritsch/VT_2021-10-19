package convertisseurs;

import java.util.*;
import java.lang.System ;

public class ConvertisseurSimple {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uniteEtMesure ;
		String[] temperatureAConvertir ;
		String uniteFinale ;
		double nbConverti ;
		double valeurAConvertir ;
		do {
			System.out.println ("Saisissez une température comprise entre -459.67 et 500000 suivi de son unité de mesure C ou F." ) ;
			
			Scanner sca = new Scanner(System.in) ;
					
			uniteEtMesure = sca.nextLine() ;
			
			uniteEtMesure = uniteEtMesure.toUpperCase () ;
			
			temperatureAConvertir = uniteEtMesure.split(" ") ;
			valeurAConvertir = Double.parseDouble (temperatureAConvertir[0]) ;
		}
			while(valeurAConvertir < -459.67 || valeurAConvertir > 5000000 );
		if(temperatureAConvertir[1].equals("F")) {
			nbConverti = (valeurAConvertir - 32)*5/9 ;
			uniteFinale = "°C" ;
			}
		else {
			nbConverti = (valeurAConvertir*9/5) + 32 ;
		uniteFinale ="°F" ; }
		System.out.println(valeurAConvertir + " °" + temperatureAConvertir[1] + " = " + nbConverti + " " + uniteFinale) ;
		}

	}

