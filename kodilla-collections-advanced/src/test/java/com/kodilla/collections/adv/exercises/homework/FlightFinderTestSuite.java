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
        List<Flight> flightList = FlightRepository.getFlightTable();
        flightList.add(new Flight("Neverland", "Rome"));
        flightList.add(new Flight("Paris", "Neverland"));
        flightList.add(new Flight("Neverland", "Moscow"));
        // when
        List<Flight> result = flightFinder.findFlightsFrom("Neverland");                              // zwracana jest pusta lista, tak jakby metoda ta wywoływana była, nie widząc nowo dodanych elementów
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Neverland", "Rome"));
        expectedList.add(new Flight("Neverland", "Moscow"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        // gives
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> flightList = FlightRepository.getFlightTable();
        flightList.add(new Flight("London", "Neverland"));
        flightList.add(new Flight("Neverland", "Frankfurt"));
        flightList.add(new Flight("Warsaw", "Neverland"));
        // when
        List<Flight> result = flightFinder.findFlightsTo("Neverland");                                // zwracana jest pusta lista, tak jakby metoda ta wywoływana była, nie widząc nowo dodanych elementów
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("London", "Neverland"));
        expectedList.add(new Flight("Warsaw", "Neverland"));
        assertEquals(expectedList, result);
    }
}