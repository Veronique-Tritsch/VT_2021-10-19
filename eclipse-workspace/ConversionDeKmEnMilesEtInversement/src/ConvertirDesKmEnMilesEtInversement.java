import java.util.Scanner;

public class ConvertirDesKmEnMilesEtInversement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] tableauDeConversion ;
		String saisie ;
		float valeur ;
		String uniteDeMesure ;
		float conversion ;

		Scanner sca = new Scanner(System.in);

		System.out.println("Entrez une valeur suivie d'une unit� : km ou mi") ;
		saisie = sca.nextLine() ;
		// La m�thode nextLine r�cup�re toute la ligne et pas uniquement la partie de ligne avant l'espace
		
		tableauDeConversion = saisie.split(" ") ;
		//tableauDeConversion est un tableau de cha�nes de caract�res qui seront toutes celles comprises entre le caract�re espace (qui se trouve entre les guillemets)
		
		valeur = Float.valueOf(tableauDeConversion[0]);
		// La m�thode valueOf sert � convertir une cha�ne de caract�res en float ou integer ou double

		if(tableauDeConversion.length > 1) {
			uniteDeMesure = tableauDeConversion[1] ; 
		}		
		else {
			uniteDeMesure = "km" ;
		}

		uniteDeMesure = uniteDeMesure.toLowerCase() ;
		// La m�thode toLowerCase traduit en minuscules la variable uniteDeMesure et renvoie cette cha�ne de caract�res (en minuscules) � la variable uniteDEMesure  
		
		if (uniteDeMesure.equals("km")) {
			conversion = valeur/1.609f ;
			System.out.println("La distance "+ valeur +" en km vaut " + conversion + " miles");
		}
		else {
			
		conversion = valeur*1.609f ;
		System.out.println("La distance "+ valeur +" en miles vaut " + conversion + " km");
		
		}
		
		

	}
}


