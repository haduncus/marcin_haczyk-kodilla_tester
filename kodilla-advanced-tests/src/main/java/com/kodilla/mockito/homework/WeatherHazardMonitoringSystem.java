package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherHazardMonitoringSystem {

    Set<Location> locations = new HashSet<>();
    private Map<User, Set<Location>> subscribersList = new HashMap<>();

    public void addUserSubscriptionToLocation(User user, Location location) {
        if (subscribersList.containsKey(user)) {
            subscribersList.get(user).add(location);
        } else {
            this.locations.add(location);
            subscribersList.put(user, locations);
        }
    }

    public void sendGeneralNotification(GeneralNotification notification) {
        this.subscribersList.forEach((user, locations) -> user.receive(notification));
    }

    public void sendWeatherAlert(Location location) {
        this.subscribersList.entrySet()
                .stream()
                .filter(user -> user.getValue().contains(location))
                .forEach(user -> user.getKey().receive(location));
    }

    public void removeUserSubscription(User user) {
        this.subscribersList.remove(user);
    }

    public void removeUserLocationSubscription(User user, Location location) { // Jeśli usunie wszystkie lokacje, usunąć użytkownika
        for (Map.Entry<User, Set<Location>> usersSubs : subscribersList.entrySet()) {
            if (usersSubs.getKey().equals(user)) {
                usersSubs.getValue().remove(location);
                if (usersSubs.getValue().isEmpty()) {
                    this.subscribersList.remove(user);
                }
            }
        }

    }

    public void removeLocation(Location location) {
        location.deleteLocation();
    }
}
