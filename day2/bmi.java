import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        double weight = 0,height = 0 ,bmi =0;
        String status="",name="";
        System.out.println("welcome to know your health");
        System.out.println("let us know your:");
        name = info.next();
        System.out.println("let us know your weight(kg)");
        height=info.nextDouble();
        height/=100;
        bmi= weight/(height*height);
        status= (bmi<18.0)?"underweight":
        (bmi>=18.0 && bmi<=24.0)?"normal":
        (bmi>24.0 && bmi<28.0)?"overweight":"obese";
        System.out.println("the user "+name+"and here is your health lll"+status);
    }
}