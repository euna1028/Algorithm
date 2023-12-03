class Solution {
    public String solution(String code1) {
char[] code = code1.toCharArray();
		String ret = "";
		int mode = 0;
		for (int i = 0; i < code1.length(); i++) {
            if (mode == 0) {
				if (code[i] == '1') {
					mode = 1;
				}else if (i % 2 == 0) {
					 ret = ret.concat(String.valueOf(code[i]));
				}
			}else if (mode == 1) {
				if (code[i] == '1') {
					mode = 0;
					
				}else if (i % 2 != 0) {
					 ret = ret.concat(String.valueOf(code[i]));
				}
			}
		}

         return ret.equals("")? "EMPTY" : ret;
    }
}