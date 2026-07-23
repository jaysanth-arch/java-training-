

import java.util.Scanner;

public class bitmanipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("enter a number");
        num = scan.nextInt();
        if ((num&1)==0) System.out.println("even");
        else System.out.println("odd");
        int result = num +1;
        System.out.println(result);
    }
    
}