package day5;
public class sumviaRecursion {
    public static double findsum (double[] arr, int index){
        if(index==0) return arr[index];
        return arr[index]+findsum (arr,index-1);
    }
    public static void main(String[] args) {
        double[] onRoad ={7.45,13.5,4.5,21.6};
        double sum = findsum (onRoad ,onRoad.length-1);
        System.out.println(sum);
    }
}
