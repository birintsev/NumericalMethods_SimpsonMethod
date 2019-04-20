package ua.edu.sumdu.in71.functions;

import java.util.function.Function;

public abstract class FunctionGroup {
    protected Function<Double, Double> function;
    protected Function<Double, Double> firstDerivative;
    protected Function<Double, Double> secondDerivative;
    protected Function<Double, Double> fourthDerivative;

    public Function<Double, Double> getFunction() {
        return function;
    }

    public FunctionGroup setFunction(Function<Double, Double> function) {
        this.function = function;
        return this;
    }

    public Function<Double, Double> getFirstDerivative() {
        return firstDerivative;
    }

    public FunctionGroup setFirstDerivative(Function<Double, Double> firstDerivative) {
        this.firstDerivative = firstDerivative;
        return this;
    }

    public Function<Double, Double> getSecondDerivative() {
        return secondDerivative;
    }

    public FunctionGroup setSecondDerivative(Function<Double, Double> secondDerivative) {
        this.secondDerivative = secondDerivative;
        return this;
    }

    public Function<Double, Double> getFourthDerivative() {
        return fourthDerivative;
    }

    public FunctionGroup setFourthDerivative(Function<Double, Double> fourthDerivative) {
        this.fourthDerivative = fourthDerivative;
        return this;
    }
}