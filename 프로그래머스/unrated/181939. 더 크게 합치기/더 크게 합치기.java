class Solution {
    public int solution(int a, int b) {
       
      String aa = Integer.toString(a);
	  String bb = Integer.toString(b);
	
	  String answer = Integer.parseInt(aa.concat(bb)) >= Integer.parseInt(bb.concat(aa))? aa.concat(bb) : 
        bb.concat(aa);
	
        
        return  Integer.parseInt(answer);
    }
}