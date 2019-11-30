package com.company;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Đầu vào
        Scanner sc = new Scanner(System.in);

        float a,b,c,a2,b2,c2;

        System.out.print("Nhập cạnh a: ");
        a = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập cạnh b: ");
        b = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập cạnh c: ");
        c = Float.parseFloat(sc.nextLine());


        // Kiểm tra các cạnh có hợp lệ ( > 0)
        while (a <= 0 || b <= 0 || c <= 0) {
            if (a <= 0) {
                System.out.print("Nhập lại cạnh a: ");
                a = Float.parseFloat(sc.nextLine());
            }
            if (b <= 0) {
                System.out.print("Nhập lại cạnh b: ");
                b = Float.parseFloat(sc.nextLine());
            }
            if (c <= 0) {
                System.out.print("Nhập lại cạnh c: ");
                c = Float.parseFloat(sc.nextLine());
            }
        }
        // Gán a2 b2 c2
        a2 = (float) Math.pow(a,2);
        b2 = (float) Math.pow(b,2);
        c2 = (float) Math.pow(c,2);

        // Kiểm tra tam giác
        if ((a + b > c) && a - b < c) {
            if (a == b || a == c || b == c) {
                if (a == b && b == c) {
                    System.out.println("3 cạnh a, b, c tạo thành tam giác Đều.");
                }
                else {
                    System.out.println("3 cạnh a, b, c tạo thành tam giác Cân.");
                }
            }
            else if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                if (a == b || a == c || b == c) {
                    System.out.println("3 cạnh a, b, c tạo thành tạm giác Vuông Cân.");
                }
                else {
                    System.out.println("3 cạnh a, b, c tạo thành tam giác Vuông.");
                }
            }
            else {
                System.out.println("3 cạnh a, b, c tạo thành tam giác thường.");
            }

        }
        else if (a + c > b && a - c < b) {
            if (a == b || a == c || b == c) {
                if (a == b && b == c) {
                    System.out.println("3 cạnh a, b, c tạo thành tam giác Đều.");
                }
                else {
                    System.out.println("3 cạnh a, b, c tạo thành tam giác Cân.");
                }
            }
            else if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                if (a == b || a == c || b == c) {
                    System.out.println("3 cạnh a, b, c tạo thành tạm giác Vuông Cân.");
                }
                else {
                    System.out.println("3 cạnh a, b, c tạo thành tam giác Vuông.");
                }
            }
            else {
                System.out.println("3 cạnh a, b, c tạo thành tam giác thường.");
            }

        }
        else if (b + c > a && b - c < a) {
            if (a == b || a == c || b == c) {
                if (a == b && b == c) {
                    System.out.println("3 cạnh a, b, c tạo thành tam giác Đều.");
                }
                else {
                    System.out.println("3 cạnh a, b, c tạo thành tam giác Cân.");
                }
            }
            else if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                if (a == b || a == c || b == c) {
                    System.out.println("3 cạnh a, b, c tạo thành tạm giác Vuông Cân.");
                }
                else {
                    System.out.println("3 cạnh a, b, c tạo thành tam giác Vuông.");
                }
            }
            else {
                System.out.println("3 cạnh a, b, c tạo thành tam giác thường.");
            }
        }
        else {
            System.out.println("3 cạnh a,b,c không tạo thành tam giác.");
        }
    }
}
