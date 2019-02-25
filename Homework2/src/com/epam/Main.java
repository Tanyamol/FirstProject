package com.epam;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Task1
        int variable1=15;
        int variable2=20;
      variable1=variable1+variable2;
      variable2=variable1-variable2;
      variable1=variable1-variable2;
        System.out.println(variable1+" "+variable2);

        // Task2
        int number1=123;
        int number2=(number1%10);
       int number3=(number1%100)-number2;
       int number4=(((number1%1000)-number2)-number3)/100;
       int number5=number1-((number2*100)+number3+number4);
        System.out.println(number5);

        //Task3
         Scanner sc= new Scanner(System.in);
        double pound=sc.nextDouble();
        double kilogram=(pound*0.453592);
        double gram=(kilogram*1000)%1000;
        if(kilogram<1)
            kilogram=0;
      else kilogram=(int)(kilogram-gram/1000);
        System.out.println("В "+ pound+" фунте: "+ kilogram+ " килограмм и "+ gram+ " грамм");

        //Task4
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sum of deposit: ");
        double deposit=scanner.nextDouble();
        System.out.println("Enter the percent: ");
        double percent=(scanner.nextDouble())/100;
        System.out.println("Enter the quantity of months: ");
        double months=scanner.nextDouble();
        double sum=(int)((deposit*percent/12)*months);
        System.out.println(sum);





    }
}
