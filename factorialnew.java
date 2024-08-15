public class factorialnew {
    public static void main(String[] args){
        int n=5;
        int fac=1;
        for(int i=n;i>=1;i--){
            fac=fac*i;
        }
        System.out.println("factorial of "+n +" is : "+fac);
    }
    
}
