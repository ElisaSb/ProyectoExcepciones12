package Teoria;

import java.util.Scanner;

public class TestTrianguloRectangulo {

	public static void main(String[] args) {
		System.out.println("Introduce los lados del " + "triángulo rectángulo en el orden catetos " + "y posteriormente la hipotenusa");
		Scanner in = new Scanner(System.in);
		double cateto1 = in.nextDouble();
		double cateto2 = in.nextDouble();
		double hipotenusa = in.nextDouble();
		try {
			TrianguloRectangulo t = new TrianguloRectangulo(cateto1, cateto2, hipotenusa);
			System.out.println(t);
		} catch (TrianguloRectanguloException e) {
			System.out.println("Eso no es un triángulo rectángulo");
		} finally {
			in.close();
		}
	}

}
