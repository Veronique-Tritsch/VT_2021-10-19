import java.util.Scanner;

public class CorrectionUnExerciceEstILBienCompris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        //DECLARATION DE VARIABLES
        //chaine de charactere compris
        String  compris;
        //chaine de charactere compris2
        String compris2;
        // affichage 1ere action
        // ecrire "Faire une lecture attentive"
        System.out.println("Faire une lecture attentive");
        //ecrire "Avez-vous compris ? oui /non"
        System.out.println("Avez-vous compris ? oui/non");
        //creation du scanner
        Scanner sc = new Scanner(System.in);
        //Lire compris
        compris = sc.nextLine();
        //Si    (compris == "non") Alors
        if (compris.equals("non")) {
            // ecrire "Effectuez une relecture de l'énoncé"
            System.out.println("Effectuez une relecture de l'énoncé");
            // ecrire "Avez vous bien compris l'énoncé cette fois-ci? oui / non"
            System.out.println("Avez-vous compris l'énoncé cette fois-ci ? oui / non");
            //lire compris2
            compris2 = sc.next();
            //Si (compris2 == "non") Alors
            if (compris2.equals("non")) {
                //ecrire "Demandez de l'aide à votre formateur"
                System.out.println("Demandez de l'aide à votre formateur");
            //FinSi
            }
        //FinSi
        }
        //ecrire "Commencez le travail demandé, écrire le pseudo-code, puis le vérifier, écrire le programme, le vérifier, constituer le jeu d'essai et tester le programme."
        System.out.println("Commencez le travail demandé, écrire le pseudo-code, puis le vérifier, écrire le programme, le vérifier, constituer le jeu d'essai et tester le programme.");
        sc.close();
    }
}
