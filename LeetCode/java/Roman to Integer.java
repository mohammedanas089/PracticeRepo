class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> con=new HashMap<Character,Integer>();
        con.put('I',1);
        con.put('V',5);
        con.put('X',10);
        con.put('L',50);
        con.put('C',100);
        con.put('D',500);
        con.put('M',1000);
        int lastnum=0;
        int total=0;
        for(int i=s.length()-1;i>-1;i--){
            int num=con.get(s.charAt(i));
            if(lastnum<=num){
                total+=num;
            }
            else{
                total-=num;
            }
            lastnum=num;
        }
    return total;
    }
}