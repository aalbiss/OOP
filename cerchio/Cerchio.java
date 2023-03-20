package cerchio;

import java.util.Scanner;

public class Cerchio {

	private int raggio;

	public Cerchio(){
		raggio = 0;
	}

	public Cerchio(int raggio){
		this.raggio = raggio;
	}

	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		int r;
		
		do {
			System.out.println("Inserisci il raggio del cerchio");
			r = KB.nextInt();
		}while(r<=0);	
		setRaggio(r);
	}
	
	public void setRaggio(int raggio) {
		if (raggio>0)
			this.raggio = raggio;
		else 
			this.raggio = 0;
	}
	
	public int getRaggio() {
		return raggio;
	}

	public double getCirconferenza() {
		double c = Math.PI*Math.pow(raggio, 2);
		return c;
	}

	public double getArea() {
		double area=2*Math.PI*raggio;
		return area;
	}

	public String toString() {
		String s = "Cerchio -> Raggio= " + getRaggio() + " Circonferenza= " + getCirconferenza() + " Area= " + getArea();
		return s;
	}
}