package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class DisplayModeTest {


    @Test

    public void switchDisplayModeTest(){
        // Given
        DisplayMode dm = new DisplayMode();

        // when
        String expected = "decimal";
        dm.switchDisplay();
        dm.switchDisplay();
        String actual = dm.whichMode;

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void switchesDisplayTest(){
        // Given
        DisplayMode dm = new DisplayMode();
        // When
        String expected = "octal";
        String  actual = dm.switchesDisplay("octal");
        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void getModeTest(){
        // Given 
        DisplayMode dm = new DisplayMode();
        // When
        String expected = "binary";
        String actual = dm.getMode();
        // Actual
        Assert.assertEquals(expected, actual);
    }
    
}