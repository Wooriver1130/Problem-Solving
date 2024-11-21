package com.ict.problem.solving;


public class pracPage {
public static void main(String[] args) {

String str = "hello";

String a = str + "world"; // + 연산은 자바에서 자동으로  StringBuilder로 변환해 준다.
String b = str.concat("world");
String c = new StringBuffer("hello").append("world").toString(); 
String d = new StringBuilder("hello").append("world").toString();

	
	

}
}