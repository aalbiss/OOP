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
	
	

	
	public static void main(String[] args) {
		
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
		
		Quadrato q1 = new Quadrato();	//costruttore
		q1.visualizza();
		
		
		Quadrato q2 = new Quadrato(7);	//costruttore
		q2.visualizza();
		
		
		
		
		
		
		
		
		
		
	}

}
