package com.epam;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Enter length of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int[] arr=new int[n];
        int[] thirdArr=new int[n];
        int i;
        for(i=0;i<n;i++){
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i]+" ");
            arr[i]=(int) (Math.random() * 10);
            System.out.print(" " +arr[i]);
            System.out.println();
            thirdArr[i]=array[i]+arr[i];
            System.out.println();
        }
     for(int element:thirdArr){
         System.out.println("element of thirdArr: "+element+" ");
     }


    }
}
