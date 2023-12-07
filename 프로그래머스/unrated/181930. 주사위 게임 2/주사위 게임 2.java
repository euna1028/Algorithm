class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;

		int d = a + b + c;
		int e = d * (a*a + b*b + c*c);
		int f = e * (a*a*a + b*b*b + c*c*c);
		// 세 주사위 숫자가 모두 다르므로 2 + 6 + 1 = 9점을 얻습니다. 
		//두 주사위 숫자만 같으므로 (a + b + c) × (a2 + b2 + c2 )
		//세 주사위 숫자가 모두 같으므로  (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )
      if (a != b && a != c && c != b) {
		return d;
	}else if (a == b && b ==c) {
		return f;
	}else {
		return e;
	}
    }
}