import java.util.Scanner;

public class DeuxiemeProjet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nombre ;
		int indice ;


		Scanner sca = new Scanner (System.in) ;

		nombre = sca.nextInt() ;

		indice = 0 ;

		do {System.out.println(nombre + indice)  ;
		indice++ ;
		}
		while (indice <=10) ;
		
	
	}

}
