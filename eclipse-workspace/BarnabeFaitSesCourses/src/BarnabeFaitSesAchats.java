import java.util.Scanner;

public class BarnabeFaitSesAchats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sommeInitiale ;
		double sommeDepensee ;
		double reste ;
		int nombreDeMagasinsVus ;
		double sommeInitialementDisponible ;

		Scanner sca = new Scanner(System.in); 
		System.out.println("Saisissez la somme que Barnabé peut dépenser.") ;
		sommeInitiale = sca.nextDouble() ;

		sommeInitialementDisponible = sommeInitiale ;

		nombreDeMagasinsVus = 0 ;
		while (sommeInitiale >=2 ) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
			sommeDepensee = sommeInitiale/2 + 1 ;
			reste = sommeInitiale- sommeDepensee ;
			sommeInitiale = reste ; 
			nombreDeMagasinsVus = nombreDeMagasinsVus + 1 ; }
		if (sommeInitiale > 0) {nombreDeMagasinsVus = nombreDeMagasinsVus + 1 ;}
		System.out.println ("La somme initiale de " +sommeInitialementDisponible + " euros est dépensée après avoir été dans " + nombreDeMagasinsVus + " magasins.") ;




=$ 




	}

}
