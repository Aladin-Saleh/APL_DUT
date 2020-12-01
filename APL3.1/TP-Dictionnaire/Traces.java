import java.util.Map;
import java.util.Set;

public class Traces  {
    

    public static void main(String[] args) {

        Map<Thread, StackTraceElement[]> threads = Thread.getAllStackTraces();
        Set<Thread> trd = threads.keySet();
        Thread[] threadArray = trd.toArray(new Thread[trd.size()]);
        StackTraceElement[] ste;
        

       
        
        for(int i = 0;i < threadArray.length;i++)
        {
            ste = threads.get(threadArray[i]);
            System.out.println(threadArray[i].getName()+"\n");
            for(int j = 0; j < ste.length;j++)
            {
                System.out.println(ste[j].toString());
            }
        }


       
      

    }




}
