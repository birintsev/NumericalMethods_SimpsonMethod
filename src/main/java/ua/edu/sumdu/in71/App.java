package ua.edu.sumdu.in71;

import ua.edu.sumdu.in71.functions.FunctionGroup;
import ua.edu.sumdu.in71.functions.impl.FunctionGroupVar27Impl;
import ua.edu.sumdu.in71.methods.SimpsonMethod;
import ua.edu.sumdu.in71.methods.maximization.Bisection;

import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        System.out.println("Integral " + SimpsonMethod.getIntegral(1, 2.2, FunctionGroupVar27Impl.getInstance(), 1e-4d));
        //System.out.println("Bisection : " + Bisection.getMinimum(e -> 3*Math.exp(-e) + 6 * e * e,-10, 2.2, 1e-5));
        //System.out.println(SimpsonMethod.getIntegral(1, 2.2, FunctionGroupVar27Impl.getInstance(), 1e-4d));
        /*System.err.println(FunctionGroupVar27Impl.getInstance().getFourthDerivative().apply(4d));
        System.out.println(FunctionGroupVar27Impl.getInstance().getFirstDerivative().apply(4d));
        System.err.println(FunctionGroupVar27Impl.getInstance().getSecondDerivative().apply(4d));*/

        /*System.out.println("fourth");
        FunctionGroup functionGroup = new FunctionGroup() {
            @Override
            public Function<Double, Double> getFunction() {
                return x -> FunctionGroupVar27Impl.getInstance().getFourthDerivative().apply(x);
            }

            @Override
            public Function<Double, Double> getFirstDerivative() {
                return x -> {
                    double chisl = Math.pow(x, 2) + 3.8;
                    double znam = Math.pow(x, 3) + 7.1;
                    return (5760 * Math.pow(x, 3) / Math.pow(znam, 3)
                            + (-1) * 120 / Math.pow(znam, 2)
                            + (-1) * 22680 * Math.pow(x, 6) / Math.pow(znam, 4)
                            + 19440 * Math.pow(x, 9) / Math.pow(znam, 5)
                            + (-1) * 12960 * Math.pow(x ,4) * chisl / Math.pow(znam, 4)
                            + 38880 * Math.pow(x, 7) * chisl / Math.pow(znam, 5)
                            + (-1) * 29160 * Math.pow(x, 10) * chisl / Math.pow(znam, 6)
                            + 720 * x * chisl / Math.pow(znam, 3));
                };
            }

            @Override
            public Function<Double, Double> getSecondDerivative() {
                return x -> {
                    double chisl = Math.pow(x, 2) + 3.8;
                    double znam = Math.pow(x, 3) + 7.1;
                    return (720 * chisl / Math.pow(znam, 3)
                            + 19440 * Math.pow(x, 2) / Math.pow(znam, 3)
                            + (-1) * 213840 * Math.pow(x, 5) / Math.pow(znam, 4)
                            + 524880 * Math.pow(x, 8) / Math.pow(znam, 5)
                            + (-1) * 349920 * Math.pow(x, 11) / Math.pow(znam, 6)
                            + (-1) * 58320 * Math.pow(x, 3) * chisl / Math.pow(znam, 4)
                            + 427680 * Math.pow(x, 6) * chisl / Math.pow(znam, 5)
                            + (-1) * 874800 * Math.pow(x, 9) * chisl / Math.pow(znam, 6)
                            + 524880 * Math.pow(x, 12) * chisl / Math.pow(znam, 7));

                };
            }

            @Override
            public Function<Double, Double> getFourthDerivative() {
                throw new UnsupportedOperationException();
            }
        };
        //System.out.println(NewthonMethod.getMinimum(functionGroup, 1, 2.2, 1e-4d));
        System.out.println(Bisection.getMinimum(e -> e * e, -1, 2, 1e-4));*/
    }
}