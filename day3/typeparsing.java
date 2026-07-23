
public class typeparsing {
    public static void main(String[] args) {
        String strWt = "64.10", strHt = "158";
        // double bmi = (double)strwt/(doube)(strHt*strHt)
        // cam1notation
        double weight = Double.parseDouble(strWt);
        int height = Integer.parseInt(strHt);
        double ht = (double) height / 100;
        double bmi = (double) (weight / ht * ht);
        System.out.println("your BMI " + bmi);

    }
}
