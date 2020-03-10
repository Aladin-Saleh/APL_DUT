import java.awt.print.Paper;


public class Metrique extends Paper {
		int height;


		public Metrique(){
			
			super();

		}

@Override
public double getHeight(){

	return height*0.352778;
}





}