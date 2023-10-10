package edu.bu.met.cs665;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.UUID;

public class TestDeliveryRequest {

    @Test
    public void testDeliveryRequest() {
        String name = "John Doe";
        String address = "123 Main St";
        String phone = "555-555-5555";

        DeliveryRequest deliveryRequest = new DeliveryRequest( name, address, phone);

        assertNotNull(deliveryRequest.getOrderID());
        assertEquals(name, deliveryRequest.getName());
        assertEquals(address, deliveryRequest.getAddress());
        assertEquals(phone, deliveryRequest.getPhone());
    }

    @Test
    public void testToString() {
        String name = "John Doe";
        String address = "123 Main St";
        String phone = "555-555-5555";

        DeliveryRequest deliveryRequest = new DeliveryRequest( name, address, phone);

        String expected = "DeliveryRequest{" +
                "order# " + deliveryRequest.getOrderID() +
                "name: '" + name + '\'' +
                ", address: '" + address + '\'' +
                ", phone: '" + phone + '\'' +
                '}';

        assertEquals(expected, deliveryRequest.toString());
    }

}
