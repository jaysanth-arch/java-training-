package day4;

import java.util.Scanner;

public class demoTimeGlass {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("leyt us name in odd lenght");
       String name = scan.nextLine();
       int limit = name.length();
       for(int row=limit/2;row>=0;row--){
        for (int space =limit/2;space>row;space--)
            System.out.println(" ");
        for(int column=0;column<=(row*2);column++)
          System.out.println(name.charAt(column));
        System.out.println();  
       }
       for(int row = 1;row<=limit/2;row++){
        for (int space=limit/2;space>row;space--)
            System.out.println(" ");
        for(int column=0;column<=(row*2);column++)
            System.out.println(name.charAt(column));
        System.out.println();
       }
       scan.close();
    }
}
