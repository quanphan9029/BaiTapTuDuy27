package com.company;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String chuoiKytu;
        int ascii;
        char kyTu;

        System.out.print("Nhập chuỗi không quá 6 ký tự. Và không có khoảng trắng: ");
        chuoiKytu = sc.nextLine();

        while (chuoiKytu.length() > 6 || chuoiKytu.length() <= 0) {
            System.out.println("Chuỗi ký tự không hợp lệ.");
            System.out.print("Mời nhập lại: ");
            chuoiKytu = sc.nextLine();
        }

        for (int i = 0; i < chuoiKytu.length(); i++) {
            if ((int) chuoiKytu.charAt(i) < 97) {
                ascii = (int) chuoiKytu.charAt(i);
                ascii += 32;
                kyTu = (char) ascii;
                System.out.print(kyTu);
            }
            else {
                kyTu = chuoiKytu.charAt(i);
                System.out.print(kyTu);
            }
        }

        //chuoiKytu.charAt(0);
        //ascii = chuoiKytu.charAt(0);
        //System.out.println(ascii);
    }
}
