package com.problem_2.problem_statement_2_2;

import java.util.Scanner;

public class SumTwo {

    public static void main(String[] args) {

    	Scanner sc= new Scanner(System.in); 
    	System.out.println("Enter first number: ");
    	int num1 = sc.nextInt(); 
    	System.out.println("Enter second number: ");
    	int num2 = sc.nextInt();
    	System.out.println("\nTwo numbers are entered: "+num1+", "+num2);
    	System.out.println("\nThe sum of upto 13 numbers");
    	
        for (int i = 0; i <= 13; ++i)
        {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
    }
}