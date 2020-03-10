public class Moyenne{

private double Somme = 0;
private double indice = 0;

	

	public void add(int note){

		Somme += (double) note;
		indice++;
		
	}

	public void add(float note){

		Somme += (double) note;
		indice++;
	}

	public void add(double note){

		Somme += note;
		indice++;
	}

	public void add(long note){

		Somme += (double) note;
		indice++;
	}

	public void add(byte note){

		Somme += (double) note;
		indice++;
	}

	public void add(short note){

		Somme += (double) note;
		indice++;
	}

	public double getAverage(){
		
		
		return Somme/indice;
	}




}