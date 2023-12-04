import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfSquare(int x){
        int sum=0;
        int r;
        while(x>0){
            r=x%10;
            x=x/10;
            sum+=(r*r);
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Map<Integer,Boolean> k=new HashMap<>();
        while(n!=1){
            if(k.containsKey(n)){
                return false;
            }
            k.put(n,false);
            n=sumOfSquare(n);
        }
            return true;
    }
}
