package com.problem_5.problem_statement_5_2;

import java.util.Scanner;

public class SplitMethod {
public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a string: ");  
		String txt= sc.nextLine(); 
//		String txt= (" 23  +  45  -  (  343  /  12  ) ");
		String[] w=txt.split("\\s");
		
		for(String w1:w){  
			System.out.println(w1.trim()); 
			//System.out.println(" ");
		}
	}

	}