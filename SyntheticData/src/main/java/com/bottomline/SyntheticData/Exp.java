package com.bottomline.SyntheticData;

/**
 * @author ethan.seal
 * This class handles all exponential functions in the form y = <base>^x
 */

public class Exp {
	private double base;
	private double val;
	private boolean compute;
	
	public Exp(double base) {
		this.base = base;
	}

	//gets the previously computed value
	public double getVal(double x) {
		if (!this.compute) {
			this.val = compute(x);
		}
		return this.val;
	}
	
	
	//computes the value of the function for a given x
	private double compute(double x) {
		this.compute = true;
		return Math.pow(this.base, x);
	}
}
