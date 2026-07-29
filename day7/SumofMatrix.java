package day7;

import java.util.Arrays;

public class SumofMatrix {
    public static int sum(int[][] arr){
        int total=0;
        for(int[] row:arr)
            total+=Arrays.stream(row).sum();
        return total;
    }
    public static void main(String[] args) {
        int[][] tds={
            {2,5,12},
            {9,4},
            {45,89,20,30}
            };
            System.out.println(sum(tds));
        }
}