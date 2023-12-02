class Solution {
    public int solution(String a, String b, int n, int m) {
        if (a.equals("<") && b.equals("=")) {
            int c = n <= m ? 1 : 0;
            return c;
        } else if (a.equals(">") && b.equals("=")) {
            int c = n >= m ? 1 : 0;
            return c;
        } else if (a.equals("<")) {
            int c = n < m ? 1 : 0;
            return c;
        } else if (a.equals(">")) {
            int c = n > m ? 1 : 0;
            return c;
        }
        return 0; // 추가: 모든 조건에 해당하지 않을 경우 기본적으로 0을 반환하도록 처리
    }
}