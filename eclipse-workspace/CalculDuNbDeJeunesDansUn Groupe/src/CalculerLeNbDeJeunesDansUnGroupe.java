import java.util.Scanner;

public class CalculerLeNbDeJeunesDansUnGroupe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String listeDesAges ;
		String [] tableauDesAges ;
		
		int j ;

		j=0 ;

		System.out.println ("Saisissez un nombre quelconque d'entiers correspondant à l'âge de personnes quelconques.") ;
		Scanner sca = new Scanner(System.in) ;

		listeDesAges= sca.nextLine().trim() ;
		// On peut trim et split à la suite un string avec string.trim().split(" ");

		tableauDesAges = listeDesAges.split(" ") ;
		
		
		int [] age = new int[tableauDesAges.length]; 
		
		for (int i = 0 ; i < tableauDesAges.length ; i++) {
			age[i] = Integer.parseInt(tableauDesAges[i]);
			if (age[i] < 20) {
				j++;}
		}

System.out.println(j+" personnes ont moins de 20 ans.");

sca.close();




}

}
