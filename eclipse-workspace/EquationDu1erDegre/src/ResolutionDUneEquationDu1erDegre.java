import java.util.Scanner;

public class ResolutionDUneEquationDu1erDegre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a ; 
		float b ; 

		Scanner sc = new Scanner(System.in) ;
		System.out.println ("Entrez un réel a") ;
		a = sc.nextFloat() ;
		System.out.println ("Entrez un réel b") ;
		b = sc.nextFloat() ;
		if (a == 0 && b == 0) {
			System.out.println("L'équation ax + b = 0 a une infinité de solutions") ;
		}
		else if (a == 0 && b != 0) {
			System.out.println("L'équation ax + b = 0 n'admet aucune solution") ;	
		}
		else {
			System.out.println("L'équation ax + b = 0 admet comme solution "+(-b/a)) ;
		}
		sc.close();
	}

}
