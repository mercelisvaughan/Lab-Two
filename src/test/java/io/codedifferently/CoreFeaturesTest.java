package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class CoreFeaturesTest extends ScientificCalcTest{

    @Test
    public void additionTest(){
        CoreFeatures coreFeatures = new CoreFeatures(); // instantiates coreFeatures 

        // Given
        double currentDisplay = 7.2;
        double expectedCurrentDisplay = 12.2;

        // When
        double actualCurrentDisplay = coreFeatures.addition(currentDisplay, 5.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0);
    }

    @Test

    public void subtractionTest(){
        CoreFeatures coreFeatures = new CoreFeatures();

        // Given
        double currentDisplay = 22.2;
        double expectedCurrentDisplay = 12.0;

        // When
        double actualCurrentDisplay = coreFeatures.subtraction(currentDisplay, 10.2);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0);
    }

    @Test
    public void multiplicationTest(){
        CoreFeatures coreFeatures = new CoreFeatures();

        // Given
        double expectedCurrentDisplay = 25.0;

        // When
        Double currentDisplay = 5.0;
        double actualCurrentDisplay = coreFeatures.multiply(currentDisplay, 5); // currentDisplay must have a value 

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0);
    }
    @Test

    public void divisionTest(){
        CoreFeatures coreFeatures = new CoreFeatures();

        // Given
        double expectedCurrentDisplay = 1.0;

        // when
        Double currentDisplay = 5.0;
        double actualCurrentDisplay = coreFeatures.division(currentDisplay, 5.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0);
    }

    @Test

    public void squareRootTest(){
        CoreFeatures coreFeatures = new CoreFeatures();

        // Given
        double expectedCurrentDisplay = 4.0;

        // When
        double actualCurrentDisplay = coreFeatures.squareRoot(16.0);
        // Then 
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0);
    }
    
    @Test

    public void exponentialTest(){
        CoreFeatures coreFeatures = new CoreFeatures();

        // Given
        double expectedCurrentDisplay = 16.0;

        // When
        double actualCurrentDisplay = coreFeatures.exponential(2.0, 4.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0);
    }

    @Test

    public void squareTest(){
        CoreFeatures coreFeatures = new CoreFeatures();

        // Given
        double expectedCurrentDisplay = 100.0;

        // When 
        double actualCurrentDisplay = coreFeatures.square(10.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0);
    }

    @Test

    public void inverseTest(){
        CoreFeatures coreFeatures = new CoreFeatures();

        // Given 
        double expectedCurrentDisplay = 0.2;

        // When 
        double actualCurrentDisplay = coreFeatures.inverse(5);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0);
    }

    @Test

    public void invertTest(){
        CoreFeatures coreFeatures = new CoreFeatures();

        // Given 
        double expectedCurrentDisplay = -5.0;

        // When 
        double actualCurrentDisplay = coreFeatures.invert(5.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0);
    }

    @Test
    public void minimumHouseCost(){
        // Given
        CoreFeatures coreFeatures = new CoreFeatures();

        // When 
        double expected = 10000.0;

        double actual = coreFeatures.minimumHouseCost(100000.0);

        // Then
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test

    public void forceTest(){
        // Given 
        CoreFeatures coreFeatures = new CoreFeatures();

        // When
        double expected = 20.0;

        double actual = coreFeatures.force(5.0, 4.0);

        // Then
        Assert.assertEquals(expected, actual, 0);

    }

}