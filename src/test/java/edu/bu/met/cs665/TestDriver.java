package edu.bu.met.cs665;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestDriver {
    @Test
    public void testDriver() {
        String name = "John Doe";

        Driver driver = new Driver(name);

        assertNotNull(driver.getDriverID());
        assertEquals(name, driver.getName());
    }

    @Test
    public void testSetName() {
        String name = "John Doe";

        Driver driver = new Driver(name);

        String newName = "Jane Doe";
        driver.setName(newName);

        assertEquals(newName, driver.getName());
    }

    @Test
    public void testUpdateDeliveryRequest() {
        String name = "John Doe";

        Driver driver = new Driver(name);

        String orderName = "Order Name";
        String address = "123 Main St";
        String phone = "555-555-5555";

        DeliveryRequest deliveryRequest = new DeliveryRequest(orderName, address, phone);

        driver.updateDeliveryRequest(deliveryRequest);

        assertEquals(deliveryRequest, driver.getDeliveryRequest());
    }
}
