public class FinancialForecast {

    // Recursive method to calculate future value
    public static double forecastValue(double principal, double rate, int years) {
        if (years == 0)
            return principal;
        return forecastValue(principal, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double initialAmount = 10000.0; // ₹10,000
        double growthRate = 0.07;       // 7% annual growth
        int years = 5;

        double futureValue = forecastValue(initialAmount, growthRate, years);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValue);
    }
}
