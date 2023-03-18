package cerchio;

import java.util.Scanner;

public class Cerchio {

	private int raggio;

	Cerchio(){
		raggio = 0;
	}

	Cerchio(int r){
		raggio = r;
	}

	double circonferenza() {
		double c = Math.PI*Math.pow(raggio, 2);
		return c;
	}

	double area() {
		double area=2*Math.PI*raggio;
		return area;
	}
	
	//metodi setter and getter
	// set -> memorizzare - salva un dato
	// get -> leggere	  - restituisce un dato
	
	public void setRaggio(int r) {
		if (r>0)
			raggio = r;
		else 
			raggio = 0;
	}
	
	public int getRaggio() {
		return raggio;
	}

	void inserimento() {
		Scanner KB = new Scanner(System.in);
		System.out.println("Inserisci il raggio del cerchio");
		raggio = KB.nextInt();
	}

}