package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigUnitsTest {

     @Test

     public void switchUnitsTest(){
         // Given
         TrigUnits trigUnits = new TrigUnits();

         // When
         String expected = "radians";
         String actual = trigUnits.switchUnits("radians");

         // Then
         Assert.assertEquals(expected, actual);
     }

     @Test
     public void switchTrigUnitsTest(){
         // Given
         TrigUnits trigUnits = new TrigUnits();

         // When
         String expected = "degrees";
         trigUnits.switchTrigUnits();
         String actual = trigUnits.setMode;

         // Then
         Assert.assertEquals(expected, actual);
     }

     @Test

     public void getModeTest(){
         // Given
         TrigUnits trigUnits = new TrigUnits();

         // When
         String expected = "radians";
         String actual = trigUnits.getMode();

         // Then
         Assert.assertEquals(expected, actual);
     }
    
}