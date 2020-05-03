package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightTable() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warsaw", "London"));
        flightList.add(new Flight("Warsaw", "Frankfurt"));
        flightList.add(new Flight("London", "Rome"));
        flightList.add(new Flight("Katowice", "Madrid"));
        flightList.add(new Flight("Frankfurt", "Madrid"));
        flightList.add(new Flight("Frankfurt", "Warsaw"));
        flightList.add(new Flight("Madrid", "London"));
        flightList.add(new Flight("Moscow", "Warsaw"));
        flightList.add(new Flight("London", "Moscow"));
        flightList.add(new Flight("Paris", "Madrid"));
        flightList.add(new Flight("Katowice", "Paris"));
        flightList.add(new Flight("Warsaw", "Paris"));
        flightList.add(new Flight("Paris", "Moscow"));
        flightList.add(new Flight("Rome", "Madrid"));
        flightList.add(new Flight("Paris", "Rome"));
        return flightList;
    }
}