import java.util.Scanner;

public class AnneeBissextileOuNon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a ;
		System.out.println("Entrez une année");

		Scanner sc = new Scanner(System.in) ;
		a = sc.nextInt() ;
		if (a%4 == 0 ) {
			if ((a%100 == 0) && (a%400 != 0)) {
				System.out.println("L'année n'est pas bissextile") ;
			}
			else {
				System.out.println("L'année est bissextile") ;
			}
		}
		else {
			System.out.println("L'année n'est pas bissextile") ;

		}
		sc.close();
	}

}