package com.epam;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter length of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countOddNum(n);
    }
    public static void countOddNum(int n) {
        int[] array = new int[n];
        int sum = 0;
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println(array[i]);
            if (array[i] % 2 != 0) {
                sum += array[i];
                quantity++;
            }
        }
        System.out.println("sum: " + sum + " quantity: " + quantity);
    }


}
