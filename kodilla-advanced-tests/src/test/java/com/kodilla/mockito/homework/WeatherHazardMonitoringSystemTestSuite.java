package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherHazardMonitoringSystemTestSuite {

    WeatherHazardMonitoringSystem weatherHazardMonitoringSystem = new WeatherHazardMonitoringSystem();
    User user = Mockito.mock(User.class);
    Location location = Mockito.mock(Location.class);
    GeneralNotification notification = Mockito.mock(GeneralNotification.class);

    @Test
    public void notSubscriberShouldNotReceiveNotificationAndAlert() {
        weatherHazardMonitoringSystem.sendGeneralNotification(notification);
        weatherHazardMonitoringSystem.sendWeatherAlert(location);
        Mockito.verify(user, Mockito.never()).receive(notification);
        Mockito.verify(user, Mockito.never()).receive(location);
    }

    @Test
    public void subscriberShouldReceiveNotificationFromLocation() {
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user, location);
        weatherHazardMonitoringSystem.sendWeatherAlert(location);
        Mockito.verify(user, Mockito.times(1)).receive(location);
    }

    @Test
    public void allSubscribedUsersShouldReceiveGeneralNotification() {
        User user_2 = Mockito.mock(User.class);
        Location location_2 = Mockito.mock(Location.class);
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user, location);
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user_2, location_2);
        weatherHazardMonitoringSystem.sendGeneralNotification(notification);
        Mockito.verify(user, Mockito.times(1)).receive(notification);
        Mockito.verify(user_2, Mockito.times(1)).receive(notification);
    }

    @Test
    public void unsubscribedUserShouldNotReceiveNotificationAndAlert() {
        weatherHazardMonitoringSystem.removeUserSubscription(user);
        weatherHazardMonitoringSystem.sendGeneralNotification(notification);
        weatherHazardMonitoringSystem.sendWeatherAlert(location);
        Mockito.verify(user, Mockito.never()).receive(notification);
        Mockito.verify(user, Mockito.never()).receive(location);
    }

    @Test
    public void userUnsubscribedFromLocationShouldNotReceiveAlert() {
        Location location_2 = Mockito.mock(Location.class);
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user, location);
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user, location_2);
        weatherHazardMonitoringSystem.removeUserLocationSubscription(user, location);
        weatherHazardMonitoringSystem.sendWeatherAlert(location);
        weatherHazardMonitoringSystem.sendGeneralNotification(notification);
        Mockito.verify(user, Mockito.never()).receive(location);
        Mockito.verify(user, Mockito.times(1)).receive(notification);
    }

    @Test
    public void userUnsubscribedFromAllLocationsShouldNotReceiveNotificationAndAlert() {
        Location location_2 = Mockito.mock(Location.class);
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user, location);
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user, location_2);
        weatherHazardMonitoringSystem.removeUserLocationSubscription(user, location);
        weatherHazardMonitoringSystem.removeUserLocationSubscription(user, location_2);
        weatherHazardMonitoringSystem.sendWeatherAlert(location);
        weatherHazardMonitoringSystem.sendGeneralNotification(notification);
        Mockito.verify(user, Mockito.never()).receive(location);
        Mockito.verify(user, Mockito.never()).receive(notification);
    }

    @Test
    public void everyUserSubscribedLocationShouldReceiveAlert() {
        User user_2 = Mockito.mock(User.class);
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user, location);
        weatherHazardMonitoringSystem.addUserSubscriptionToLocation(user_2, location);
        weatherHazardMonitoringSystem.sendWeatherAlert(location);
        Mockito.verify(user, Mockito.times(1)).receive(location);
        Mockito.verify(user_2, Mockito.times(1)).receive(location);
    }

    @Test
    public void locationShouldBeRemoved() {
        weatherHazardMonitoringSystem.removeLocation(location);
        Mockito.verify(location, Mockito.times(1)).deleteLocation();
    }
}
