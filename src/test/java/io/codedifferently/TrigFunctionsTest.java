package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class TrigFunctionsTest {

    @Test

    public void sinTest(){
        TrigFunctions trigFunctions = new TrigFunctions();
        // Given 
        double expectedCurrentDisplay = 0.707;
        // When 
        double actualCurrentDisplay = trigFunctions.sin(45.0);
        // Then 
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0.00);
    }

    @Test

    public void cosinTest(){
        TrigFunctions trigFunctions = new TrigFunctions();

        // Given 
        double expectedCurrentDisplay = 0.052;

        // When
        double actualCurrentDisplay = trigFunctions.cosin(87.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0.0);
    }

    @Test

    public void tangentTest(){
        TrigFunctions trigFunctions = new TrigFunctions();

        // Given
        double expectedCurrentDisplay = 2.356;

        // when
        double actualCurrentDisplay = trigFunctions.tangent(67.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0.0);
    }

    @Test

    public void inverseSinTest(){
        TrigFunctions trigFunctions = new TrigFunctions();

        // Given
        double expectedCurrentDisplay = 0.903;

        // When
        double actualCurrentDisplay = trigFunctions.inverseSin(45.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0.0);

    }

    @Test

    public void inverseCosTest(){
        TrigFunctions trigFunctions = new TrigFunctions();

        // Given
        double expectedCurrentDisplay = 0.667;

        // When
        double actualCurrentDisplay = trigFunctions.inverseCos(45.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0.0);

    }

    @Test

    public void inverseTangentTest(){
        TrigFunctions trigFunctions = new TrigFunctions();

        // Given
        double expectedCurrentDisplay = 0.800;

        // When
        double actualCurrentDisplay = trigFunctions.inverseTangent(59.0);

        // Then
        Assert.assertEquals(expectedCurrentDisplay, actualCurrentDisplay, 0.0);
    }
}