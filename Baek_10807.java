package Problem_Solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_10807 {
public static void main(String[] args) {
	
// 총 N개의 정수가 주어졌을때, 정수v가 몇 개인지 구하는 기능
// 첫줄은 정수의 개수 n을 입력한다. 둘째 줄에는 정수가 공백으로 구분되어있다.
// 셋쨰 줄에는 찾으려고하는 정수 v가 주어진다.
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 try {
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = Integer.parseInt(br.readLine());
		int count = 0 ;
		
		for (int i = 0; i < n; i++) {
			if (Integer.parseInt(st.nextToken()) == v) {
				count = count + 1;
			}
		}
		System.out.println(count);
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		
	}
}
}
