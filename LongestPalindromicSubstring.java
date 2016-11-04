public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String s_reverse = reverseString(s);
        
    }

    public String reverseString(String s){
    	StringBuilder sb = new StringBuilder();
    	sb.append(s);
    	sb = sb.reverse();
    	return sb.toString();
    }

    public int[][] find(char[] A, char[] B){
    	int[][] LCS = new int[A.length+1][B.length+1];

    	for (int i=0; i<B.length; i++){
    		LCS[0][1] = 0;
    	}
    }

    public static void main(String args[]){
    	LongestPalindromicSubstring l = new LongestPalindromicSubstring();
    	String res = l.longestPalindrome("ABCDE");
    	System.out.println();
    }
}