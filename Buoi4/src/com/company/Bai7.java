package com.company;

<<<<<<< HEAD
import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int player_option, count_player_win = 0, count_com_win = 0;

        // Menu
        do {
            int com_option = (int) (Math.random() * 3 + 1);
            menu();
            System.out.print("Mời bạn nhập lựa chọn: ");
            player_option = Integer.parseInt(sc.nextLine());
            while (player_option > 3 || player_option < 0) {
                System.out.println("Lựa chọn bạn nhập không phù hợp.");
                menu();
                System.out.print("Mời nhập lại: ");
                player_option = Integer.parseInt(sc.nextLine());
            }

            if (player_option == com_option) {
                System.out.println("Hòa.");
            }
            else if (player_option == 1 && com_option == 2) {
                System.out.println("Bạn thắng.");
                count_player_win++;
                count_com_win++;
            }
            else if (player_option == 1 && com_option == 3) {
                System.out.println("Bạn thua.");
                count_com_win++;
            }
            else if (player_option == 2 && com_option == 1) {
                System.out.println("Bạn thua.");
                count_com_win++;
            }
            else if (player_option == 2 && com_option == 3) {
                System.out.println("Bạn thắng.");
                count_player_win++;
            }
            else if (player_option == 3 && com_option == 1) {
                System.out.println("Bạn thắng.");
                count_player_win++;
            }
            else {
                System.out.println("Bạn thua.");
                count_com_win++;
            }
        } while (player_option != 0);

        tySo(count_player_win, count_com_win);
    }
    public static void menu() {
        System.out.println("Menu lựa chọn:");
        System.out.println("0. Thoát.");
        System.out.println("1. Bao.");
        System.out.println("2. Búa.");
        System.out.println("3. Kéo.");
    }

    public static void tySo(int count_player_win, int count_com_win) {
        if (count_com_win < count_player_win) {
            System.out.println("Bạn thắng chung cuộc với tỷ số " + count_player_win + " - " + count_com_win);
        }
        else if (count_com_win > count_player_win) {
            System.out.println("Máy thắng chung cuộc với tỷ số " + count_com_win + " - " + count_player_win);
        }
        else {
            System.out.println("Bạn và Máy hòa nhau với tỷ số " + count_player_win + " - " + count_com_win);
        }
    }
=======
public class Bai7 {
>>>>>>> 54ae30fa0248bf3e2277a5e95947dad1f3b40c14
}
