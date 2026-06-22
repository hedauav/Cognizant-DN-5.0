public class Main {

    static double forecast(double value, double growthRate, int years) {

        if (years == 0) {
            return value;
        }

        return forecast(value * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 3;

        double result = forecast(currentValue, growthRate, years);

        System.out.println("Future Value = " + result);
    }
}