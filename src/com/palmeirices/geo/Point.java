package com.palmeirices.geo;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() { return x; }
	public int getY() { return y; }
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	public Point add(Point other){
		//Point result = new Point(this.x + other.x, this.y + other.y); Forma base
		//return result;
		return new Point(this.x + other.x, this.y + other.y);
	}
}
