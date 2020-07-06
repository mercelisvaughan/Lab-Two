package io.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ScientificCalcTest {

    ScientificCalc sc;

    @Before
    public void setup(){
        this.sc = new ScientificCalc();
    }

    @Test
    public void setCurrentDisplayTest(){
        // when
        Double expected = 2.0;
        Double actual = sc.setCurrentDisplayValue(2.0);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDisplayTest(){
        // When
        DisplayMode expected = sc.getDisplay();
        DisplayMode actual = sc.getDisplay();
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void getTrigFuncsTest(){
        // When 
        TrigFunctions expected = sc.getTrigFunctions();
        TrigFunctions actual = sc.getTrigFunctions();

        // Then
        Assert.assertEquals(expected, actual);
    }
    
    @Test

    public void getTrigUnitsTest(){
        // When
        TrigUnits expected = sc.getTrigUnits();
        TrigUnits actual = sc.getTrigUnits();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    
    public void getCoreFeaturesTest(){
        // When
        CoreFeatures expected = sc.getCoreFeatures();
        CoreFeatures actual = sc.getCoreFeatures();

        // Then
        Assert.assertEquals(expected, actual);
    }


}