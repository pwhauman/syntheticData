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
	
	@Override
	protected double compute(double x) {
		return (this.coeff * Math.pow(x, this.exp));
	}
}

