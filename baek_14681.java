package Problem_Solving;

import java.util.Scanner;

public class baek_14681 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int x = scan.nextInt();

int y = scan.nextInt();
// 1사분면 => x양수, y양수
// 2사분면 => x음수, y양수
// 3사분면 => x음수, y음수
// 4사분면 => x양수, y음수
if (x>0) {
	if (y>0) {
		System.out.println(1);
	}else {
		System.out.println(4);
	}
}else if (x<0) {
	if (y>0) {
		System.out.println(2);
	}else {
		System.out.println(3);
	}
}


}
}