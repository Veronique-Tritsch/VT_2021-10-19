import java.text.DecimalFormat;
import java.util.Scanner;

public class InteretsAcquisSimpleEtCompose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Déclaration de variables
		
		float  sommeInitiale;
		float sommePlaceeNAnnees;
		double sommePlaceeAvecInteretCompose ;
		float interet ; 
		int nombreDAnnees ;
		
		//Saisie
		
		//Rappel : inutile de définir plusieurs fois la fonction Scanner (de nom sc)
		
		System.out.println("Insérer la somme placée sur le compte bancaire") ;
		Scanner sc = new Scanner(System.in) ;
		sommeInitiale = sc.nextFloat() ;
		
		System.out.println("Insérer le taux d'intérêt du placement") ;
		interet = sc.nextFloat() ;
		
		System.out.println("Insérer le nombre d'années du placement bancaire") ;
		nombreDAnnees = sc.nextInt() ;
		//Calcul de la somme acquise après N années de placement en intérêt simple
		sommePlaceeNAnnees = sommeInitiale*(1+nombreDAnnees*interet) ;
		
		
		DecimalFormat df = new DecimalFormat("0.00") ;
		
		sommePlaceeAvecInteretCompose = sommeInitiale*Math.pow(1+interet,nombreDAnnees) ;
		
		
		System.out.println("La somme placée initialement rapporte en placement pendant "+nombreDAnnees+
				" années avec un intérêt simple : "+df.format(sommePlaceeNAnnees)+
				" et avec un intérêt composé pendant "+nombreDAnnees+" années, elle rapporte : "+df.format(sommePlaceeAvecInteretCompose)) ;

	}

}
