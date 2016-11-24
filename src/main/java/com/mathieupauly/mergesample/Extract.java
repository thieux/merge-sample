package com.mathieupauly.mergesample;

public class Extract {
    public void justDoIt(int n) {
        int value = compute(n);
        System.out.println(value);
    }

    private int compute(int n) {
        return (n * 2) + 1;
    }
}
