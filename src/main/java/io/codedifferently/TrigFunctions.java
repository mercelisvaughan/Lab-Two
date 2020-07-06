package io.codedifferently;

public class TrigFunctions extends ScientificCalc{

    public Double sin(Double currentDisplay){
    
        Double degrees = currentDisplay;
        Double radians = Math.toRadians(degrees);
        Double x = Math.sin(radians);
        Double num = x;

        return Math.round(num * 1000.0) / 1000.0;
    }

    public Double cosin(Double currentDisplay){

        Double degrees = currentDisplay;
        Double radians = Math.toRadians(degrees);
        Double x = Math.cos(radians);
        Double num = x;

        return Math.round(num * 1000.0) / 1000.0;
    }

    public Double tangent(Double currentDisplay){

        Double degrees = currentDisplay;
        Double radians = Math.toRadians(degrees);
        Double x = Math.tan(radians);
        Double num = x;

        return Math.round(num * 1000.0) / 1000.0;
    }

    public Double inverseSin(Double currentDisplay){
    
        Double degrees = currentDisplay;
        Double radians = Math.toRadians(degrees);
        Double x = Math.asin(radians);
        Double num = x;

        return Math.round(num * 1000.0) / 1000.0;
    }

    public Double inverseCos(Double currentDisplay){

        Double degrees = currentDisplay;
        Double radians = Math.toRadians(degrees);
        Double x = Math.acos(radians);
        Double num = x;

        return Math.round(num * 1000.0) / 1000.0;
    }

    public Double inverseTangent(Double currentDisplay){

        Double degrees = currentDisplay;
        Double radians = Math.toRadians(degrees);
        Double x = Math.atan(radians);
        Double num = x;

        return Math.round(num * 1000.0) / 1000.0;
    }
    
}