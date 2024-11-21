package Problem_Solving;

import java.util.Scanner;

public class baek_2420 {
public static void main(String[] args) {
// 사파리월드
// 두 유명도를 차례로 입력하고, 그 차이(절대값)를 구하게 출력
Scanner scan = new Scanner(System.in);
	long N = scan.nextLong();
	long M = scan.nextLong();
	System.out.println(Math.abs(N-M));
}
}
