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
		
		System.out.println("Entrez une valeur suivie d'une unité : km ou mi") ;
		saisie = sca.nextLine() ;
		// La méthode nextLine récupère toute la ligne et pas uniquement la partie de ligne (chaîne de caractères) avant l'espace
		
		
		// La méthode trim élimine tous les caractères espace qui entourent aux extrémités la variable saisie
		//et renvoie cette nouvelle chaîne de caractères à la variable saisie
		saisie = saisie.trim();
		
		//tableauDeConversion est un tableau de chaînes de caractères qui seront toutes celles comprises 
		// entre le caractère espace (qui se trouve entre les guillemets)
		tableauDeConversion = saisie.split(" ") ;
		
		// La méthode valueOf sert à convertir une chaîne de caractères en float ou integer ou double
		valeur = Float.valueOf(tableauDeConversion[0]);

		if(tableauDeConversion.length > 1) {
			uniteDeMesure = tableauDeConversion[1] ; 
		}		
		else {
			uniteDeMesure = "km" ;
		}
  
		/* La méthode toLowerCase traduit en minuscules la variable uniteDeMesure et renvoie cette chaîne de caractères
		(en minuscules) à la variable uniteDeMesure */
		uniteDeMesure = uniteDeMesure.toLowerCase() ;
		
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


