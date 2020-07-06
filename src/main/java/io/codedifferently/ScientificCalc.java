package io.codedifferently;

public class ScientificCalc { 
    
    public Double currentDisplay = 0.0;

    private TrigFunctions trigFunctions;
    private CoreFeatures coreFeatures;
    private TrigUnits trigUnits;
    private DisplayMode displayMode;


    public Double setCurrentDisplayValue(Double num){
        currentDisplay = num;
        return currentDisplay;
    }

    public DisplayMode getDisplay(){
        return displayMode;
    }

    public double getDisplayValue(){
        return currentDisplay;
    }

    public CoreFeatures getCoreFeatures(){
        return coreFeatures;
    }

    public String clearDisplayValue(){
        currentDisplay = 0.0;
        System.out.println("Value of the display is: ");
        return "0.0";
    }

    public TrigFunctions getTrigFunctions(){
        return trigFunctions;
    }

    public Double setDisplayValue(double d){
        currentDisplay = d;
        return d; 
    }

    public TrigUnits getTrigUnits(){
        return trigUnits;
    }

}