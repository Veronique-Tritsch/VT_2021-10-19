import java.util.Scanner;

public class InvertirDeuxNombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//DECLARATION DES VARIABLES
		
	float nombre1 ;
	float nombre2 ;
	float nombreDeStockage ;
	
	
	
	//SAISIE
		
	System.out.println("Insérer un nombre A") ;
	Scanner sc = new Scanner(System.in) ;
	nombre1 = sc.nextFloat() ;
	
	System.out.println("Insérer un nombre B") ;
	nombre2 = sc.nextFloat() ;
	
	
	//TRAITEMENT
	
	nombreDeStockage = nombre1 ;
	nombre1 = nombre2 ;
	nombre2 = nombreDeStockage ;
	
	
	//AFFICHAGE
	
	System.out.println("Le nombre A remplacé par le nombre B est "+nombre2+" et le nombre B remplacé par le nombre A est "+nombre1) ;
	
		
		}

}
