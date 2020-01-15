package com.palmeirices.geo;

public class Main {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		System.out.print(p);
		Point q = new Point(3,5);
		Point s = p.add(q);
		System.out.print(s);
		"add"
	}
}