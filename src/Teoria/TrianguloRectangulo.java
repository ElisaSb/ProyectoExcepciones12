package Teoria;

public class TrianguloRectangulo {
	//atributos: dos catetos y la hipotenusa
	private double cateto1;
	private double cateto2;
	private double hipotenusa;
	//constuctor
	public TrianguloRectangulo(double cateto1, double cateto2, double hipotenusa) throws TrianguloRectanguloException {
		//llamamos a un m�todo que nos diga si cumple el teorema de pit�gora.
		//si lo cumple, inicializamos los atributos:
		if (Math.pow(cateto1,2) + Math.pow(cateto2,2) == Math.pow(hipotenusa, 2)) {
			this.cateto1 = cateto1;
			this.cateto2 = cateto2;
			this.hipotenusa = hipotenusa;
		}
		//en caso contrario lanzamos la excepcion
		//TrianguloRect�nguloException
		else {
			throw new TrianguloRectanguloException();
		}
	}
	//toString
	@Override
	public String toString() {
		return "TrianguloRectangulo [cateto1=" + cateto1 + ", cateto2=" + cateto2 + ", hipotenusa=" + hipotenusa + "]";
	}	
}
