/**
 * @author Peter Hauman
 * 
 * This class is used to compute trig functions for a variable x.
 */

package com.bottomline.SyntheticData;

import java.lang.Math;

public class Trig extends Function{
    public Type type;
    private double coeff;

    enum Type {
        SIN, COS, TAN, CSC, SEC, COT, ARCSIN, ARCCOS, ARCTAN, ARCCSC, ARCSEC, ARCCOT;
    }

    public Trig(Type type, double coeff) {
    	super();
    	this.type = type;
        this.coeff = coeff;
    }

    /**
     * 
     * @param x the variable
     * @return the value of the trig function
     */
    protected double compute(double x) {
        switch(type) {
            case SIN:
                return coeff * Math.sin(x);
            case COS:
            	return coeff * Math.cos(x);
            case TAN:
            	return coeff * Math.tan(x);
            case CSC:
                x = 1.0 / Math.sin(x);
                return coeff * x;
            case SEC:
                x = 1.0 / Math.cos(x);
                return coeff * x;
            case COT:
                x = 1.0 / Math.tan(x);
                return coeff * x;
            case ARCSIN:
            	return Math.asin(x);
            case ARCCOS:
            	return Math.acos(x);
            case ARCTAN:
            	return Math.atan(x);
            case ARCCSC:
                x = 1.0 / x;
                x = 1.0 / Math.sin(x);
                return coeff * x;
            case ARCSEC:
                x = 1.0 / x;
                x = 1.0 / Math.cos(x);
                return coeff * x;
            case ARCCOT:
                x = 1.0 / x;
                x = 1.0 / Math.tan(x);
                return coeff * x;
        }
        return 0;
    }
}
