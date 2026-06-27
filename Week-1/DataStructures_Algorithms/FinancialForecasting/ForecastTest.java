public class ForecastTest {
    public static void main(String[] args) {
        double current = 1000;
        double rate = 0.05;
        int years = 3;

        double future = Forecast.predict(current, rate, years);
        System.out.println("Future value after " + years + " years: " + future);
    }
}
// output:
// Future value after 3 years: 1157.625
