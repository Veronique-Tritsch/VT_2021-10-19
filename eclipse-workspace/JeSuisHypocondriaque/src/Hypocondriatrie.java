import java.util.Scanner;

public class Hypocondriatrie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	float temperature ;
	
	System.out.println("Quelle est votre temp�rature ?");
	Scanner sc = new Scanner(System.in);
	temperature = sc.nextFloat() ;

	
	while (temperature<=38)
	{
        System.out.println("Vous allez bien");
        System.out.println("Quelle est maintenant votre temp�rature ?");
        temperature = sc.nextFloat() ;
    }
    
	System.out.println("Allez chez le m�decin");
    sc.close();
	
	
    
	}

}
