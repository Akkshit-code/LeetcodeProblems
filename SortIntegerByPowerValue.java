import java.util.*;

class SortIntegerByPowerValue {
    public int sortpower(int value){
        if(value==2) return 1;
        if(value<=0) return 0;
        int count1=0,count2=0;
        if(value%2==0){
            count1=1+sortpower(value/2);
        }
        if(value%2!=0){
            count2=1+sortpower(3*value+1);
        }
        return count1+count2;
    }
    public int getKth(int lo, int hi, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = lo;i<=hi;i++){
            map.put(i,sortpower(i));
        }

        List<Integer> al = new ArrayList<>(map.keySet());
        Collections.sort(al, (a,b) -> {

            if(map.get(a) != map.get(b)){
                return map.get(a) - map.get(b);
            }

            return a - b;
        });

        return al.get(k-1);
    }
}