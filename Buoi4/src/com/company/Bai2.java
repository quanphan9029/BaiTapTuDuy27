package com.company;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soNguyen = 1, sum = 0;
        do {
            System.out.println("Mời nhập số nguyên: ");
            soNguyen = Integer.parseInt(sc.nextLine());
            sum+=soNguyen;
        } while (soNguyen != 0);
        System.out.println("Tổng = " + sum);
    }
}
