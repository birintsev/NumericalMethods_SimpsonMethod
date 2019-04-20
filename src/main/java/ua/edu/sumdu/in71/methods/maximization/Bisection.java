package ua.edu.sumdu.in71.methods.maximization;

import java.util.function.Function;

public class Bisection {
    public static double getMaximum(Function<Double, Double> function, double from, double to, double eps) {
        if (eps > Math.abs(from - to)) {
            return function.apply((from + to) / 2);
        }
        return Math.max(getMaximum(function, from, (from + ((to - from) / 2)) , eps), getMaximum(function, (from + ((to - from) / 2)), to , eps));
    }

    public static double getMinimum(Function<Double, Double> function, double from, double to, double eps) {
        if (eps > Math.abs(from - to)) {
            return function.apply((from + to) / 2);
        }
        return Math.min(getMinimum(function, from, (from + ((to - from) / 2)) , eps), getMinimum(function, (from + ((to - from) / 2)), to , eps));
    }
}
