package com.palmeirices.geo;

public class Main {
	public static void main(String[] args) {
		Point p = new Point(234,56);
		Point x = new Point(32,11);
		System.out.println(p); //imprime o ponto P
		Point q = new Point(-1,5);
		System.out.println(q);
		Point s = p.add(q); //imprime a adição
		System.out.println(s);
		Point g = p.subtract(q);
		System.out.println(g); //imprime a subtração
		Map one = new Map(5,5);
		Point j = p.multiply(x);
		System.out.println(j); //imprime a multiplicação
		Point f = p.divide(x);
		System.out.println(f); //imprime a multiplicação em função da divisao
//		System.out.print(one.size(one));
	}
}
