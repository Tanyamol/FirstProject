package com.epam;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Input string: ");
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine().toLowerCase();
        System.out.println(processLine(line));
    }
    public static String processLine(String line){
        String lineNew="";
        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if(lineNew.indexOf(ch) == -1) //-1, если символ не встречается.
              lineNew+=ch;
        }
              return lineNew;
}
}

