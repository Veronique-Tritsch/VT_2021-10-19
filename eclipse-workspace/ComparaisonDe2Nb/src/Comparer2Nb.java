import java.util.Scanner;

public class Comparer2Nb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a ;
		float b ; 
		System.out.println("Entrez un premier nombre");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat() ;
		System.out.println("Entrez un second nombre");
		b = sc.nextFloat() ;
		if (a<b) {
			System.out.println (a+"<"+b) ;
		}
		else if (a>b) {
			System.out.println(a+">"+b);
		}
		else {
			System.out.println(a+"="+b);
		}
	}
}
