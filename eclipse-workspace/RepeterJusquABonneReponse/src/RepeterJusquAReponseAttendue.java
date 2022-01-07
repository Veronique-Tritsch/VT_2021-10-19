import java.util.Scanner;

public class RepeterJusquAReponseAttendue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reponse ;
		Scanner sc = new Scanner(System.in) ;
		
		do {
		System.out.println("Allez-vous bien ? oui/non");
		reponse= sc.next() ;
		} while (!(reponse.equals("non") || reponse.equals("oui"))); 
		
		
		if (reponse.equals("oui")) {
			System.out.println("Tant mieux : pas de problème") ;
		}
		else{
			System.out.println("Reposez-vous pour vous sentir mieux") ;
		
		}
	}

}
