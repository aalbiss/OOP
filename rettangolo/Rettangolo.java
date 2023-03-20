package rettangolo;

import java.util.Scanner;

public class Rettangolo {

	private int base;
	private int altezza;

	public Rettangolo(){
		base=0;
		altezza=0;
	}

	public Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}

	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		int b;
		int a;

		do {
			System.out.println("Inserisci la base del rettangolo");
			b = KB.nextInt();
		}while(b<=0);
		setBase(b);

		do {
			System.out.println("Inserisci l'altezza del rettangolo");
			a = KB.nextInt();
		}while(a<=0);
		setAltezza(a);
	}

	public void setBase(int base) {
		if (base>0)
			this.base = base;
		else 
			this.base = 0;
	}

	public int getBase() {
		return base;
	}

	public void setAltezza(int altezza) {
		if (altezza>0)
			this.altezza = altezza;
		else 
			this.altezza = 0;
	}

	public int getAltezza() {
		return altezza;
	}
	
	public int getPerimetro() {
		int p = (base+altezza)*2;
		return p;
	}

	public int getArea() {
		int area=base*altezza;
		return area;
	}

	public String toString() {
		String s= "Rettangolo -> Base=" + getBase()+ " Altezza=" + getAltezza() + " Perimetro=" + getPerimetro() + " Area=" + getArea(); 
		return s;
	}
	
}

