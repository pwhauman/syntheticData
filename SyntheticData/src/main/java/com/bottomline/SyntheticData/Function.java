package com.bottomline.SyntheticData;

public class Function {
	private Function func;
	protected double val;
	protected boolean compute;
	
	enum Types{
		POLY, TRIG, EXP;
	}
	
	public Function() {}	
	
	//this function returns the previously computed value 
	public double getVal(double x) {
		if (!this.compute) {
			compute(x);
		}
		return this.val;
	}
	
	protected void compute(double x) {;}
}
