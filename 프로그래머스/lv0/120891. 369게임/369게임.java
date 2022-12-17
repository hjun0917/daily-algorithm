import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int order) {
        int answer = 0;


        if(order < 3) {
            return answer;
        }

        String num = String.valueOf(order);

        List<String> nums = new ArrayList<>();

        for (int i = 0; i < num.length(); i++) {
            nums.add(String.valueOf(num.charAt(i)));
        }

        for (int i = 0; i < nums.size(); i++) {
            if (Integer.parseInt(nums.get(i)) % 3 == 0 && Integer.parseInt(nums.get(i)) != 0) {
                answer++;
            }
        }

        return answer;
    }
}