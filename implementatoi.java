public class implementatoi {



/*You are required to complete this method */
    static int atoi(String s) {
        int value=0;
        int n=s.length();
        if((s.charAt(0)-'0')==-3) {

            for (int i = 1; i < n; i++) {
                if ((s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9) {
                    value = value * 10 + (s.charAt(i) - '0');
                } else return -1;
            }
            value = value * (-1);

        }
        else{
            for (int i = 0; i < n; i++) {
                if ((s.charAt(i) - '0') >= 0 && (s.charAt(i) - '0') <= 9) {
                    value = value * 10 + (s.charAt(i) - '0');
                } else return -1;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(atoi("-042"));
    }

}