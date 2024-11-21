package com.ict.problem.solving;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_2738 {
public static void main(String[] args) {
	try {
		// n은 줄의 개수 m은 숫자의 개수
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr1 = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr1[i][j] = Integer.parseInt(st2.nextToken());
			}
		}// for문 끝
		
		int[][] arr2 = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr2[i][j] = Integer.parseInt(st3.nextToken());
			}
		}// for문 끝
		
		int[][] resultArr = new int[n][m];
		for (int i = 0; i <n; i++) {
			for (int j = 0; j < m; j++) {
				resultArr[i][j] =  arr1[i][j] + arr2[i][j];
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(resultArr[i][j] + " ");
			}
			System.out.println();
		}
			
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
