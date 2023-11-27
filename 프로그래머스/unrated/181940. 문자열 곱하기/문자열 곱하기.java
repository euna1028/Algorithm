class Solution {
    public String solution(String a, int k) {
        String answer = "";
        for (int i = 0; i < k; i++) {
		answer += String.join("", a);
	}
	
        return answer;
    }
}