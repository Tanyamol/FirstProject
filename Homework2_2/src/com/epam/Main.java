package com.epam;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
// 1)
        String str="*";
        int n = 6;

        for(int i=0;i<n;i++){
            System.out.println(str);
            str+="**";
        }
        for(int j= n;j>0;j--){

            str=str.substring(2);
            System.out.println(str);
        }

    }
}





