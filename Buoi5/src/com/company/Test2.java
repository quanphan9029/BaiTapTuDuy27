package com.company;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        a = Double.parseDouble(sc.nextLine());

        if (a/(int) a == 1) {
            System.out.println(a + " là số nguyên.");
        }
        else {
            System.out.println(a + " không phải là số nguyên.");
        }
    }
}
