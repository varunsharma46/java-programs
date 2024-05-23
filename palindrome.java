public class palindrome {
    public static void main(String[] args) {
        int a = 125;
        int b=0;
        int d=b;
        while (a>0){
            b=a%10;
            b=a/10;
            if(d==a){
                System.out.println("true");
            }
          
        }
        System.out.println("false");
    }
   
    
}
