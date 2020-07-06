package io.codedifferently;

public class CoreFeatures extends ScientificCalc{

    public Double addition(Double currentDisplay, double x){
        return currentDisplay + x;

    }

    public Double subtraction(Double currentDisplay, double x){
        return currentDisplay - x;
    
    }

    public Double division(Double currentDisplay, double x){
        if (x == 0){
            System.out.println("Cannot divide by zero");
            return currentDisplay;
        }
        return currentDisplay / x;

    }
    public Double multiply(Double currentDisplay, double x){
        currentDisplay = currentDisplay * x;
        return currentDisplay;

    }
    public Double exponential(Double currentDisplay, Double exp){
        return Math.pow(currentDisplay, exp);
    }
    public Double squareRoot(Double currentDisplay){
        currentDisplay = Math.sqrt(currentDisplay);
        return currentDisplay;
    }
    public Double square(double x){
        x = x * x;
        return x;
    }
    public Double inverse(double x){
        x = 1 / x;
        return x;
    }
    public Double invert(double x){
        return -x;
    }
    public Double minimumHouseCost(Double h){
        Double lowestDownPayment = h * 0.10;
        return lowestDownPayment;
    }

    public Double force(Double mass, Double acceleration){
        return mass * acceleration;
    }
}