package com.problem_6.problem_statement_6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n = sc.nextInt();
		System.out.println("Enter the student names:");
		for (int i = 0; i < n; i++) {
			a1.add(sc.next());
		}

		System.out.println("Student list:");
		System.out.println(a1);
		for (int i = 0; i < a1.size(); i++) {
			System.out.println("Enter the name of the student to be searched:");
			String st = sc.next();
			if (a1.contains(st)) {
				System.out.println("found");
			} else {
				System.out.println("not found");
			}

		}
	}
}
