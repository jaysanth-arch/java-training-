package day4;

import java.util.Scanner;

public class demoTriangle {
    public static void main(String[] args) {
        Scanner card = new Scanner(System.in);
        int limit=0; char alpha = 'z';
        System.out.println("enter the limit");
        limit=card.nextInt();
        for(int row=limit;row>0;row--){
            for(int column=1;column<=row;column++){
                System.out.println(alpha);
                alpha--;
            }
            System.out.println();
        }
        card.close();
    }
}
