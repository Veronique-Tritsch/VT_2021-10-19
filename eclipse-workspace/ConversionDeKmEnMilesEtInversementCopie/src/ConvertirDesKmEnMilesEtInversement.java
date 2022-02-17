import java.util.Scanner;

public class ConvertirDesKmEnMilesEtInversement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] tableauDeConversion ;
		String saisie ;
		float valeur ;
		String uniteDeMesure ;
		float conversion ;
		boolean veutQuitter = false;
		boolean veutConvertir = false;
		float[] valeurAConvertir = new float[100];
		String[] uniteDeMesureAConvertir = new String[100];
		int indexAConvertir;
		Scanner sca = new Scanner(System.in);
		do {
			indexAConvertir = 0;
			do {
				System.out.println("Entrez une valeur suivie d'une unit� : km ou mi") ;
				saisie = sca.nextLine().toLowerCase() ; 
				// On change la casse de la saisie en minusculeS tout en la r�cup�rant
				// La m�thode nextLine r�cup�re toute la ligne et pas uniquement la partie de ligne (cha�ne de caract�res) avant l'espace


				// La m�thode trim �limine tous les caract�res espace qui entourent aux extr�mit�s la variable saisie
				//et renvoie cette nouvelle cha�ne de caract�res � la variable saisie
				saisie = saisie.trim();	



				if (saisie.equals("go")){ // on verifie si la chaine est �gal � go
					/* Rem. : on aurait pu saisir : if (saisie.equals("go")== true) � la place de : if (saisie.equals("go")) */
					veutConvertir = true;

					/* On verifie que la cha�ne n'est pas un q ; dans le cas o� elle ne l'est pas on effectue le traitement*/
				} else if (!saisie.equals("q")) { 

					//tableauDeConversion est un tableau de cha�nes de caract�res qui seront toutes celles comprises 
					// entre le caract�re espace (qui se trouve entre les guillemets)
					tableauDeConversion = saisie.split(" ") ;

					// La m�thode valueOf sert � convertir une cha�ne de caract�res en float ou integer ou double
					valeurAConvertir[indexAConvertir] = Float.valueOf(tableauDeConversion[0]);

					if(tableauDeConversion.length > 1) {
						uniteDeMesureAConvertir[indexAConvertir] = tableauDeConversion[1].toLowerCase() ; 
					}		
					else {
						uniteDeMesureAConvertir[indexAConvertir] = "km" ;
					}
					indexAConvertir = Math.min(indexAConvertir+1, uniteDeMesureAConvertir.length);
				} 
				else {
					veutQuitter = true;
				}
			}while (!veutConvertir && !veutQuitter);

			if (veutConvertir) {
				for (int i = 0; i < indexAConvertir; i++) {
					if (uniteDeMesureAConvertir[i].equals("km")) {
						conversion = valeurAConvertir[i]/1.609f ;
						System.out.println("La distance "+ valeurAConvertir[i] +" en km vaut " + conversion + " miles");
					}
					else {						
						conversion = valeurAConvertir[i]*1.609f ;
						System.out.println("La distance "+ valeurAConvertir[i] +" en miles vaut " + conversion + " km");

					}
				}
			}
		} while (!veutQuitter);

	}
}


