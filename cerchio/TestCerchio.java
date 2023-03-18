package cerchio;

public class TestCerchio {
	
	public static void main(String[] args) {

		Cerchio r = new Cerchio();
//		r.inserimento();
		
//		r.raggio = -7; //NON SI PUO' --> LATO E' PRIVATE
		r.setRaggio(7);
		System.out.println("Raggio = " + r.getRaggio());
		
		System.out.println("La circonferenza e' " + r.circonferenza());
		System.out.println("L'area e' " + r.area());

	}
}
