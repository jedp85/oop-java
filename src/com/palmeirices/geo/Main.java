package com.palmeirices.geo;

public class Main {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		System.out.print(p);
		Point q = new Point(-1,5);
		Point s = p.add(q);
		System.out.print(s);

		Map one = new Map(5,5);
		System.out.print(one.size(one));
	}
}
