package com.company;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double heso_a, heso_b, heso_c, delta, nghiem1, nghiem2, nghiem;

        System.out.print("Nhập hệ số a: ");
        heso_a = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập hệ số b: ");
        heso_b = Double.parseDouble(sc.nextLine());
        System.out.print("Nhập hệ số c: ");
        heso_c = Double.parseDouble(sc.nextLine());


        // Kiểm tra hệ số a phải khác 0
        while (heso_a == 0) {
            System.out.println("Hệ số a phải khác 0 mời nhập lại.");
            System.out.print("Hệ số a: ");
            heso_a = Double.parseDouble(sc.nextLine());
        }

        // Kiểm tra trường hợp đặc biệt
        if ((heso_a + heso_b + heso_c) == 0) {
            nghiem1 = 1;
            nghiem2 = heso_c / heso_a;
        }
        if ((heso_a - heso_b + heso_c) == 0) {
            nghiem1 = -1;
            nghiem2 = -heso_c / heso_a;
        }

        // Xử lý
        delta = heso_b * heso_b - (4 * heso_a * heso_c);
        nghiem = -heso_b / (2 * heso_a);
        nghiem1 = (-heso_b + Math.sqrt(delta))/(2 * heso_a);
        nghiem2 = (-heso_b - Math.sqrt(delta))/(2 * heso_a);

        // Kiểm tra các trường hợp của delta và giải

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        }
        else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm kép.");
            System.out.println("x1 = x2 = " + nghiem);
        }
        else {
            System.out.println("Phương trình có 2 nghiêm phân biệt.");
            System.out.println("x1 = " + nghiem1);
            System.out.println("x2 = " + nghiem2);
        }


    }
}
