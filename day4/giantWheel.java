package day4;

import java.util.Scanner;

public class giantWheel {
    public static void main(String[] args)  {
        Scanner allow = new Scanner(System.in);
        for (int cabin =91;cabin>=87;cabin--){
            System.out.println("new cabin arrived");
            for(int person=1;person<=4;){
                System.out.println("let me know age");
                int age = allow.nextInt();
                if (age>=18&&age<=60){
                    person++;
                    System.out.println("enjoy your ride");
                }else
                    System.out.println("safety is prior over ride");
        }
    }
    allow.close();
    }
}