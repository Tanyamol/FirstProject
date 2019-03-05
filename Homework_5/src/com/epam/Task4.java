package com.epam;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("Enter length of array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array=new int[n];
        int negative=0;
        int positive=0;
        for(int i=0;i<array.length;i++){
            System.out.println("Enter numbers: ");
            array[i]=sc.nextInt();
            System.out.println(array[i]);
            if(array[i]>0){
                positive++;
            }if(array[i]<0){
                negative++;
            }
        }
        int[] arr1=new int[positive];
        int[] arr2=new int[negative];
        int k=0;
        int l=0;
        for (int j = 0; j < array.length; j++){
            if(array[j]>0){
                arr1[k]=array[j];
                System.out.println("Numbers of positive array: "+arr1[k]);
                k++;
                if(k>positive)
                    break;
            }
            if(array[j]<0){
                arr2[l]=array[j];
                System.out.println("Numbers of negative array: "+arr2[l]);
                l++;
                if(l>negative)
                    break;
            }
        }

    }
}
