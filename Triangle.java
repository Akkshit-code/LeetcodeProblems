import java.util.Scanner;
import java.util.*;
public class Triangle {
        public int triangle(List<List<Integer>> list , int m , int n,int [][]dp){
            if(m==list.size()-1){
                return list.get(m).get(n);
            }
            if(dp[m][n]!=-1) return dp[m][n];
            int leftdiagonal = list.get(m).get(n)+triangle(list,m+1,n,dp);
            int rightdiagonal = list.get(m).get(n)+triangle(list,m+1,n+1,dp);
            return dp[m][n]=Math.min(leftdiagonal , rightdiagonal);

        }
        public int minimumTotal(List<List<Integer>> triangle) {
            int m = triangle.size();
            int [][] dp = new int[m][m];
            for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    dp[i][j]=-1;
                }
            }
            return triangle(triangle,0,0,dp);
    }
}
