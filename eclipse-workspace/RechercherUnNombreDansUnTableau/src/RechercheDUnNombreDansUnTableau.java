import java.util.Scanner;

public class RechercheDUnNombreDansUnTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tableauDEntiers = new int[] {3,7,9,14,22,30} ; 
		int indice = 0 ;
		int nbN ; 
		int valeurIndice = -1 ;

		Scanner sca = new Scanner(System.in);
		System.out.println ("Saisissez un nombre entier") ;
		nbN = sca.nextInt() ;

		for (int valeur : tableauDEntiers) {
			if (nbN ==valeur) {
				System.out.println("Le nombre recherch� est � l'indice : " + indice +" et � la "+ (indice+1) +"�me position dans le tableau");
				valeurIndice = indice ;
			}
			indice++ ;
		}

		if (valeurIndice == -1) {
			System.out.println("Nomnre "+"non trouv�") ;
		}

		sca.close();

	}

}
