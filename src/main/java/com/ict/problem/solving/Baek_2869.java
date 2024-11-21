package com.ict.problem.solving;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2869 {
public static void main(String[] args) {
	/*
	 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
	 * 
	 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
	 * 
	 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
	 */
	/* 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000) 
	 * 하루 전날의 V = (A-B)*(day-1)
		V-A = (A-B)*(day-1)
		day = (v-a) / (a-b) + 1

	 * */
	
		BufferedReader br = null ;
	try {
		 br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		double  A = Integer.parseInt(st.nextToken());
		double  B = Integer.parseInt(st.nextToken());
		double  V = Integer.parseInt(st.nextToken());
		int day = (int) (Math.ceil((V-A) / (A-B)) + 1); 
		
		System.out.println(day);
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
