/* 
 * @author Ethan Seal
 * @author Peter Hauman
 * 
 * This class creates a column of data when given a function or distribution
 */

package com.bottomline.SyntheticData;
import org.apache.commons.math3.distribution.NormalDistribution;
import java.util.ArrayList;

public class Column {
	private static long numRows = 0;
	private String colName;
	private ArrayList<Double> columnData = new ArrayList<Double>(); 
	private Function func = null;
	private GaussDist dist = null;
	
	public Column(Function func) {
		this("", func);
	}

	public Column(GaussDist dist) {
		this("", dist);
	}
	
	public Column(String colName, Function func) {
		if (colName.equals("")) {
			//colName = "" + Data.getNumCols();
		}
		this.colName = colName;
		this.func = func;
	}
	
	public Column(String colName, GaussDist dist) {
		if (colName.equals("")) {
			//colName = "" + Data.getNumCols();
		}
		this.colName = colName;
		this.dist = dist;
		for(int i = 0; i < numRows; i++) {
			columnData.add(dist.generateSample());
		}
	}
	
	/*
	 * Constructs a column from a number of rows and a function
	 * @param numRows - the number of rows to be generated
	 * @param dist - a GaussDist object
	 */
	public static Column newColFromFunc(Column baseCol, String colName, Function func) {
		Column newColumn = new Column(colName, func);
		ArrayList<Double> baseColData = baseCol.getColumnData();
		for(int i = 0; i < numRows; i++) {
			double value = baseColData.get(i).doubleValue();
			value = func.compute(value);
			newColumn.columnData.add(new Double(value));
		}
		return newColumn;
	}
	
	public ArrayList<Double> getColumnData() {
		return this.columnData;
	}
	
	public static void setNumRows(long num) {
		numRows = num;
	}
	
	@Override
	public String toString() {
		String str = colName + " :";
		for(int i = 0; i < numRows; i++) {
			str = str + ", " + columnData.get(i).toString();
		}
		return str;
	}
	
	public void print() {
		System.out.println(toString());
	}
	
//	public static void main(String[] args) {
//		System.out.println("NUM ROWS: " + numRows);
//		GaussDist gd = new GaussDist(0,1);
//		Column c = new Column("col1", gd);
//		Poly p = new Poly(2, 1);
//		Column d = newColFromFunc(c, "col2", p);
//		c.print();
//		d.print();
//	}
}


