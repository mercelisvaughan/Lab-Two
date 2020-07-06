package io.codedifferently;

public class TrigUnits extends ScientificCalc{

    int index = 0;
    String[] units = {"radians", "degrees", "placeholder"};
    protected String setMode = units[index];

    public String switchUnits(String s){
        setMode = s;
        return s;
    }

    public void switchTrigUnits(){

        if (index == units.length){
            index = 0;
        }
        else{
        index++;
        }
        setMode = units[index];
    }

    public String getMode(){
        return setMode;
    }
    
}