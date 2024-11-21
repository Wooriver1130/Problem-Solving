package Problem_Solving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek_10871 {
public static void main(String[] args) {
	// 정수N개로 이루어진 어떤 수열의 이름이 A
	// 정수 X
	// A에서 X보다 작은수를 모두 출력하는 프로그램을 작성해라.
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	try {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(st.nextToken());
			if (value < x) {
				sb.append(value + " ");
			}
		}
		System.out.println(sb);
		
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
