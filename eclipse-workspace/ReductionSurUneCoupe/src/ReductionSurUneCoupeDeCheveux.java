import java.util.Scanner;

public class ReductionSurUneCoupeDeCheveux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String etudiant ;
		String jourDeLaSemaine ;

		System.out.println("Etes-vous étudiant ? oui/non");
		Scanner sc = new Scanner(System.in);
		etudiant = sc.next();
		if (etudiant.equals("oui")) {
			System.out.println("Entrez le jour de la semaine");	
			jourDeLaSemaine = sc.next();
			if (jourDeLaSemaine.equals("jeudi")) {
				System.out.println("Vous avez droit à une réduction de 20 % sur la coupe");		
			} 
			else if (jourDeLaSemaine.equals("mercredi")) {
				System.out.println("Vous avez droit à une réduction de 50 % sur la coupe");
			}
			else {
				System.out.println("Le "+jourDeLaSemaine+" vous n'avez droit à aucune réductuion sur la coupe");
			}
		}
		else {
			System.out.println("Vous n'avez droit à aucune réduction");
		}

	}

}


