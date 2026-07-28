package day6;

public class ClimbViaRecursion {
    public static int climb(int stairs){
        return (stairs<=0)?1:(stairs<=1)?1:(stairs<2)?2:
        climb(stairs-1)+climb(stairs-2);
    }
    
}
