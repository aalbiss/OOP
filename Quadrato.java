package quadrato;

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
	Quadrato(){			//overloading dei metodi, possibilità di scrivere dei metodi con lo stesso nome
		lato = 0;
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
	
	int perimetro() {
		int p;
		p=lato*4;
		return p;
	}
	
	int area() {
		return lato*lato;
	}
	

	public static void main(String[] args) {
		
		Quadrato q1 = new Quadrato(8);	//costruttore
		q1.visualizza();

		Quadrato q2 = new Quadrato(10);	//costruttore
		q2.visualizza();

		System.out.println("--------------------------------------------------------");
		
		System.out.println("Il perimetro del quadrato con lato 8 è " + q1.perimetro());
		
		System.out.println("Il perimetro del quadrato con lato 10 è " + q2.perimetro());
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("L'area del quadrato con lato 8 è " + q1.area());

		System.out.println("L'area del quadrato con lato 10 è " + q2.area());
		//		Quadrato q;		//Dichiarazione del quadrato q
		//		q = new Quadrato();		//Riservare memoria


		//		Quadrato q1 = new Quadrato();
		//		q1.lato=5;
		//		System.out.println("lato **** " + q1.lato);
		//		q1.visualizza();

		//		Quadrato q2 = new Quadrato();
		//		q2.lato=55;
		//		System.out.println("lato **** " + q2.lato);
		//		q2.visualizza();


	}


}