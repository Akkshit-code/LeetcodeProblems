class longestPalindrome{

    // Brute Force Approach O(n^2)
    public static boolean palindrome(String s){
        if(s.length()==1) return true;
        if(s.length()==2 && s.charAt(0)!=s.charAt(1)) return false;
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static String longestPalindrome(String s) {
        int n=s.length();
        int max=-1;
        String str="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                if(palindrome(s.substring(i,j+1))){
                    if(max<s.substring(i,j+1).length()){
                        str="";
                        max=s.substring(i,j+1).length();
                        str+=s.substring(i,j+1);
                    }
                }
            }
        }
        return str;
    }


    public static void main(String[] args) {
        String s="babad";
        System.out.println(longestPalindrome(s));
    }
}