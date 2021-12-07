import java.util.Scanner;

public class AireDUnSecteurAngulaireDeRayonR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//DECLARATION DES VARIABLES
		double rayon;
		double angle;
		double aireDuSecteurAngulaire;
		
	//SAISIE
		System.out.println("Saisissez le rayon d'un cercle (sans les unités)");
		Scanner sc = new Scanner(System.in);
		rayon = sc.nextFloat(); 
		System.out.println("Saisissez une valeur en degrés de votre secteur angulaire");
		angle = sc.nextFloat();
		
	//TRAITEMENT
		aireDuSecteurAngulaire = Math.PI*Math.pow(rayon,2)*angle/360;
				
	//AFFICHAGE
				System.out.println("L'aire du secteur angulaire de rayon "+rayon+" et d'angle "+angle+" "
						+ "degrés est : "+aireDuSecteurAngulaire);		
		}

}
