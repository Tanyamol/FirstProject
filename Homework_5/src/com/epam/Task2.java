package com.epam;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        countOddNum(initializeArray(getSize()));
    }

    public static int getSize() {

        System.out.println("Enter length of array: ");
        Scanner sc = new Scanner(System.in);
        int sizeArray = sc.nextInt();
        return sizeArray;
    }

    public static int[] initializeArray (int sizeArray) {

        if(sizeArray<0){
            return null;
        }
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) - 30;

        } System.out.println(Arrays.toString(array));
        return array;
    }

    public static void countOddNum(int [] array) {
        int sum = 0;
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                quantity++;
            }
        }
        System.out.println("sum: " + sum + " quantity: " + quantity);
    }
}
