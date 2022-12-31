class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        int bigNum = 0;
        int index = 0;
        for(int i = 0; i < array.length ; i++) {
            if (bigNum < array[i]) {
                bigNum = array[i];
                index = i;
            }
        }
        
        answer = new int[]{bigNum, index};
        
        return answer;
    }
}