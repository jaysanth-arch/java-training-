package day4;

import java.util.Scanner;

public class EndOfSeasonSale {
    public static void main(String[] args) {
        Scanner gain = new Scanner(System.in);
        double time = 21.00;
        int required = 0 ,payable = 0 , stock = 20 , invoices=0;
        while (stock>0&&time<21.45){
            System.out.println("let us know quantity");
            required=gain.nextInt();
            if ((required<=stock)) {
                System.out.println("enter the amount to pay");
                payable = gain.nextInt();
                if (payable>=(required*25600)) 
                    {stock-=required;invoices++;}
                else System.out.println("available");                    
                }else System.out.println("available"+stock);
                time+=0.01;
            }
            System.out.println("Invoices"+invoices);
            gain.close();
        }

    }

