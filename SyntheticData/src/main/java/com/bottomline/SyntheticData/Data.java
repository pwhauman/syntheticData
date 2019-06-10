package com.bottomline.SyntheticData;
import java.util.ArrayList;

public class Data {
	protected ArrayList<Column> data;
	private int numCols;
	
	public Data() {
		
	}
	
	public Column getCol(int idx) {
		return data.get(idx);
	}
	
	public int getNumcols() {
		return this.numCols;
	}
	public ArrayList<Column> getData() {
		return this.data;
	}
	
	public static void main(String[] args) {
//		Poly poly = new Poly(5, 2);
//		Column col = new Column(25, poly);
//		for (double val:col.getColumn()) {
//			System.out.println(val);
//		}
		
//		GaussDist gd = new GaussDist(0,1);
//		double[] sample = gd.generateSample(500);
//		for (double val:sample) {
//			System.out.println(val);
//		}
	}
}
