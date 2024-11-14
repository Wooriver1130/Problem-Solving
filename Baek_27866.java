package Problem_Solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_27866 {
public static void main(String[] args) {
	
	// 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 만들자
	
	// 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 
	// 둘쨰 줄에 정수 i가 주어진다.
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		String S = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		System.out.println(S.charAt(i - 1));
		
	} catch (Exception e) {
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
