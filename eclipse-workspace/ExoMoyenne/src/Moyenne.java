import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Traduction du pseudo code en code Java
		
		//DECLARATION DES VARIABLES
		//Réel nombre1
		float nombre1;
		//Réel nombre2
		float nombre2;
		//Réel moyenne
		float moyenne;

		//SAISIE
		//écrire "Donnez-moi le premier nombre :"
		System.out.println("Donnez-moi svp le premier nombre :");
		//lire nombre1
		Scanner sc = new Scanner(System.in); //créer un outil scanner nommé sc
		nombre1 = sc.nextFloat();
		//System.out.println ("Vous avez saisi nombre1 :"+nombre1);
		
		System.out.println ("Donnez-moi svp le deuxième nombre :");
		nombre2 = sc.nextFloat();
		//System.out.println ("Vous avez saisi nombre2 :"+nombre2);
		
		//TRAITEMENT
		//calcul de la moyenne
		moyenne = (nombre1+nombre2)/2;
		//Si (moyenne>=10) Alors
		if (moyenne>=10) {
		//
		}
		//Sinon
		else {
		//	moyenne <-- moyenne + 1
			moyenne= moyenne + 1 ;
		//FinSI
		}
			
		//AFFICHAGE
		//ecrire "La moyenne des deux nombres est :",moyenne
		System.out.println ("La moyenne des deux nombres est: "+moyenne);
		
	}

}
