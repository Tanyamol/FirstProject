package com.epam;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter length of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printArray(n);
    }
        public static void printArray(int n){
        int[] array=new int[n];
       outer: for(int i=0;i<array.length;i++) {
            array[i]=(int)(Math.random()*10);
           System.out.println(array[i]);
           if(i==array.length-1) {
               while (i >= 0) {
                   System.out.println(array[i]);
                   i--;
                   if (i < 0) {
                       break outer;
                   }
               }
           }
      }
    }
}

