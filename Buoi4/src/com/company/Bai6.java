package com.company;

<<<<<<< HEAD
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int randomNum = (int) (Math.random() * 999 + 1);
        int inputNum, guess_turn = 0;
        do {
            System.out.println("Mời bạn đoán và nhập vào: ");
            inputNum = Integer.parseInt(sc.nextLine());

            while (inputNum <= 0 || inputNum > 1000) {
                System.out.println("Số nguyên nhập vào phải từ 1 - 1000.");
                System.out.println("Mời nhập lại:");
                inputNum = Integer.parseInt(sc.nextLine());
            }

            if (inputNum < randomNum) {
                System.out.println("Nhập số lớn hơn.");
                guess_turn++;
            }
            else if (inputNum > randomNum) {
                System.out.println("Nhập số nhỏ hơn.");
                guess_turn++;
            }
        } while (inputNum != randomNum);
        System.out.println("Bạn đã đoán đúng.");
        System.out.println("Sau " + guess_turn + " lượt.");


    }
=======
public class Bai6 {
>>>>>>> 54ae30fa0248bf3e2277a5e95947dad1f3b40c14
}
