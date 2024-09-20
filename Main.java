package Problem_Solving;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
// 입력한 숫자가 윤년이면 1 아니면 0 출력
// 연도가 4의배수이면서 100의 배수가 아니여야 한다.
// 혹은 400의 배수여야 한다.
Scanner scan = new Scanner(System.in);
int input = scan.nextInt();

if (input >= 1 && input <= 4000) {
	if (input%400 ==0) {
		System.out.println("1");
		}else if (input%4 == 0) {
			if (input%100 != 0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}else {
			System.out.println("0");
		}
}



	
	}
}
