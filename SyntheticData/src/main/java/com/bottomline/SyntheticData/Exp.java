package com.bottomline.SyntheticData;

/**
 * @author ethan.seal
 * This class handles all exponential functions in the form y = <base>^x
 */

public class Exp extends Function{
	private double base;
	
	public Exp(double base) {
		super();
		this.base = base;
	}

	//computes the value of the function for a given x
	protected double compute(double x) {
		return Math.pow(this.base, x);
	}
}
