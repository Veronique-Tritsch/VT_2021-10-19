import java.util.Scanner;

public class RechercherUnNbDansUnTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int tab[] = {25,40,45,60,100,110} ;
		int i ;
		int nbSaisi ;
		boolean estDansTab = false;

		System.out.println ("Saisissez un nombre entier ") ;
		Scanner sca = new Scanner(System.in);
		nbSaisi = sca.nextInt();
		i = 0 ; 
		while (i < tab.length) {
			if (tab[i] == nbSaisi) {
				estDansTab = true ;
				System.out.println ("Le nombre saisi est dans le tableau à la "+(i+1)+"ème position et donc avec l'indice " +i+ ".") ;				
			}
			i =i+1 ;
		}
		if (estDansTab == false) {
			System.out.println ("Le nombre saisi n'est pas dans le tableau.") ;

		}

		sca.close();
	}

}
