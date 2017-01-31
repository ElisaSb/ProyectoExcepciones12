package Teoria;

import java.util.Scanner;

public class TestTriangulo {

	public static void main(String[] args) {
		System.out.println("Introduce los lados del triángulo");
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		try {
			Triangulo t = new Triangulo(a, b, c);
			System.out.println(t);
		} catch (IlegalTrianguloExcepcion e) {
			System.out.println("Triángulo no válido");
		} finally {
			in.close();
		}
	}

}
