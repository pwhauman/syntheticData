package com.bottomline.SyntheticData;

/**
 * @author ethan.seal
 * This class handles all polynomial functions in the form y = <coeff>x^<exp>
 */

public class Poly {
	private double exp;
	private double coeff;
	private double val;
	private boolean compute;
	
	public Poly(double coeff, double exp) {
		this.coeff = coeff;
		this.exp = exp;
	}
	
	//this function returns the previously computed value 
	public double getVal(double x) {
		if (!this.compute) {
			this.val = compute(x);
		}
		return this.val;
	}
	
	//computes the value of the function for a given x
	private double compute(double x) {
		this.compute = true;
		this.val = (this.coeff * Math.pow(x, this.exp));
		return this.val;
	}
}

