public class Main {

	public static void main(String[] args) {
		Moyenne myn = new Moyenne();

		myn.add(18);
		myn.add(3.5);
		myn.add(12.5);
		myn.add(15);

		System.out.println(myn.getAverage());


	}
}