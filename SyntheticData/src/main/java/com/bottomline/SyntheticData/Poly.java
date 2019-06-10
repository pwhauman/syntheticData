package com.bottomline.SyntheticData;

/**
 * @author ethan.seal
 * This class handles all polynomial functions in the form y = <coeff>x^<exp>
 */

public class Poly extends Function {
	private double exp;
	private double coeff;
	
	public Poly(double coeff, double exp) {
		super();
		this.coeff = coeff;
		this.exp = exp;
	}
	
	//computes the value of the function for a given x
	@Override
	protected void compute(double x) {
		super.compute = true;
		super.val = (this.coeff * Math.pow(x, this.exp));
	}
}

