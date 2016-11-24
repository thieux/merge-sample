package com.mathieupauly.mergesample;

import java.io.PrintStream;

public class Extract {
    public void justDoIt(int n, PrintStream out) {
        int value = compute(n);
        out.format("Result: %d.", value);
    }

    private int compute(int n) {
        return n * 2;
    }
}
