class Solution {
    public int solution(int slice, int n) {
        int circle;

        /*
        1판을 slice 조각으로 컷팅
        -> slice * circle >= n 조건을 충족해야 한다.
        (1명이 최소 1조각은 먹을 수 있다는 조건)
         */

        if (n%slice == 0) {
            return circle = n/slice;
        }

        circle = n/slice + 1;

        return circle;
    }
}