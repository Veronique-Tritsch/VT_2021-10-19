import java.util.Scanner;

public class DiviseursDUnEntier {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int a ;
		int j ;
		int reste ;

		System.out.println("Entrez un entier a") ;


		Scanner sc = new Scanner(System.in) ;

		a = sc.nextInt() ;

		if (a == 0) {
			System.out.println("Tous les nombres entiers divisent "+a) ;
		}
		else if (a == 1) {
			System.out.println(a+" n'est divisible que par lui-même") ;
		}
		else {
			boolean aPasDeDiviseur = true;
			for (j = 2 ; j<= a-1 ; j++) {
				reste = a % j ;
				if (reste == 0) {
					System.out.println(j+" divise "+a) ;
					aPasDeDiviseur=false;
				}
			}

			if (aPasDeDiviseur==true)
			{
				System.out.println(a+" n'a pas de diviseurs autres que 1 et lui-même") ;

			}
			else {
				System.out.println(a+" est aussi divisible par 1 et lui-même") ;
			}
		}



	}

}
