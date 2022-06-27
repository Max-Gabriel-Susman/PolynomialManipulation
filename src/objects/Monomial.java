package src.objects;

import java.util.HashMap;
import java.lang.Math;

public class Monomial {

    int zeroCoefficientMagnitude = 0;

    int defaultCoefficientMagnitude = 1;

    int defaultCoefficienPower = 1;

    HashMap<Integer, Integer> defaultVariableMap =  new HashMap<>();
    
    double coefficientMagnitude;

    double coefficientPower;

    HashMap<Integer, Integer> variableToVariablePowerMap;

    // zero value Monomial constructor
    public Monomial() {
        coefficientMagnitude = 0;
        coefficientPower = 1;
        variableToVariablePowerMap = defaultVariableMap;
    }

    // coefficient magnitude only constructore
    public Monomial(double coefficient) {
        coefficientMagnitude = coefficient;
        coefficientPower = 1;
        variableToVariablePowerMap = defaultVariableMap;
    }

    // coefficient magnitude and power constructore
    public Monomial(double coefficient, double power) {
        coefficientMagnitude = coefficient;
        coefficientPower = power;
        variableToVariablePowerMap = defaultVariableMap;
    }

    // coefficient magnitude, power, and variable map constructor
    public Monomial(double coefficient, double power, HashMap<Integer, Integer> variables) {
        coefficientMagnitude = coefficient;
        coefficientPower = power;
        variableToVariablePowerMap = variables;
    }

    // variable map only constructor
    public Monomial(HashMap<Integer, Integer> variables) {
        coefficientMagnitude = defaultCoefficientMagnitude;
        coefficientPower = defaultCoefficienPower;
        variableToVariablePowerMap = variables;
    }

    public double evaluateMonomial() {

        // initial value
        double evaluation = 0.0;

        // evaluate coefficient
        evaluation += Math.pow(getCoefficientMagnitude(), getCoefficientPower());
        
        // evaluate coefficient against variable map
        // evaluation

        return evaluation;
    }

    // 
    public double getCoefficientMagnitude() {
        return coefficientMagnitude;
    }

    // 
    public double getCoefficientPower() {
        return coefficientPower;
    }
}