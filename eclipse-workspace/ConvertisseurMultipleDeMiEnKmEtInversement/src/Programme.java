import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;

		String valeurAConvertir ;
		String [] tableauDeConversion ;
		Boolean go = false ; 
		int index = 0 ;
		tableauDeConversion  = new String [100] ;


		do {
			System.out.println("Veuillez saisir une valeur à convertir") ;
			valeurAConvertir = sc.nextLine();
			if(valeurAConvertir.equals("go")) {
				go= true ;
			}
			else {
				tableauDeConversion[index] = valeurAConvertir ;
				index++ ;			
			}
		} while (go == false) ; 

		for (int i = 0; i < index; i++) {
			String val = tableauDeConversion[i] ;
			convertirUneValeur (val) ; // procédure convertirUneValeur
		}

		System.out.println("Programme terminé") ;

		sc.close (); 

	} // Fin de la méthode main


	// Création de la procédure convertirUneValeur
	
		public static void convertirUneValeur (String valeur) {

		/* déclaration et affectation de valeurs au tableau valeurEtUnite 
	grâce à la méthode split qui scinde la chaîne de caractères */ 
			
		String [] valeurEtUnite = valeur.split(" ") ;
		
		String unite ;
		double conversion ;
		String uniteResultat ;
		

		if (valeurEtUnite.length>1) {
			unite = valeurEtUnite[1];
		}
		else {
			unite = "km" ;
		}
		conversion = Double.parseDouble(valeurEtUnite[0]) ;
		if (unite.equals("km")) {
			conversion = conversion/1.609 ;
			uniteResultat = "mi";
		}
		else {
			conversion = conversion*1.609 ;
			uniteResultat ="km" ;
		}
		
		System.out.println(valeur + " = "+ conversion + " " + uniteResultat )	;
		
		} // Fin de la procédure ConvertirUneValeur
		
	} // Fin de la classe Progrmamme
