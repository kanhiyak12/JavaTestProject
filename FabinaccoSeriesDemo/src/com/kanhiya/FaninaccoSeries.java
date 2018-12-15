package com.kanhiya;

import java.util.Scanner;

public class FaninaccoSeries {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("how many number you wants to print");
		int number = scanner.nextInt();
		System.out.println("enter first Number");
		int n1 = scanner.nextInt();
		System.out.println("enter Second Number");
		int n2 = scanner.nextInt();
		int n3;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (int i = n1 + 1; i < number; ++i)// loop starts from 2 because 0 and
												// 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		scanner.close();
		System.out.println("gitHub testing");
	}

}
