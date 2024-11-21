package Problem_Solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2744 {
public static void main(String[] args) {


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	try {
		String result = br.readLine();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length(); i++) {
			char k =  result.charAt(i);
			if (Character.isUpperCase(k)) {
				sb.append(String.valueOf(k).toLowerCase()) ;
			}else {
				sb.append(String.valueOf(k).toUpperCase()) ;
			}
		}		
		result = sb.toString();
		System.out.println(result);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
