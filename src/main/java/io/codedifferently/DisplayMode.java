package io.codedifferently;

public class DisplayMode extends ScientificCalc{

    int idx = 0;
    String[] displays = {"binary", "octal", "decimal", "hexadecimal"};
    protected String whichMode = displays[idx];

    public void switchDisplay(){

        if (idx == displays.length){
            idx = 0;
        }
        else {
            idx++;
 
        }

        whichMode = displays[idx]; 
        
    }

    public String switchesDisplay(String s){
        whichMode = s;
        return s;
    }
    
    public String getMode(){
        return whichMode;
    }
}