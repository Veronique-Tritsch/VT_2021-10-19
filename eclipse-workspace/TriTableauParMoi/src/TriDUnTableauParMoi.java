
public class TriDUnTableauParMoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] tableau = {25,20,15,10,5};

		for (int i = 0 ; i< tableau.length ; i++)
		{

			for (int j = i+1 ; j < tableau.length ; j++)
			{ 
				if (tableau[i]>tableau[j])
				{
					int temp ;

					temp = tableau[j];
					tableau[j] = tableau[i];
					tableau[i] = temp ;
				}
			}
		}
	}
}


