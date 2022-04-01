package com.example.demo;

public class Limits {
	
	private int min;
	private int max;
	public Limits() {
		
	}
	
	public Limits(int minimum, int maximum) {
		super();
		this.min = minimum;
		this.max = maximum;
	}

	public int getMinimum() {
		return min;
	}
	public void setMinimum(int min) {
		this.min = min;
	}
	public int getMaximum() {
		return max;
	}
	public void setMaximum(int max) {
		this.max = max;
	}
	
	

}
