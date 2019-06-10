package com.bottomline.SyntheticData;

public class Function {
	private Function func;
	
	enum Types{
		POLY, TRIG, EXP;
	}
	
	public Function() {}	
	
	//this function returns the previously computed value 
//	public double getVal(double x) {
//		compute(x);
//		return this.val;
//	}
	
	protected double compute(double x) {
		return 0;
	}
}
