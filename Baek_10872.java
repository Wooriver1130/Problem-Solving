package Problem_Solving;

import java.util.Scanner;

public class Baek_10872 {
public static void main(String[] args) {
	// N 입력시 N! 출력 
	// ex) 3! = 3x2x1
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int pec = 1 ;
	if (N >= 0 && N <= 12 ) {
		for (int i = 1; i <= N; i++) {
		pec = pec * i ;	
		}
		System.out.println(pec);
	}
	
		
	}
}
