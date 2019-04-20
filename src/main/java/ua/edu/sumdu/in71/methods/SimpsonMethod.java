package ua.edu.sumdu.in71.methods;

import ua.edu.sumdu.in71.functions.FunctionGroup;
import ua.edu.sumdu.in71.methods.maximization.Bisection;

public class SimpsonMethod {

    public static double getIntegral(double from, double to, FunctionGroup func, double eps) {
        int n = getAmOfIntervals(from, to, func, eps);
        double h = (to - from) / n;
        return  (h / 3) * (0.5d * func.getFunction().apply(from) + getFirstSum(from, to, func, n)
                + getSecondSum(from, to, func, n) + 0.5d * func.getFunction().apply(to));
    }

    private static double getFirstSum(double from, double to, FunctionGroup func, int amOfInterval) {
        double sum = 0;
        double h = (to - from) / amOfInterval;
        for (int i = 1; i < amOfInterval; i++) {
            sum += func.getFunction().apply(from + i * h);
        }
        return sum;
    }

    private static double getSecondSum(double from, double to, FunctionGroup func, int amOfInterval){
        double sum = 0;
        double h = (to - from) / amOfInterval;
        for (int i = 1; i < amOfInterval + 1; i++) {
            double xi = from + i * h;
            double xi_1 = xi - h;
            sum += func.getFunction().apply(0.5d * (xi + xi_1));
        }
        return 2 * sum;
    }

    private static int getAmOfIntervals(double from, double to, FunctionGroup func, double eps){
        double fourthDerAbsMax = Math.max(Math.abs(Bisection.getMinimum(func.getFourthDerivative(), from, to, eps))
                , Math.abs(Bisection.getMaximum(func.getFourthDerivative(), from, to, eps)));
        double m = Math.pow((fourthDerAbsMax * Math.abs(Math.pow(to - from, 5))) / (eps * 2880), 1D/4D);
        return 2 * ((int)(((m + 1) / 1)));
    }
}