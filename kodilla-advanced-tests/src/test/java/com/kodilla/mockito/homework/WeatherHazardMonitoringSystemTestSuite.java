package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherHazardMonitoringSystemTestSuite {

    WeatherHazardMonitoringSystem weatherHazardMonitoringSystem = new WeatherHazardMonitoringSystem();
    User user = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);
    GeneralNotification notification = Mockito.mock(GeneralNotification.class);

    public void addUserSubscriptionToLocation(User user, Location location) {
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user, location);
    }

    public void removeUserSubscriptionToLocation(User user, Location location) {
        weatherHazardMonitoringSystem.removeUserLocationSubscription(user, location);
    }

    public void removeUserSubscription(User user) {
        weatherHazardMonitoringSystem.removeUserSubscription(user);
    }

    public void sendWeatherAlert() {
        weatherHazardMonitoringSystem.sendWeatherAlert(location);
    }

    public void sendGeneralNotification() {
        weatherHazardMonitoringSystem.sendGeneralNotification(notification);
    }

    @Test
    public void notSubscriberShouldNotReceiveNotificationAndAlert() {
        sendGeneralNotification();
        sendWeatherAlert();
        Mockito.verify(user, Mockito.never()).receive(notification);
        Mockito.verify(user, Mockito.never()).receive(location);
    }

    @Test
    public void subscriberShouldReceiveNotificationFromLocation() {
        addUserSubscriptionToLocation(user, location);
        sendWeatherAlert();
        Mockito.verify(user, Mockito.times(1)).receive(location);
    }

    @Test
    public void allSubscribedUsersShouldReceiveGeneralNotification() {
        addUserSubscriptionToLocation(user, location);
        addUserSubscriptionToLocation(user2, location2);
        sendGeneralNotification();
        Mockito.verify(user, Mockito.times(1)).receive(notification);
        Mockito.verify(user2, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedUserShouldNotReceiveNotificationAndAlert() {
        addUserSubscriptionToLocation(user, location);
        removeUserSubscription(user);
        sendGeneralNotification();
        sendWeatherAlert();
        Mockito.verify(user, Mockito.never()).receive(notification);
        Mockito.verify(user, Mockito.never()).receive(location);
    }

    @Test
    public void userUnsubscribedFromLocationShouldNotReceiveAlert() {
        addUserSubscriptionToLocation(user, location);
        addUserSubscriptionToLocation(user, location2);
        removeUserSubscriptionToLocation(user, location);
        sendWeatherAlert();
        sendGeneralNotification();
        Mockito.verify(user, Mockito.never()).receive(location);
        Mockito.verify(user, Mockito.times(1)).receive(notification);
    }

    @Test
    public void userUnsubscribedFromAllLocationsShouldNotReceiveNotificationAndAlert() {
        addUserSubscriptionToLocation(user, location);
        addUserSubscriptionToLocation(user, location2);
        removeUserSubscriptionToLocation(user, location);
        removeUserSubscriptionToLocation(user, location2);
        sendWeatherAlert();
        sendGeneralNotification();
        Mockito.verify(user, Mockito.never()).receive(location);
        Mockito.verify(user, Mockito.never()).receive(notification);
    }

    @Test
    public void everyUserSubscribedLocationShouldReceiveAlert() {
        addUserSubscriptionToLocation(user, location);
        addUserSubscriptionToLocation(user2, location);
        sendWeatherAlert();
        Mockito.verify(user, Mockito.times(1)).receive(location);
        Mockito.verify(user2, Mockito.times(1)).receive(location);
    }

    @Test
    public void locationShouldBeRemoved() {
        weatherHazardMonitoringSystem.removeLocation(location);
        Mockito.verify(location, Mockito.times(1)).deleteLocation();
    }
}