package ua.edu.sumdu.in71.functions.impl;

import ua.edu.sumdu.in71.functions.FunctionGroup;

import java.util.function.Function;

public class FunctionGroupVar27Impl extends FunctionGroup {
    {
        function = x -> (Math.pow(x, 2) + 3.8) / (Math.pow(x, 3) + 7.1);
        firstDerivative = x ->
                ((2 * x) / (Math.pow(x, 3) + 7.1))
                + (-1) * (3 * Math.pow(x, 2) * (Math.pow(x, 2) + 3.8)) / Math.pow((Math.pow(x, 3) + 7.1), 2);
        secondDerivative = x ->
                (2 / (Math.pow(x, 3) + 7.1))
                + (-1) * (12 * Math.pow(x, 3) / Math.pow(Math.pow(x, 3) + 7.1, 2))
                + (18 * Math.pow(x, 4) * (Math.pow(x, 2) + 3.8) / Math.pow(Math.pow(x, 3) + 7.1, 3))
                + (-1) * 6 * x * (Math.pow(x, 2) + 3.8) / Math.pow(Math.pow(x, 3) + 7.1, 2);
        fourthDerivative = x ->
                (1080 * Math.pow(x, 4)) / Math.pow((Math.pow(x, 3) + 7.1), 3)
                + (-1) * (120 * x) / Math.pow((Math.pow(x, 3) + 7.1), 2)
                + (-1) * (1296 * Math.pow(x, 7)) / Math.pow((Math.pow(x, 3) + 7.1), 4)
                + (360 * Math.pow(x, 2) * (Math.pow(x, 2) + 3.8)) / Math.pow((Math.pow(x, 3) + 7.1), 3)
                + (-1) * (1944 * Math.pow(x, 5) * (Math.pow(x, 2) + 3.8)) / Math.pow((Math.pow(x, 3) + 7.1), 4)
                + (1944 * Math.pow(x, 8) * (Math.pow(x, 2) + 3.8)) / Math.pow((Math.pow(x, 3) + 7.1), 5);
    }

    private static FunctionGroupVar27Impl singleton = new FunctionGroupVar27Impl();

    public static FunctionGroupVar27Impl getInstance() {
        return singleton;
    }
}