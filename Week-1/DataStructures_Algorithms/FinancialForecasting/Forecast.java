

public class Forecast {

    public static double predict(double current, double rate, int years) {
        if (years == 0) return current;
        return predict(current * (1 + rate), rate, years - 1);
    }
}

