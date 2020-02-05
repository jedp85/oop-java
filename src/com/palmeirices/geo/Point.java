package com.palmeirices.geo;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() { return x; }
	public int getY() { return y; }

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
}

//Cenas para fazer depois....

// multiplicacao e divisao de pontos, div usa a mult
