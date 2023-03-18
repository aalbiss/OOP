package quadrato;

import java.util.Scanner;

public class Quadrato {

	//Attributi -----------------
	
	int lato;	//lato del quadrato
	
	//Metodi    -----------------

	//metodo COSTRUTTORE
	//inizializzare gli attributi dell'oggetto
	//Ha valori di default
	//NO INPUT
	//-------
	//Stesso nome della classe
	//Davanti al nome non c'è nulla (no void)
	//costruttore di default
	Quadrato(){
		lato = 1;
	}
	
	//costruttore con un parametro
	//parametro int l = variabile locale
	//"vive" solo nel metodo
	Quadrato(int l){
		lato = l;
	}
	
	void visualizza() {
		System.out.println("Lato = " + lato);
	}
	
	void inserimento() {
		Scanner KB = new Scanner(System.in);
		System.out.println("Inserisci il lato del quadrato");
		lato = KB.nextInt();
	}

}
