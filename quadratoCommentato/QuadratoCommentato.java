package quadratoCommentato;

import java.util.Scanner;

public class QuadratoCommentato {

	//Attributi -----------------
	
	private int lato;	//lato del quadrato
	
	//Metodi    -----------------

	//metodo COSTRUTTORE
	//inizializzare gli attributi dell'oggetto
	//Ha valori di default
	//NO INPUT
	//-------
	//Stesso nome della classe
	//Davanti al nome non c'è nulla (no void)
	//costruttore di default
	public QuadratoCommentato(){
		lato = 0;
	}
	
	//costruttore con un parametro
	//parametro int l = variabile locale
	//"vive" solo nel metodo
	public QuadratoCommentato(int lato){
		this.lato = lato;
	}
	
	public void inserimento() {
		Scanner KB = new Scanner(System.in);
		int l;
		
		do {
			System.out.println("Inserisci il lato del quadrato");
			l = KB.nextInt();
		}while(l<=0);
		setLato(l);
	}
	
	public void setLato(int lato) {
		if (lato>0)
			this.lato = lato;
		else 
			this.lato = 0;
	}
	
	public int getLato() {
		return lato;
	}
	
	public int getPerimetro() {
		int p = lato*4;
		return p;
	}
	
	public int getArea() {
		int area=lato*lato;
		return area;
	}
	
	public String toString() {
		String s= "Quadrato -> Lato= " + getLato() + " Perimetro= " + getPerimetro() + " Area= " + getArea();
		return s;
	}

}
