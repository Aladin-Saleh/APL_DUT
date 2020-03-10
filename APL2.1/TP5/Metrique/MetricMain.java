public class MetricMain {
	public static void main(String[] args) {
		double marge = 15;

		Metrique page = new Metrique();
		page.setImageableArea(marge,marge,297,210);


			System.out.println(page.getHeight());

	}
}