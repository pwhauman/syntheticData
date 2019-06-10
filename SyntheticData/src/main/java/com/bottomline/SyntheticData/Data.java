package com.bottomline.SyntheticData;

public class Data {
	public Data() {
		
	}
	
	public static void main(String[] args) {
		Poly poly = new Poly(5, 2);
//		Column col = new Column(25, poly);
//		for (double val:col.getColumn()) {
//			System.out.println(val);
//		}
		
		GaussDist gd = new GaussDist(0,1);
		double[] sample = gd.generateSample(500);
		for (double val:sample) {
			System.out.println(val);
		}
	}
}
