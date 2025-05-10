package Algorithm.No12;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String x = String.valueOf(n);
        for (int i = 0; i < x.length(); i++) {
            int num = Integer.parseInt(x.charAt(i) + "");
            answer = answer + num;
        }
        return answer;
    }
}
