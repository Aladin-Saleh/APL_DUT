import java.util.LinkedList;
import java.util.List;

public class Verification {
    
    public static void isNegative(float reel)
    {
        if (reel < 0) {
            System.out.println(reel + " est négatif !");
        }
       
    }


    public static void main(String[] args) {
        List<Float> reel = new LinkedList<Float>();


        for (int i = 0; i < args.length; i++) {
            reel.add(Float.parseFloat(args[i]));
        }

        reel.forEach(r ->isNegative(r));
    }
}
