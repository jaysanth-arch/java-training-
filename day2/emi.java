import java.util.Scanner;

public class emi {
    public static void main(String[] args) {
        int tenure=0;double cost = 0, emi =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("the amount for emi eligibility" );
        cost= scan . nextDouble();
        if (cost>=5000){
            System.out.println("Eligible to convert "+cost+"info emi");
            System.out.println("entern the desired tenure");
            tenure= scan.nextInt();

            switch(tenure){
                case 12: case 3:case 9:
                    emi = (cost+(cost*0.05))/tenure;
                    System.out.println("RIO 5%");
                    break; 
                case 24:
                    emi = (cost+(cost*0.10))/tenure;
                    System.out.println("RIO 10%");
                    break;     
                case 36:
                    emi = (cost+(cost*0.15))/tenure;
                    System.out.println("RIO 15%");
                    break; 
                default:
                    System.out.println("invalid tenure");
                    break;        
            }
            System.out.println("your repayment emi"+emi);
        }else {
            System.out.println(cost+"is not eligible for emi");
        }
    }
}
