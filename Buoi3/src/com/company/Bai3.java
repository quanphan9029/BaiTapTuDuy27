package com.company;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // Đầu vào
        Scanner sc = new Scanner(System.in);
        String nhapNgay, strThang, strNam;
        int ngay, thang, nam;
        System.out.println("Nhập ngày/tháng/năm: ");
        nhapNgay = sc.nextLine();

        while (nhapNgay.length() != 10) {
            System.out.print("Nhập lại ngày/tháng/năm theo định dạng dd/MM/yyyy: ");
            nhapNgay = sc.nextLine();
        }

        ngay = Integer.parseInt(nhapNgay.substring(0,2));
        thang = Integer.parseInt(nhapNgay.substring(3,5));
        nam = Integer.parseInt(nhapNgay.substring(nhapNgay.length() - 4));

        // Kiểm tra tháng > 12
        while (thang > 12) {
            System.out.println("Tháng nhập vào lớn 12. Nhập theo đúng định dạng dd/MM/yyyy.");
            System.out.print("Mời nhập lại: ");
            nhapNgay = sc.nextLine();

            ngay = Integer.parseInt(nhapNgay.substring(0,2));
            thang = Integer.parseInt(nhapNgay.substring(3,5));
            nam = Integer.parseInt(nhapNgay.substring(nhapNgay.length() - 4));
        }

        // Kiểm tra nhập ngày tháng trong tháng 2
        while (nam % 4 != 0 && thang == 2 && ngay > 28) {
            System.out.print("Đây không phải năm nhuận. Tháng 2 chỉ có 28 ngày. Mời nhập lại: ");
            nhapNgay = sc.nextLine();

            ngay = Integer.parseInt(nhapNgay.substring(0,2));
            thang = Integer.parseInt(nhapNgay.substring(3,5));
            nam = Integer.parseInt(nhapNgay.substring(nhapNgay.length() - 4));
        }

        // Kiểm tra nhập ngày trong tháng có 30 ngày
        while ((thang == 4 || thang == 6 || thang == 9 || thang == 11) && ngay > 30) {
            System.out.println("Đây là tháng chỉ có 30 ngày. Số ngày nhập vượt quá 30.");
            System.out.print("Mời nhập lại: ");
            nhapNgay = sc.nextLine();

            ngay = Integer.parseInt(nhapNgay.substring(0, 2));
            thang = Integer.parseInt(nhapNgay.substring(3, 5));
            nam = Integer.parseInt(nhapNgay.substring(nhapNgay.length() - 4));
        }

        // Kiểm tra nhập ngày tháng năm
        while (ngay <= 0 || thang <= 0 || nam <= 0) {
            System.out.println("Ngày tháng năm không được bé hơn 0. Nhập theo đúng định dạng dd/MM/yyyy.");
            System.out.print("Mời nhập lại: ");
            nhapNgay = sc.nextLine();

            ngay = Integer.parseInt(nhapNgay.substring(0,2));
            thang = Integer.parseInt(nhapNgay.substring(3,5));
            nam = Integer.parseInt(nhapNgay.substring(nhapNgay.length() - 4));
        }

        // Xử lý
        if (thang == 12) {
            if (ngay == 31) {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                thang = 1;
                nam++;
                ngay = 1;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else if (ngay == 1) {
                ngay = 30;
                thang--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 2;
                thang++;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay+=2;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
        }
        else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            if (ngay == 1) {
                ngay = 31;
                thang--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 2;
                thang++;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else if (ngay == 30) {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 1;
                thang++;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay+=2;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
        }
        else if (thang == 1 || thang == 5 || thang == 7 || thang == 8 || thang == 10) {
            if (ngay == 1) {
                ngay = 30;
                thang--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 2;
                thang++;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else if (ngay == 31) {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 1;
                thang++;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay+=2;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
        }
        else if (thang == 2) {
            if (ngay == 28 && nam % 4 == 0) {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 29;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else if (ngay == 29 && nam % 4 == 0) {
                ngay = 28;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 1;
                thang++;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else if ((ngay == 28) && nam % 4 != 0) {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 1;
                thang++;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else if (ngay == 1) {
                ngay = 31;
                thang--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 2;
                thang++;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay+=2;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
        }
        else if (thang == 3) {
            if (ngay == 1 && nam % 4 != 0) {
                ngay = 28;
                thang--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 2;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else if (ngay == 1 && nam % 4 == 0) {
                ngay = 29;
                thang--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 2;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else if (ngay == 31) {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay = 1;
                thang++;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
            else {
                ngay--;
                System.out.println(ngay + "/" + thang + "/" + nam);
                ngay+=2;
                System.out.println(ngay + "/" + thang + "/" + nam);
            }
        }



        //ngay = Integer.parseInt(nhapNgay.substring(0,2));
        //thang = Integer.parseInt(nhapNgay.substring(3,5));
        //nam = Integer.parseInt(nhapNgay.substring(nhapNgay.length() - 4));
        //System.out.println(ngay + "/" + thang + "/" + nam);


    }


}
