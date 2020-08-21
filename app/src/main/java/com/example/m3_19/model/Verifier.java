package com.example.m3_19.model;

public class Verifier implements IVerifier{

    public static final int MIN_LENGTH = 5;
    public static final int WEAT = -1;
    public static final int MEDIUM = -2;
    public static final int STRONG = -3;
    public int evaluatePass(String password){
        if(!evaluateLength(password)) return WEAT;
        if(!evaluateUpper(password)) return MEDIUM;
        return STRONG;
    }

    @Override
    public boolean evaluateLength(String password) {

        return password.length() > MIN_LENGTH;
    }

    @Override
    public boolean evaluateUpper(String password) {
        return !password.toLowerCase().equals(password);
    }
}
