package com.palmeirices.geo;

public class Map {
	private int width, lenght;

	public Map (int width, int length) {
		this.lenght = length;
		this.width = width;
	}

	public Map size(Map Size) {
		return Map (Size.lenght, Size.width);
	}
}
