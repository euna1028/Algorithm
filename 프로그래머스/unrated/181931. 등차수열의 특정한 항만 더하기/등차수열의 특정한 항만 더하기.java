class Solution {
    public int solution(int a, int b, boolean[] c) {
     	int answer = 0;
        for (int i = 0; i < c.length; i++) {
                  
			if (c[i] == true) {
				
				answer += a + (b*i);
			}
			
		}
        return answer;
    }
}