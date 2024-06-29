public class longestpalindromicsubstring {
        public int rec(String s1 , String s2 , int i , int j ,int [][] dp){
            if(i<0 || j<0){
                return 0;
            }
            if (dp[i][j] !=-1){
                return dp[i][j];
            }
            if(s1.charAt(i) == s2.charAt(j)){
                return dp[i][j] = 1 + rec(s1 , s2 , i-1 , j-1 , dp);
            }
            return dp[i][j] = Math.max(rec(s1 , s2 , i-1,j , dp) , rec(s1 , s2 , i , j-1 , dp));
        }
        public String reverse(String s){
            char[] ch = s.toCharArray();
            int j = s.length() - 1;
            for(int i = 0; i < s.length() / 2; i++){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                j--;
            }
            return new String(ch);
        }

        public int longestPalindromeSubseq(String s) {
            String str=reverse(s);
            int [][] dp = new int[s.length()][str.length()];
            for(int i=0;i<s.length();i++){
                for(int j=0;j<str.length();j++){
                    dp[i][j] = -1;
                }
            }
            return rec(s,str,s.length()-1,str.length()-1,dp);

        }

}
