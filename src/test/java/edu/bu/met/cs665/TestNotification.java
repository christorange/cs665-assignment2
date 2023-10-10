package edu.bu.met.cs665;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestNotification {

    @Test
    public void testNotification() {
        Shop foodShop = new Shop("Food Shop", "123 Main St", "555-555-5555");

        Driver driver1 = new Driver("James");
        Driver driver2 = new Driver("Jonathan");
        Driver driver3 = new Driver("Jane");
        Driver driver4 = new Driver("Jill");
        Driver driver5 = new Driver("Jack");

        foodShop.registerSubscriber(driver1);
        foodShop.registerSubscriber(driver2);
        foodShop.registerSubscriber(driver3);
        foodShop.registerSubscriber(driver4);
        foodShop.registerSubscriber(driver5);

        DeliveryRequest request1 = new DeliveryRequest("John Doe", "123 Main St", "555-555-5555");
        foodShop.updateDeliveryRequest(request1);

        assertEquals(request1, driver1.getDeliveryRequest());
        assertEquals(request1, driver2.getDeliveryRequest());
        assertEquals(request1, driver3.getDeliveryRequest());
        assertEquals(request1, driver4.getDeliveryRequest());
        assertEquals(request1, driver5.getDeliveryRequest());
    }

}
