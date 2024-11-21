package Problem_Solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_5597 {
public static void main(String[] args) {
	// 학생 30명 출석번호 1~30
	// 제출 안 한 2명의 출석번호를 구하자
	// 출력은 2줄.
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int [] arr = new int [31];
	try {
		for (int i = 1; i <= 28; i++) {
			arr[Integer.parseInt(br.readLine())]++ ; // 제출한 학생들은 1씩 증가시킴
		}
		for (int j = 1; j <= 30; j++) { 
			if (arr[j] == 0) { // 배열의 디폴트값은 0. 따라서 미제출 학생의 출석번호(index값)의 값은 0.
				System.out.println(j);
			}
		}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

