package com.bottomline.SyntheticData;

import org.apache.commons.math3.distribution.CauchyDistribution;
import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.distribution.RealDistribution;



public class Distributions {
    private RealDistribution dist;
    
    public Distributions(DistType type) {
    	
    	switch(type) {
    		case CAUCHY:
    			this.dist = new CauchyDistribution();
    		case NORMAL:
    			this.dist = new NormalDistribution();
    	}
    }

    public double generateSample() {
        return dist.sample();
    }

    public double[] generateSample(int sampleSize) {
        double[] sample = new double[sampleSize];
        for (int i = 0; i < sampleSize; i++) {
            sample[i] = dist.sample();
        }
        return sample;
    }
}