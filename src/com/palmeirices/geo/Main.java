package com.palmeirices.geo;

public class Main {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		System.out.println(p);
		Point q = new Point(-1,5);
		System.out.println(q);
		Point s = p.add(q);
		System.out.println(s);
		Point g = p.subtract(q);
		System.out.println(g);
		Map one = new Map(5,5);
//		System.out.print(one.size(one));
	}
}
