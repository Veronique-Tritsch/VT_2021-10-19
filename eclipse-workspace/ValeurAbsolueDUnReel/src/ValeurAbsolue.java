import java.util.Scanner;

public class ValeurAbsolue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float reelA ;
		

		System.out.println ("Entrez svp un r�el") ;
		Scanner sc = new Scanner(System.in);
		reelA = sc.nextFloat() ;
		
		if (reelA<0) {
			reelA = - reelA ;
		}
		System.out.println ("La valeur absolue du r�el est "+reelA) ;
		sc.close();
	}

}
