package Problem_Solving;

import java.util.Scanner;

public class Baek_10950 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//  계산식 의 개수
	//  A B
	//  A B
	int num = scan.nextInt();
for (int i = 1; i <= num; i++) {
	int A = scan.nextInt();
	int B = scan.nextInt();
	System.out.println(A+B);
}

}
}