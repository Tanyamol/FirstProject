package com.epam;

public class FirstTask {
    public static void main(String[] args) {

        String star="*";
        int i=0;
        int size=8;
        String sym="**";
        int strLength=2;
        while(i<size){
            System.out.println(star);
            star+=sym;
            i++;
        }
        int j=star.length()-size;
        while(star.length()>0){
            System.out.println(star);
            if (j==1){
             break;
            }
            star=star.substring(strLength);
            j--;
        }
    }

}
