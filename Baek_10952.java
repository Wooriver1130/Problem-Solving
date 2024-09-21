package Problem_Solving;

import java.util.Scanner;

public class Baek_10952 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//  계산식 의 개수
	//  A B
	//  A B
	while (true) {
		int A = scan.nextInt();
		int B = scan.nextInt();
		if (A == 0 && B == 0) {
			break;
		}
		System.out.println(A+B);
	}

}
}