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
        super.compute = false;
    }

    /**
     * 
     * @param x the variable
     * @return the value of the trig function
     */
    protected void compute(double x) {
        switch(type) {
            case SIN:
                super.val = coeff * Math.sin(x);
            case COS:
            	super.val = coeff * Math.cos(x);
            case TAN:
            	super.val = coeff * Math.tan(x);
            case CSC:
                x = 1.0 / Math.sin(x);
                super.val = coeff * x;
            case SEC:
                x = 1.0 / Math.cos(x);
                super.val = coeff * x;
            case COT:
                x = 1.0 / Math.tan(x);
                super.val = coeff * x;
            case ARCSIN:
            	super.val = Math.asin(x);
            case ARCCOS:
            	super.val = Math.acos(x);
            case ARCTAN:
            	super.val = Math.atan(x);
            case ARCCSC:
                x = 1.0 / x;
                x = 1.0 / Math.sin(x);
                super.val = coeff * x;
            case ARCSEC:
                x = 1.0 / x;
                x = 1.0 / Math.cos(x);
                super.val = coeff * x;
            case ARCCOT:
                x = 1.0 / x;
                x = 1.0 / Math.tan(x);
                super.val = coeff * x;
        }
    }
}
