import java.util.Scanner;

public class ValeurAbsolue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float reelA ;
		

		System.out.println ("Entrez svp un réel") ;
		Scanner sc = new Scanner(System.in);
		reelA = sc.nextFloat() ;
		
		if (reelA<0) {
			reelA = - reelA ;
		}
		System.out.println ("La valeur absolue du réel est "+reelA) ;
		sc.close();
	}

}
