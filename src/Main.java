import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        DecimalFormat df = new DecimalFormat("#.00");
        double bmi = service.calculate(72, 1.78);
        System.out.println(df.format(bmi));
    }
}
