import java.text.DecimalFormat;
import java.util.Scanner;

public class InteretsAcquisSimpleEtCompose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//D�claration de variables
		
		float  sommeInitiale;
		float sommePlaceeNAnnees;
		float sommePlaceeAvecInteretCompose ;
		float interet ; 
		int nombreDAnnees ;
		
		//Saisie
		
		//Rappel : inutile de d�finir plusieurs fois la fonction Scanner (de nom sc)
		
		System.out.println("Ins�rer la somme plac�e sur le compte bancaire") ;
		Scanner sc = new Scanner(System.in) ;
		sommeInitiale = sc.nextFloat() ;
		
		System.out.println("Ins�rer le taux d'int�r�t du placement en %") ;
		interet = sc.nextFloat() ;
		
		System.out.println("Ins�rer le nombre d'ann�es du placement bancaire") ;
		nombreDAnnees = sc.nextInt() ;
		
		sommePlaceeNAnnees = sommeInitiale*(1+nombreDAnnees*interet) ;
		
		
		DecimalFormat df = new DecimalFormat("0.00") ;
		
		
		
		System.out.println("La valeur est " +df.format(sommePlaceeNAnnees));
	
		
		
		
		
				
		
		
		
		
		
		
		
	}

}
