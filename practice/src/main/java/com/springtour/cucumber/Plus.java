package com.springtour.cucumber;

public class Plus {
	private int parameterOne;
	private int parameterTwo;
	
	public Plus (int parameterOne,int parameterTwo){
		this.parameterOne = parameterOne;
		this.parameterTwo = parameterTwo;
	}
	
	public int plus(){
		return this.parameterOne+this.parameterTwo;
	}
}
