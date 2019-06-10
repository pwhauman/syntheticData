/* 
 * @author Ethan Seal
 * @author Peter Hauman
 * 
 * This class creates a column of data when given a function or distribution
 */

package com.bottomline.SyntheticData;
import org.apache.commons.math3.distribution.NormalDistribution;

public class Column {
	private int numRows;
	private double column[];
	private Function func;
	private GaussDist dist;
	
	
	/*
	 * Constructs a column from a number of rows and a function
	 * @param numRows - the number of rows to be generated
	 * @param func - a Function object
	 */
	public Column(int numRows, Function func) {
		this.numRows = numRows;
		this.column = new double[numRows];
		this.func = func;
		this.genFuncColumn();
	
	}

	/*
	 * Constructs a column from a number of rows and a function
	 * @param numRows - the number of rows to be generated
	 * @param dist - a GaussDist object
	 */
	public Column(int numRows, GaussDist dist) {
		this.numRows = numRows;
		this.column = new double[numRows];
		this.dist = dist;
		this.genDistColumn();
	
	}
	
	public void genFuncColumn() {
		for (int i = 0; i < numRows; i++) {
			this.column[i] = this.func.getVal(i);
		}	
	}
	
	public double[] genDistColumn() {
		GaussDist dist = new GaussDist(1, 2);
		return dist.generateSample(numRows);
	}
	
	public double[] getColumn() {
		return this.column;
	}
}


