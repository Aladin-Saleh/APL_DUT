public class Date {
	int jour;
	int mois;
	int annee;


	public Date() {
		this.jour = 30;
		this.mois = 01;
		this.annee = 2020;
	}

	



	public String toString(){
		return(this.jour+"-"+this.mois+"-"+this.annee);

	}
	public static void main(String[] args) {
		Date c = new Date();
		System.out.println("Date du jour : " + c);
	
	

}
}