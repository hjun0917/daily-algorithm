class Solution {
    public int[] solution(int money) {
        int[] answer = {};

        int icePrice = 5500;

        if (money < icePrice) {
            return answer = new int[]{0, money};
        }

        int cupOfCoffee = money / 5500;

        int changes = money % 5500;

        answer = new int[]{cupOfCoffee, changes};

        return answer;
        }
}