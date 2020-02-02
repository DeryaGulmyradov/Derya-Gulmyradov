package com.company;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        int userInput;
        userInput = name.nextInt();
        System.out.println("Age:\t"+userInput);



    }
}
