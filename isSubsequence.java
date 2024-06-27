public class isSubsequence {

    // Brute force approach
//            int n1 = s.length();
//            int n2 = t.length();
//            if(s.length()==0) return true;
//            int i=0;
//            int j=0;
//            int count=0;
//            while(i<n1 && j<n2){
//                char ch1 = s.charAt(i);
//                char ch2 = t.charAt(j);
//                if(ch1 == ch2){
//                    count++;
//                    i++;
//                    j++;
//                }
//                else{
//                    j++;
//                }
//            }
//            return s.length()==count;

    // Dynamic Programming approach
    public static int subsequence(String s , String t , int i ,int j,int count){
//        if(i==0 || j==0) return 0;
        if(s.charAt(0)==t.charAt(0)) return 1;
        if(s.charAt(i)==t.charAt(j)){
            count++;
            subsequence(s,t,i-1,j-1,count);
        }
        else {
            subsequence(s,t,i,j-1,count);
        }
        return count;
    }
    public static boolean isSubsequence(String s, String t) {
        int value = subsequence(s,t,s.length()-1,t.length()-1,0);
        return value==s.length();


    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }


}
