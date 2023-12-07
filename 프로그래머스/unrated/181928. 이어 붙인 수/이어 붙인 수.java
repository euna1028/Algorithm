class Solution {
    public int solution(int[] numlist) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % 2 == 0) {
				a.append(numlist[i]);
				
			}else {
				b.append(numlist[i]);
			}
		}
		return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }
}