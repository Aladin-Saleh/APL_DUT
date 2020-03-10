import java.util.Arrays;


public class Tri {

	public static void main(String[] args) {
		int i = 0;
		int n = 0;
		int[] tab = null;
		tab = new int[args.length];



		for (i = 0; i < args.length ;i++ ) {
			n = Integer.parseInt(args[i]);
			
			tab[i] = n;

			System.out.print(tab[i]+ "   	");

			
		}

		System.out.println(" ");
		
		Arrays.sort(tab);

		for (i = 0 ;i < args.length ;i++ ) {
			System.out.print(tab[i]+ "   	");

		}

		
		System.out.println(" ");

	}


}