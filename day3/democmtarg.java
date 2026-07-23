//package day3;

public class democmtarg {
    public static void main(String[] aadhi) {

        if(aadhi.length==0)return;
        float amount = Short.parseShort(aadhi[0]);
        
        if(amount>1000&&amount<=5000)
            System.out.println(amount+"transferred with 5rs");

        else if (amount>5000&&amount<=10000)
            System.out.println(amount+"transferred with 10rs");

        else if (amount>10000&&amount<=50000)
            System.out.println(amount+"transferred with 30rs");
        
        else if (amount>=50000)
           System.out.println(amount+"tranferred with 100rs");
        else
            System.out.println("tranferrend no charges"); 
        
             
           
    }
}
