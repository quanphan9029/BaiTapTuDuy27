package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        n = Integer.parseInt(sc.nextLine());
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.println(sum);
    }
}
