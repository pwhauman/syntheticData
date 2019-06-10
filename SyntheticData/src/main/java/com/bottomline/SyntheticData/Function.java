package com.bottomline.SyntheticData;

public class Function extends Column {
	
	enum Types{
		POLY, TRIG, EXP;
	}
	
	public Function(Types type) {
		if (type == POLY) {
			this.func = Poly();
		}
	}	
}
