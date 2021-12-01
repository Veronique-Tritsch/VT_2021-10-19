import java.util.Scanner;

public class AireEtVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION DES VARIABLES
		float rayon;
		double aire;
		double volume;
		
		//SAISIE
		System.out.println("Saisissez le rayon d'une sphère (sans les unités)");
		Scanner sc = new Scanner(System.in);
		rayon = sc.nextFloat();
		
		//TRAITEMENT
		aire = 4*Math.PI*Math.pow(rayon,2);
		volume = 4*Math.PI*Math.pow(rayon,3)/3;
		//autre possibilité de saisie 
		//volume = 4D/3*math.PI*Math.pow(rayon,3);
		//volume = ((Double)4)/3*Math.PI*math.pow(rayon,3);
		

		
		//AFFICHAGE
		System.out.println("L'aire de la sphère est : "+aire+" et le volume de la sphère est :"+volume);
		
				
	
	}

}
