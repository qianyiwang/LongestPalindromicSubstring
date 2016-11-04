public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String s_reverse = reverseString(s);
        char[] A = s.toCharArray();
        char[] B = s_reverse.toCharArray();
        return find(A,B);
        
    }

    public String reverseString(String s){
    	StringBuilder sb = new StringBuilder();
    	sb.append(s);
    	sb = sb.reverse();
    	return sb.toString();
    }

    public String find(char[] A, char[] B){
    	String str = "";
    	int[][] LCS = new int[A.length+1][B.length+1];

    	for (int i=0; i<=B.length; i++){
    		LCS[0][i] = 0;
    	}
    	for (int i=0; i<=A.length; i++){
    		LCS[i][0] = 0;
    	}
    	for (int i=1; i<=A.length; i++){
    		for (int j=1; j<=B.length; j++){
    			if(A[i-1]==B[j-1]){
    				LCS[i][j] = LCS[i-1][j-1]+1;//garuntee the contiues sum up
    			}
    			else{
    				LCS[i][j]=0;
    			}
    		}
    	}
    	int result = -1;
    	int idx = 0;
		for(int i=0;i<=A.length;i++){
			for(int j=0;j<=B.length;j++){
				if(result<LCS[i][j]){
					result = LCS[i][j];
					idx = j;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i=idx-result+1; i<=idx;i++){
			sb.append(B[i-1]);
		}
		return sb.toString();
    }

    public static void main(String args[]){
    	LongestPalindromicSubstring l = new LongestPalindromicSubstring();
    	String res = l.longestPalindrome("a");
    	System.out.println(res);
    }
}