package com.epam;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int getSize=getSize();
        int [] initializeArray=initializeArray(getSize);
        System.out.println("Array with positive number: "+Arrays.toString(getPositiveArray(initializeArray))+"\n"+
                "Array with negative numbers: "+ Arrays.toString(getNegativeArray(initializeArray)));
    }

    public static int[] getNegativeArray (int [] array){

        int negative=0;
        for(int i=0;i<array.length;i++){
           if(array[i]<0){
                negative++;
            }
        }
        int[] arr2=new int[negative];
        int l=0;
        for (int j = 0; j < array.length; j++){
            if(array[j]<0){
                arr2[l]=array[j];
                l++;
                if(l>negative)
                    break;
            }
        }
             return arr2;
    }

     public static int[] getPositiveArray (int[] array) {
         int positive = 0;
         for (int i = 0; i < array.length; i++) {
             if (array[i] > 0) {
                 positive++;
             }
         }
             int k = 0;
                 int[] arr1 = new int[positive];
                 for (int j = 0; j < array.length; j++) {
                     if (array[j] > 0) {
                         arr1[k] = array[j];
                         k++;
                         if (k > positive)
                             break;
                     }
                 }
                 return arr1;
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
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
