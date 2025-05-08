package Algorithm.number10;

import javax.swing.tree.TreeNode;

public class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }
        answer = answer / numbers.length;
        return answer;
    }
}
