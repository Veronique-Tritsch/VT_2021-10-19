
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] t = {55,5,1,558,14,12};
		t = triTableau(t);
	}

	
	public static int[] triTableau(int[] t) {
		int n = t.length;
		int i=0;
		int aux = 0;
		boolean trie = true;
		while (trie) {
			trie = false;
			i = 0;
			while (i < n-1) {
				if (t[i] > t[i+1]) {
					trie = true;
					aux = t[i];
					t[i] = t[i+1];
					t[i+1] = aux;
				}
				i++;
			}
			n--;
		}
		return t;
	}
}
