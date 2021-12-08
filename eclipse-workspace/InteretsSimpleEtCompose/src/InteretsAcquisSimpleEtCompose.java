import java.text.DecimalFormat;
import java.util.Scanner;

public class InteretsAcquisSimpleEtCompose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//D�claration de variables
		
		float  sommeInitiale;
		float sommePlaceeNAnnees;
		double sommePlaceeAvecInteretCompose ;
		float interet ; 
		int nombreDAnnees ;
		
		//Saisie
		
		//Rappel : inutile de d�finir plusieurs fois la fonction Scanner (de nom sc)
		
		System.out.println("Ins�rer la somme plac�e sur le compte bancaire") ;
		Scanner sc = new Scanner(System.in) ;
		sommeInitiale = sc.nextFloat() ;
		
		System.out.println("Ins�rer le taux d'int�r�t du placement") ;
		interet = sc.nextFloat() ;
		
		System.out.println("Ins�rer le nombre d'ann�es du placement bancaire") ;
		nombreDAnnees = sc.nextInt() ;
		//Calcul de la somme acquise apr�s N ann�es de placement en int�r�t simple
		sommePlaceeNAnnees = sommeInitiale*(1+nombreDAnnees*interet) ;
		
		
		DecimalFormat df = new DecimalFormat("0.00") ;
		
		sommePlaceeAvecInteretCompose = sommeInitiale*Math.pow(1+interet,nombreDAnnees) ;
		
		
		System.out.println("La somme plac�e initialement rapporte en placement pendant "+nombreDAnnees+
				" ann�es avec un int�r�t simple : "+df.format(sommePlaceeNAnnees)+
				" et avec un int�r�t compos� pendant "+nombreDAnnees+" ann�es, elle rapporte : "+df.format(sommePlaceeAvecInteretCompose)) ;

	}

}
