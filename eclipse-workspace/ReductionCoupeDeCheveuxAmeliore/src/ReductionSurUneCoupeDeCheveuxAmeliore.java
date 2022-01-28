import java.util.Scanner;

public class ReductionSurUneCoupeDeCheveuxAmeliore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String etudiant ;
		String jourDeLaSemaine ;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Etes-vous étudiant ? oui/non");
			
			//Ci-dessous on donne à la variable étudiant la valeur de sc.next() et on transforme cette valeur en minuscules
			
			etudiant = sc.next().toLowerCase() ;
			
			// la fonction qui renvoie la chaîne de caractères en majuscules est : VariableString.toUpperCase()
			
		}
		while (!etudiant.equals("oui") && !etudiant.equals("non")) ;
		  
		/* autre possibilité : while (!(etudiant.equals("oui") || !etudiant.equals("non"))) ; */


		if (etudiant.equals("oui")) {

			do {
				System.out.println("Entrez le jour de la semaine");
				jourDeLaSemaine = sc.next().toLowerCase();
			}
			while (!(jourDeLaSemaine.equals("lundi") 
					|| jourDeLaSemaine.equals("mardi") 
					|| jourDeLaSemaine.equals("mercredi") 
					|| jourDeLaSemaine.equals("jeudi") 
					|| jourDeLaSemaine.equals("vendredi") 
					|| jourDeLaSemaine.equals("samedi") ) ) ;

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

		sc.close();
	}

}


