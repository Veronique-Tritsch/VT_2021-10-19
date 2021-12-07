import java.text.DecimalFormat;
import java.util.Scanner;

public class InteretsAcquisSimpleEtCompose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Déclaration de variables
		
		float  sommeInitiale;
		float sommePlaceeNAnnees;
		float sommePlaceeAvecInteretCompose ;
		float interet ; 
		int nombreDAnnees ;
		
		//Saisie
		
		//Rappel : inutile de définir plusieurs fois la fonction Scanner (de nom sc)
		
		System.out.println("Insérer la somme placée sur le compte bancaire") ;
		Scanner sc = new Scanner(System.in) ;
		sommeInitiale = sc.nextFloat() ;
		
		System.out.println("Insérer le taux d'intérêt du placement en %") ;
		interet = sc.nextFloat() ;
		
		System.out.println("Insérer le nombre d'années du placement bancaire") ;
		nombreDAnnees = sc.nextInt() ;
		
		sommePlaceeNAnnees = sommeInitiale*(1+nombreDAnnees*interet) ;
		
		
		DecimalFormat df = new DecimalFormat("0.00") ;
		
		
		
		System.out.println("La valeur est " +df.format(sommePlaceeNAnnees));
	
		
		
		
		
				
		
		
		
		
		
		
		
	}

}
