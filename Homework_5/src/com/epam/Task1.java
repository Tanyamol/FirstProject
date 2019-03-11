package com.epam;
import java.util.Scanner;
import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        processArray(initializeArray(getSize()));
    }

    public static int getSize(){
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
            return array;
        }

    public static void processArray(int [] array) {

        if(array==null||array.length==0){
            System.out.print("Invalid length of array");
        }
        for(int i=0;i<array.length;i++){
            System.out.print(" " + array[i] + " ");
            }
        System.out.println();
        for(int j=array.length-1; j>=0;j--){
            System.out.print(" "+array[j]+" ");
        }

    }

}


