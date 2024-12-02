package com.ict.problem.solving;

public class Programmers_12947 {
    public boolean solution(int x) {
        // 하샤드 수란 숫자 x가 의 자릿수의 합으로 x가 나누어 떨어지는 수를 말한다.
        int hap = 0;
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            hap += Integer.parseInt(str.charAt(i) + "");
        }
        if (x % hap == 0) {
            return true;
        } else {
            return false;
        }

    }
}
