package com.company;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine(); //"input" store the user input

        calculateCharecters(input); //and go through this metod

    }

    public static int calculateCharecters(String text) { // now "text" store the user input

        int texts = text.length(); //here "texts" store the "text" lenght (text.lenght()) or number
        //of characters

        System.out.println("Number of charecters: " + texts); //printing number of characters
        return texts; //returning number of characters so

    }
}
