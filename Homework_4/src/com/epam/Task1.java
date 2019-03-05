package com.epam;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Input integer: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(intToBinary(number));
    }
    public static String intToBinary(int n)
    {
        String str = "";
        while (n > 0) {
            str =  ( (n % 2 ) == 0 ? "0" : "1") +str;
            n = n / 2;
        }
        return str;
    }

}
