package com.epam;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int getSize=getSize();
        System.out.println(Arrays.toString(createThirdArray(initializeArray(getSize),initializeArray(getSize))));
    }

    public static int getSize () {

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
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int[] createThirdArray (int[] array, int[] arr){

        int [] thirdArray=new int[array.length];
        for(int i=0;i<array.length;i++){
            thirdArray[i]=array[i]+arr[i];
        }
        return thirdArray;
    }

}
