package com.epam;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Input string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        lineProcessing(str);
    }
    public static void lineProcessing(String str){
        String strNew="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(strNew.contains(String.valueOf(ch))){
                continue;
            } else strNew+=ch;
        }
        System.out.println(strNew);
}
}
