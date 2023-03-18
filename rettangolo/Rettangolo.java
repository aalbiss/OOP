package rettangolo;

import java.util.Scanner;

public class Rettangolo {

	int base;
	int altezza;

	Rettangolo(){
		base=0;
		altezza=0;
	}

	Rettangolo(int b, int a){
		base = b;
		altezza = a;
	}

	int perimetro() {
		int p = (base+altezza)*2;
		return p;
	}

	int area() {
		int area=base*altezza;
		return area;
	}
	
	void inserimento() {
		Scanner KB = new Scanner(System.in);
		System.out.println("Inserisci la base del rettangolo");
		base = KB.nextInt();
		System.out.println("Inserisci l'altezza del rettangolo");
		altezza = KB.nextInt();
	}

}
