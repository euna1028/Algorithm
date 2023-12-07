class Solution {
    public int solution(int[] numlist) {
        int a = 0;
		int b = 1;
         for (int i = 0; i < numlist.length; i++) {
			a += numlist[i];
			b *= numlist[i];
		}
         return b > a*a ? 0 : 1;
     
    }
}