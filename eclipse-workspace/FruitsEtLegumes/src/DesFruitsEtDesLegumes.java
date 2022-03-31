import java.util.Scanner;

public class DesFruitsEtDesLegumes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String donnees ;
		String [] tableauDeLegumesEtPrix = new String[100] ;
		float prix = 0.0f; 

		Scanner sca = new Scanner(System.in) ;
		System.out.println("Saisissez le nom d'un légume et son prix au kilogramme (sans les unités)");
		int i = 0;
		
		do {
			donnees = sca.nextLine();
 
			if (!donnees.equals("go")) {
				String[] split = donnees.split(" ") ;
				tableauDeLegumesEtPrix[i] = split[0];
				tableauDeLegumesEtPrix[i+1] = split[1];
				

				if (tableauDeLegumesEtPrix.length >= 2 && tableauDeLegumesEtPrix.length % 2 == 0) {

					//System.out.println("Un kilogramme de " + tableauDeLegumesEtPrix[i] + " coûte " + tableauDeLegumesEtPrix[i+1] + " euros");
					i = (i+2)%tableauDeLegumesEtPrix.length;
				}
				else {
					System.out.println("erreur de saisie ; entrez de nouvelles données");
				}				
			}

		}
		while (!donnees.equals("go")) ;
		i = 0;
		int prixMin=0;
		if (tableauDeLegumesEtPrix[0] != null) {
			prixMin = 1;
			prix = Float.parseFloat(tableauDeLegumesEtPrix[1]);
		}
		while (i < tableauDeLegumesEtPrix.length && tableauDeLegumesEtPrix[i] != null) {
			System.out.println("Un kilogramme de " + tableauDeLegumesEtPrix[i] + " coûte " + tableauDeLegumesEtPrix[i+1]);
			float prixTemporaire = Float.parseFloat(tableauDeLegumesEtPrix[i+1]);
			if (prixTemporaire < prix) {
				prixMin = i+1;
				prix= prixTemporaire;
			}
			i+=2;
		}
		if (prixMin != 0) 
			System.out.println("Le moins cher est " + tableauDeLegumesEtPrix[prixMin-1] + " a " + tableauDeLegumesEtPrix[prixMin] + "€");
		


	}

}
