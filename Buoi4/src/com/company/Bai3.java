package com.company;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soNguyen = 1, sum = 0;
        while (soNguyen != 0) {
            System.out.println("Mời nhập số nguyên khác 0: ");
            soNguyen = Integer.parseInt(sc.nextLine());
            if (soNguyen % 2 == 0) {
                sum += soNguyen;
            }
        }
        System.out.println("Tổng = " + sum);
    }
}
