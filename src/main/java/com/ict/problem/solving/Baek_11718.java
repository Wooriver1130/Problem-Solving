package com.ict.problem.solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek_11718 {
public static void main(String[] args) {
	/*
	 * 문제 입력 받은 대로 출력하는 프로그램을 작성하시오.
	 * 
	 * 입력
	 *  입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은
	 * 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
	 * 
	 * 출력
	 *  입력받은 그대로 출력한다.
	 */
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String line = "";
	StringBuffer sb = new StringBuffer();
	try {
		while ((line = br.readLine()) != null) {
		sb.append(line).append("\n");
		}
		System.out.println(sb.toString());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
