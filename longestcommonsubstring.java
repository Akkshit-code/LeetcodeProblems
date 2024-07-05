public class longestcommonsubstring {
    public static int longestsubstring(int n,int m,String s,String t){
        int [][] dp=new int[n+1][m+1];
        for(int i=0;i<n;i++) dp[i][0]=0;
        for (int j=0;j<m;j++) dp[0][j]=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    max=Math.max(dp[i][j],max);
                }
                else dp[i][j]=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String s="abc";
        String t="abx";
        System.out.println(longestsubstring(3,3,s,t));
    }
}
