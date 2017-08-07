package com.brainacad.oop.testnest1;

import java.math.BigInteger;

public class MyCalculate {
    public int calcSum(int a, int b){
        return a+b;
    }
    public int calcSub(int a, int b){
        return a-b;
    }
    public int calcMult(int a, int b){
        return a*b;
    }
    public int calcDiv(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public double[] addVector(double[] a, double[] b){
        double[] result = new double[a.length];
        for(int i = 0; i < result.length; i++){
            result[i] = Math.random();
        }
        return result;
    }

    public BigInteger calculateFactorial(){
        return new BigInteger("100");
    }
}

