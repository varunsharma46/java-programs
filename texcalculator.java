public class texcalculator {
    public static void main (String args[]){
        int income =20000;
        int tax ;
        if(income<500000){
          tax=0;
        }
        else if (income >500000 && income <100000){
            tax= (int) (income*0.2); 
        }
        else {
            tax = (int) (income*0.3);
        }
        System.out.println("The tax is " + tax);
    }
}
