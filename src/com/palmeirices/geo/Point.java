package com.palmeirices.geo;

public class Point {
	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() { return x; }
	public double getY() { return y; }

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	public Point add(Point other){
		//Point result = new Point(this.x + other.x, this.y + other.y); Esta será a forma mais usal de descrever o metodo add
		//return result; adicionando no fim o result ao return
		return new Point(this.x + other.x, this.y + other.y); //Esta é a forma resumida de escrever
	}

	public Point subtract(Point other) {
		//return new Point(this.x - other.x, this.y - other.y);
		Point negativeOther = new Point(- other.x, - other.y);
		return add(negativeOther);
		//this.add(negativeOther); outra forma de escrever a parte de cima
	}

	public Point multiply(Point other) {
		return new Point(this.x * other.x, this.y * other.y); //multiplica
	}

	public Point divide(Point other) {
		Point invertDivision = new Point( 1/other.x, 1/other.y);
		return multiply(invertDivision);
	}
}

//Cenas para fazer depois....
// multiplicacao e divisao de pontos, div usa a mult
