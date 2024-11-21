package com.ict.problem.solving;
import java.util.Scanner;

public class Baek_2739 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			int result = n * i ;
			System.out.println(n + " * " + i +" = " + result);
		}

	}

}
