package com.codersbay;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int [] number = new int[0];

        while (!scan.hasNext("q")) {
            int scanNumber = scan.nextInt();
            System.out.println("number");

            int [] array = new int [number.length + 1];

            for (int i = 0; i < number.length; i++) {
                array[i] = number[i];
            }

            array[number.length] = scanNumber;
            number = array;
            System.out.println(Arrays.toString(array));
        }

        int maxNumber = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > maxNumber) {
                maxNumber = number[i];
            }
        }
        System.out.println("The maximum is " + maxNumber);
    }

}
