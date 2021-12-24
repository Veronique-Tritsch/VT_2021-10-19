import java.util.Scanner;

public class ComparerTroisNombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a ;
		float b ;
		float c ;
		System.out.println("Entrez un premier nombre");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		System.out.println("Entrez un deuxième nombre différent du premier");
		b = sc.nextFloat();
		System.out.println("Entrez un troisième nombre différent des deux premiers");
		c = sc.nextFloat();
		if (a<b) {
			if (b<c) {
				System.out.println(a+"<"+b+"<"+c) ;
			}
			else if (c<a) {
				System.out.println(c+"<"+a+"<"+b) ;
			}
			else {
				System.out.println(a+"<"+c+"<"+b) ;
			}
		}
		else {
			if (c<b) {
				System.out.println (c+"<"+b+"<"+a) ;
			}
			else {
				if (a<c) {
					System.out.println (b+"<"+a+"<"+c) ;	
				}
				else {
					System.out.println (b+"<"+c+"<"+a) ;
				}
			}

		}
	}

}
				
		
			
		
