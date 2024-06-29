import java.util.*;
class Main{
    public static int dicecombination(int n){
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        int count = 0;
        for(int i=1; i<=6; i++) {
            count += dicecombination(n-i);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(dicecombination(n));
    }
}