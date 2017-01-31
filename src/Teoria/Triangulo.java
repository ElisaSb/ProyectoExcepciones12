package Teoria;

public class Triangulo {
	//atributos: dos catetos y la hipotenusa
	private double a;
	private double b;
	private double c;
	//constuctor
	public Triangulo(double a, double b, double c) throws IlegalTrianguloExcepcion {
		//llamamos a un método que nos diga si cumple el teorema de pitágora.
		//si lo cumple, inicializamos los atributos:
		if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		//en caso contrario lanzamos la excepcion
		//TrianguloRectánguloException
		else {
			throw new IlegalTrianguloExcepcion();
		}
	}
	//toString
	@Override
	public String toString() {
		return "Triangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}	
}
