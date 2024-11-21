package Problem_Solving;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baek_2754 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String result = br.readLine();
			String grade = "";
			
			if (result.equals("A+")) {
				grade = "4.3";
			}else if (result.equals("A0")) {
				grade = "4.0";
			}else if (result.equals("A-")) {
				grade = "3.7";
			}else if (result.equals("B+")) {
				grade = "3.3";
			}else if (result.equals("B0")) {
				grade = "3.0";
			}else if (result.equals("B-")) {
				grade = "2.7";
			}else if (result.equals("C+")) {
				grade = "2.3";
			}else if (result.equals("C0")) {
				grade = "2.0";
			}else if (result.equals("C-")) {
				grade = "1.7";
			}else if (result.equals("D+")) {
				grade = "1.3";
			}else if (result.equals("D0")) {
				grade = "1.0";
			}else if (result.equals("D-")) {
				grade = "0.7";
			}else {
				grade = "0.0";
			}
			System.out.println(grade);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
