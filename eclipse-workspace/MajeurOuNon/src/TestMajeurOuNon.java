
public class TestMajeurOuNon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int ageATester =27;

		String resultat = estIlMajeur(ageATester) ;


		System.out.println (resultat) ;

	}// fin de la fonction main


	public static String estIlMajeur (int age) {
		if (age>= 18) {
			return "Majeur" ;
		}
		else {
			return "Mineur" ;
		}
	}

}
 // Fin de la classe
