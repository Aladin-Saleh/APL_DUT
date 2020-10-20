import java.util.*;

public class main 
{


	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(args));
		Object[] copy = Arrays.copyOf(args, 5); 

		 for (int i = 0; i < copy.length; i++)  
           System.out.println(copy[i] + " "); 
    




	}
}