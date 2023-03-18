package quadrato;

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

	public static void main(String[] args) {

		Rettangolo r = new Rettangolo(10, 5);

		System.out.println(r.perimetro());
		System.out.println(r.area());


	}

}
