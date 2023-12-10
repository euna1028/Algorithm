class Solution {
    public String solution(int[] b) {
     
       	String a = "";
		for (int i = 0; i < b.length-1; i++) {
			if (b[i + 1] - b[i] == 1) {
				a= a.concat("w");
			} else if (b[i + 1] - b[i] == -1) {
				a= a.concat("s");
			} else if (b[i + 1] - b[i] == -10) {
				a= a.concat("a");
			} else {
				a= a.concat("d");
			}
		}
        return a;
    }
}