package programmers.피자_나눠_먹기_3;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("slice = 5, n = 10 = " + solution.solution(3, 10));
    }

    public int solution(int slice, int n) {
        int circle;

        /*
        1판을 slice 조각으로 컷팅
        -> slice * circle >= n 조건을 충족해야 한다.
        (1명이 최소 1조각은 먹을 수 있다는 조건)
         */

        if (n % slice == 0) {
            return circle = n / slice;
        }

        circle = n / slice + 1;
        return circle;
    }
}
