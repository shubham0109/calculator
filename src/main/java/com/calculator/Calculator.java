package com.calculator;

import java.util.*;

public class Calculator {
	public static void main(String args[])
    {
        int flag=0,ch;
        double num1,num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Basic Simple Calculator");
        do
        {
            System.out.println("Menu");
            System.out.println("");
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 to Exit");
            System.out.print("Enter your choice: ");
            ch = reader.nextInt();
            if(ch==5)
            {
                flag = 1;
            }
            else
            {
                switch(ch)
                {
                case 1:
                System.out.println("Addition");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = reader.nextDouble();
                System.out.println(num1+num2);
                break;
                case 2:
                System.out.println("Subtraction");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = reader.nextDouble();
                System.out.println(num1-num2);
                break;
                case 3:
                System.out.println("Multiplication");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = reader.nextDouble();
                System.out.println(num1*num2);
                break;
                case 4:
                System.out.println("Division");
                System.out.println("Enter two numbers");
                System.out.print("Enter number 1: ");
                num1 = reader.nextDouble();
                System.out.print("Enter number 2: ");
                num2 = reader.nextDouble();
                System.out.println(num1/num2);
                break;
                default: System.out.println("Exiting program due to invalid input");
                flag=1;
                }
            }
            System.out.println("\n");
            }while(flag==0);
    }
}
