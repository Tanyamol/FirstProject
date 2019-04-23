package controller;

import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil implements Serializable {

    private static Scanner sc=new Scanner(System.in);
    public static int inputInt() {
        int currentTry = 0;
        int maxTryCount = 3;

        while (currentTry < maxTryCount) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input a number, you have " + (maxTryCount - currentTry) + " tries");
            }
            currentTry++;
        }
        throw new InputMismatchException();
    }
    public static String inputString(){
             return sc.next();
    }
}
