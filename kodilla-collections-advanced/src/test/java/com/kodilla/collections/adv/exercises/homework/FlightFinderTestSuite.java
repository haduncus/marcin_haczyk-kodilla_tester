package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        // gives
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "London"));
        expectedList.add(new Flight("Warsaw", "Frankfurt"));
        expectedList.add(new Flight("Warsaw", "Paris"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        // gives
        FlightFinder flightFinder = new FlightFinder();
        // when
        List<Flight> result = flightFinder.findFlightsTo("London");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warsaw", "London"));
        expectedList.add(new Flight("Madrid", "London"));
        assertEquals(expectedList, result);
    }
}
