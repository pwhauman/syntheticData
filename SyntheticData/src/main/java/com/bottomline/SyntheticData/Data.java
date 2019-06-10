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
	}
}
