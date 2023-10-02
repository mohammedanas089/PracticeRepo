class Solution {
    Character[] stack=new Character[10000];
    int top=-1;
     boolean isFull(){
        if(top==9999){
            return true;
        }
        else{
            System.out.println("happened1");
            return false;
        }
    }
     boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
                        System.out.println("happened2");
            return false;
        }
    }
     boolean push(char x){
        if(isFull()){
                        System.out.println("happened3");
            return false;
        }
        else{
            System.out.println("Pushed");
            top++;
            stack[top]=x;
            return true;
        }
    } 
     boolean pop(char x){
        if(isEmpty()){
                        System.out.println("happened4");

            return false;   
        }
        else{

                        System.out.println(stack[top]);

                        System.out.println(x);

            if(stack[top]==x){

            top--;
            return true;
            }
            else{
                            System.out.println("happened5");

                return false;
            }
        }
    }
    Boolean isodd(int i){
        if(i%2==0){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean isValid(String s) {
        HashMap<Character,Boolean> mapper=new HashMap<Character,Boolean>();
        Boolean flag=true;
        for(int i=0;i<s.length() && flag==true;i++){
            char x=s.charAt(i);
            
                        System.out.println(x);

                        System.out.println("======================");
            if( x== '(' ){
flag=push(')');
            }
            else if(x=='{' ){
flag=push('}');
            }
            else if( x=='['){
                flag=push(']');
            }
            else{
                flag=pop(x);
            }
        }
        if(top>-1){
            return false;
        }
        return flag;
    }
}