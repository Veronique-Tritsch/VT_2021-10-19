import java.util.Scanner;

public class AireEtVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION DES VARIABLES
		float rayon;
		float aire;
		float volume;
		
		//SAISIE
		System.out.println("Saisissez le rayon d'une sph�re (sans les unit�s)");
		Scanner sc = new Scanner(System.in);
		rayon = sc.nextFloat();
		
		//TRAITEMENT
		aire = 4*Math.PI*Math.pow(rayon,2);
		volume = 4*Math.PI*Math.pow(rayon,3)/3;
		
		//AFFICHAGE
		System.out.println("L'aire de la sph�re est : "+aire+" et le volume de la sph�re est :"+volume);
		
				
	
	}

}
