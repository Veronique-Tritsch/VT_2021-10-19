
public class ClaqueDansLesMains {

	public static void main(String[] args) {
		int i ;
		
		for( i=1 ; i<=6 ; i++ ) {
			System.out.println("Claquez dans les mains pour la "+i+"ème fois");	
			
			String phrase = String.format("Claquez dans les mains pour la %d ème fois !", i);
			System.out.println(phrase);	
			
			}
		
		System.out.println("Je suis sorti(e)");
	} 
}