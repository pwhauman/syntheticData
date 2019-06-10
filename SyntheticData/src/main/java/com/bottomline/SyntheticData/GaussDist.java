package com.bottomline.SyntheticData;

import org.apache.commons.math3.distribution.NormalDistribution;

/*
 * 
 * 
 * 
 * 
 * THIS CLASS MAY BE DELETED, MAKE SURE WE NEED IT BEFORE EDITING
 * 
 * 
 * 
 * 
 */

public class GaussDist {
    private double mean;
    private double standarDev;
    private NormalDistribution gaussDist;


    public GaussDist(double mean, double standarDev) {
        this.mean = mean;
        this.standarDev = standarDev;
        gaussDist = new NormalDistribution(mean, standarDev);
    }

    public double generateSample() {
        return gaussDist.sample();
    }

    public double[] generateSample(int sampleSize) {
        double[] sample = new double[sampleSize];
        for (int i = 0; i < sampleSize; i++) {
            sample[i] = generateSample();
        }
        return sample;
    }
}