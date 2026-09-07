public class powerofTwo{
    public boolean ispowerofTwo(int n){
        if(n<1)
           return false;
        else if(n==1)
           return true;
        else{
            while(n%2==0){
               n=n/2;
            }
            if(n==1)
               return true;
            else
               return false;
        }
    }
    public static void main(String[] args){
        powerofTwo obj = new powerofTwo();
        obj.ispowerofTwo(17);
        System.out.println(obj.ispowerofTwo(1));
    }
}
