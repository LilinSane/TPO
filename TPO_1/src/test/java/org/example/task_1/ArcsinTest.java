package org.example.task_1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArcsinTest {

    @ParameterizedTest
    @ValueSource(doubles = {0.9, 0.8, 0.7, 0.5, 0.3, 0.2, 0.1, 0, -0.2, -0.4, -0.5, -0.7, -0.8, -0.9})
    void testArcsinValues(double number) {
        Arcsin arcsin = new Arcsin();
        assertEquals(Math.asin(number), arcsin.toPowerSeries(number), 0.01);
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.0, -1.0})
    void testArcsinBorders(double number) {
        Arcsin arcsin = new Arcsin();
        assertEquals(Double.NaN, arcsin.toPowerSeries(number));
    }

    @ParameterizedTest
    @ValueSource(doubles = {2.0, -2.0})
    void testArcsinOutOfBorders(double number) {
        Arcsin arcsin = new Arcsin();
        assertEquals(Double.NaN, arcsin.toPowerSeries(number));
    }
}
