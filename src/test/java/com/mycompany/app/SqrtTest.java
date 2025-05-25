package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SqrtTest {

    private static final double TOLERANCE = 0.0001;

    @Test
    public void testCalcPerfectSquareRoot() {
        Sqrt sqrtCalc = new Sqrt(16.0);
        assertEquals(4.0, sqrtCalc.calc(), TOLERANCE);
    }

    @Test
    public void testCalcIrrationalRoot() {
        Sqrt sqrtCalc = new Sqrt(5.0);
        assertEquals(2.2361, sqrtCalc.calc(), TOLERANCE);
    }

    @Test
    public void testCalcZeroValue() {
        Sqrt sqrtCalc = new Sqrt(0.0);
        assertEquals(0.0, sqrtCalc.calc(), TOLERANCE);
    }

    @Test
    public void testCalcSmallDecimal() {
        Sqrt sqrtCalc = new Sqrt(0.0001);
        assertEquals(0.01, sqrtCalc.calc(), TOLERANCE);
    }

    @Test
    public void testAverageCalculation() {
        Sqrt sqrtCalc = new Sqrt(0);
        assertEquals(4.5, sqrtCalc.average(3.0, 6.0), TOLERANCE);
    }

    @Test
    public void testAverageIdenticalValues() {
        Sqrt sqrtCalc = new Sqrt(0);
        assertEquals(7.0, sqrtCalc.average(7.0,7.0), TOLERANCE);
    }

    @Test
    public void testGoodPrecisionCheck() {
        Sqrt sqrtCalc = new Sqrt(0);
        assertTrue(sqrtCalc.good(3.0, 9.0));
    }

    @Test
    public void testConstructorArgument() {
        Sqrt sqrtCalc = new Sqrt(25.0);
        assertEquals(25.0, sqrtCalc.argument, TOLERANCE);
    }

    @Test
    public void testImproveEstimation() {
        Sqrt sqrtCalc = new Sqrt(0);
        assertEquals(1.25, sqrtCalc.improve(1.0, 1.5), TOLERANCE);
    }

    @Test
    public void testIterSingleIteration() {
        Sqrt sqrtCalc = new Sqrt(0);
        assertEquals(1.25, sqrtCalc.iter(1.0, 1.5625), TOLERANCE);
    }

}