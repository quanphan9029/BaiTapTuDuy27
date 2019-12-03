package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    public static void main(String[] args) {
	// Đầu vào
        Scanner sc = new Scanner(System.in);
        int phantuMang;
        int[] mangSoNguyen;
        int menuOption, autoOrNot, vitri_1,vitri_2;

    // Xử lý
        System.out.print("Nhập số phần tử của mảng: ");
        phantuMang = Integer.parseInt(sc.nextLine());
        mangSoNguyen = new int[phantuMang];


        while (true) {
            System.out.println("Bạn có muốn nhập số tự động?");
            System.out.println("1. Có.");
            System.out.println("2. Không.");
            System.out.print("Mời nhập lựa chọn: ");
            autoOrNot = Integer.parseInt(sc.nextLine());

            if (autoOrNot == 1) {
                nhapSoNguyenTuDong(mangSoNguyen);
                break;
            }
            else if (autoOrNot == 2) {
                for (int i = 0; i < mangSoNguyen.length; i++) {
                    System.out.print("Mời bạn nhập số nguyên thứ " + (i + 1) + " vào mảng: ");
                    mangSoNguyen[i] = Integer.parseInt(sc.nextLine());
                }
                break;
            }
            else {
                System.out.println("Lựa chọn của bạn không hợp lệ.");
                System.out.println("Bạn có muốn nhập số tự động?");
                System.out.println("1. Có.");
                System.out.println("2. Không.");
                System.out.print("Mời nhập lại: ");
                autoOrNot = Integer.parseInt(sc.nextLine());
            }
        }

        do {
            System.out.print("Mảng hiện tại: ");
            for (int i = 0; i < mangSoNguyen.length; i++) {
                System.out.print(mangSoNguyen[i] + " ");
            }
            System.out.println(" ");
            menu();
            System.out.println("Mời bạn lựa chọn chức năng: ");
            menuOption = Integer.parseInt(sc.nextLine());

            if (menuOption == 0) {
                break;
            }
            else if (menuOption == 1) {
                tinhTong(mangSoNguyen);
            }
            else if (menuOption == 2) {
                demSoNguyenDuong(mangSoNguyen);
            }
            else if (menuOption == 3) {
                timSoBeNhat(mangSoNguyen);
            }
            else if (menuOption == 4) {
                timSoDuongNhoNhat(mangSoNguyen);
            }
            else if (menuOption == 5) {
                timGiaTriChanCuoiCung(mangSoNguyen);
            }
            else if (menuOption == 6) {
                System.out.println("Nhập 2 vị trí muốn đổi chỗ.");
                System.out.print("Vị trí 1: ");
                vitri_1 = Integer.parseInt(sc.nextLine());
                System.out.print("Vị trí 2: ");
                vitri_2 = Integer.parseInt(sc.nextLine());
                doicho2GiaTri(mangSoNguyen, vitri_1, vitri_2);
            }
            else if (menuOption == 7) {
                sapxepTangDan(mangSoNguyen);
            }
            else if (menuOption == 8) {
                timSoNguyenToDauTien(mangSoNguyen);
            }
            else if (menuOption == 9) {
                int phantuMangSoThuc;
                System.out.print("Tạo mảng số thực. Nhập số phần tử trong mảng: ");
                phantuMangSoThuc = Integer.parseInt(sc.nextLine());
                double[] mangSoThuc = new double[phantuMangSoThuc];

                for (int i = 0; i < mangSoThuc.length; i++) {
                    System.out.print("Nhập giá trị từng phần tử vào mảng: ");
                    mangSoThuc[i] = Double.parseDouble(sc.nextLine());
                }

                kiemtraSoNguyentrongMangThuc(mangSoThuc);

            }
            else {
                System.out.println("Lựa chọn bạn nhập không phù hợp.");
                System.out.print("Mời bạn nhập lại: ");
                menuOption = Integer.parseInt(sc.nextLine());
            }
        } while (true);
    }


    public static void nhapSoNguyenTuDong(int[] mangSoNguyen) {
        Random random = new Random();
        int ranNum = random.nextInt(2);

        for (int i = 0; i < mangSoNguyen.length; i+=ranNum) {
            ranNum = random.nextInt(5);
            mangSoNguyen[i] = random.nextInt(10000) * -1;
        }
    }

    public static void menu() {
        System.out.println("0. Thoát.");
        System.out.println("1. Tổng các số dương trong mảng.");
        System.out.println("2. Đếm có bao nhiêu số nguyên Dương trong mảng.");
        System.out.println("3. Tìm số nhỏ nhất trong mảng.");
        System.out.println("4. Tìm số dương nhỏ nhất trong mảng.");
        System.out.println("5. Tìm số chẵn cuối cùng trong mảng. Nếu không có giá trị chẵn thì trả về -1.");
        System.out.println("6. Đổi chỗ 2 giá trị trong mảng. (Cho nhập 2 vị trí muốn đổi chỗ giá trị).");
        System.out.println("7. Sắp xếp mảng theo thứ tự tăng dần.");
        System.out.println("8. Tìm số nguyên tố đầu tiên trong mảng. Nếu không có số nguyên tố thì trả về -1.");
        System.out.println("9. Nhập thêm 1 mảng số thực. Tìm xem trong mảng có bao nhiêu số nguyên.");

    }

    public static int luachonMenu(int menuOption) {
        return menuOption;
    }

    public static int tinhTong(int[] mangSoNguyen) {
        int sum = 0;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            sum += mangSoNguyen[i];
        }
        System.out.println("Tổng là: " + sum);
        return sum;
    }

    public static int kiemtraSoDuong(int soNguyen) {
        int soDuong = 0;
        if (soNguyen > 0) {
            soDuong = soNguyen;
        }
        return soDuong;
    }

    public static int demSoNguyenDuong(int[] mangSoNguyen) {
        int demDuong = 0;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            if (mangSoNguyen[i] > 0) {
                demDuong++;
            }
        }
        System.out.println("Có tất cả " + demDuong + " số nguyên dương trong mảng.");
        return demDuong;
    }

    public static void timSoBeNhat(int[] mangSoNguyen) {
        int minNum = mangSoNguyen[0];

        for (int i = 0; i < mangSoNguyen.length; i++) {
            if (minNum > mangSoNguyen[i]) {
                minNum = mangSoNguyen[i];
            }
        }
        System.out.println("Số nguyên bé nhất trong mảng là: " + minNum);
    }

    public static void timSoDuongNhoNhat(int[] mangSoNguyen) {
        int minDuong = 0;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            if (mangSoNguyen[i] > 0) {
                minDuong = mangSoNguyen[i];
                break;
            }
        }
        for (int i = 0; i < mangSoNguyen.length; i++) {
            if (mangSoNguyen[i] < minDuong && mangSoNguyen[i] > 0) {
                minDuong = mangSoNguyen[i];
            }
        }

        System.out.println("Số Nguyên Dương bé nhất trong mảng là: " + minDuong);
    }

    public static void timGiaTriChanCuoiCung(int[] mangSoNguyen) {
        int chanCuoiCung = 0, demChan = 0;
        for (int i = mangSoNguyen.length - 1; i >= 0; i--)
            if (mangSoNguyen[i] % 2 == 0) {
                demChan++;
                chanCuoiCung = mangSoNguyen[i];
                System.out.println("Giá trị chẵn cuối cùng trong mảng là: " + chanCuoiCung);
                break;
            } else {
                chanCuoiCung = -1;
            }
        if (demChan == 0) {
            System.out.println("Không có giá trị chẵn trong mảng. Trả về giá trị " + chanCuoiCung);
        }
    }

    public static void doicho2GiaTri(int[] mangSoNguyen, int vitri_1, int vitri_2) {
        int bienTam;
        int[] mangTam = mangSoNguyen;
        bienTam = mangTam[vitri_1];
        mangTam[vitri_1] = mangTam[vitri_2];
        mangTam[vitri_2] = bienTam;

        System.out.print("Mảng hiện tại: ");
        for (int i = 0; i < mangTam.length; i++) {
            System.out.print(mangTam[i] + " ");
        }
        System.out.println(" ");

    }

    public static void sapxepTangDan(int[] mangSoNguyen) {
        int bienTam;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            for (int j = i + 1; j < mangSoNguyen.length; j++) {
                if (mangSoNguyen[i] > mangSoNguyen[j])
                {
                    bienTam = mangSoNguyen[i];
                    mangSoNguyen[i] = mangSoNguyen[j];
                    mangSoNguyen[j] = bienTam;
                }
            }
        }
        System.out.print("Mảng hiện tại: ");
        for (int i = 0; i < mangSoNguyen.length; i++) {
            System.out.print(mangSoNguyen[i] + " ");
        }
        System.out.println(" ");

    }

    public static void checkSoNguyenTo(int checkNum) {
        int demUoc = 0;
        for (int i = 1; i < checkNum; i++) {
            if (checkNum % i == 0) {
                demUoc++;
            }
        }
        if (demUoc == 2) {
            System.out.println(checkNum + " là số nguyên tố.");
        }
    }

    public static void timSoNguyenToDauTien(int[] mangSoNguyen) {
        int demSNT = 0, demUoc = 0;
        for (int i = 0; i < mangSoNguyen.length; i++) {
            demUoc = 0;
            for (int j = 1; j <= mangSoNguyen[i]; j++) {
                if (mangSoNguyen[i] % j == 0 && mangSoNguyen[i] > 0) {
                    demUoc++;
                }
            }

            if (demUoc == 2) {
                demSNT++;
                System.out.println("Số nguyên tố đầu tiên trong mảng là: " + mangSoNguyen[i]);
                break;
            }
        }
        if (demSNT == 0) {
            System.out.println("Không có số nguyên tố trong mảng. Trả về giá trị -1.");
        }
    }

    public static void kiemtraSoNguyentrongMangThuc(double[] mangSoThuc) {
        int demSoNguyen = 0;

        for (int i = 0; i < mangSoThuc.length; i++) {
            if (mangSoThuc[i] / (int) mangSoThuc[i] == 1) {
                demSoNguyen++;
            }
        }
        System.out.println("Có " + demSoNguyen + " số nguyên trong mảng.");
    }

    public static int TimSoLonNhat (int a, int b) {
        int kq = 0;
        if(a > b) {
            kq = a;
        } else {
            kq = b;
        }
        return kq;
    }
}
