package com.company;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soNguyen, giaiThua = 1;

        System.out.print("Nhập N để tính giai thừa của N: ");
        soNguyen = Integer.parseInt(sc.nextLine());


        if (soNguyen != 0) {
            while (soNguyen >= 1){
                giaiThua = giaiThua * soNguyen;
                soNguyen--;
            }
            System.out.println("Giai thừa = " + giaiThua);
        }
        else {
            System.out.println("Giai thừa của 0 = 1");
        }
    }
}
