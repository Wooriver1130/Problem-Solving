package com.ict.problem.solving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek_15552 {
public static void main(String[] args)  {
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	try {
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
	
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 공백을 기준으로 토큰(덩어리)로 나누기
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write((a + b) + "\n");
		}
		bw.flush();
	} catch (NumberFormatException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}finally {
		try {
			br.close();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
}
