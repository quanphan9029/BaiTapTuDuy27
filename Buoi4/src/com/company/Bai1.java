package com.company;

import java.util.spi.AbstractResourceBundleProvider;

public class Bai1 {
    public static void main(String[] args) {
        final int hangSo = 5000;
        int n = 1, sum = 0;

        do {
            sum += n;
            if (sum > hangSo) {
                break;
            }
            n++;
        } while (true);
        System.out.println("N = " + n);
    }
}
