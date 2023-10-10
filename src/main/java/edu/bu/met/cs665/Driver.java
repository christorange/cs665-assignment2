/**
 * Name: Chenfei Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: Driver.java
 * Description: Driver class
 */
package edu.bu.met.cs665;
import java.util.UUID;

public class Driver implements ISubscriber {
    private UUID driverID;
    private String name;
    private DeliveryRequest latestDeliveryRequest;

    public Driver(String name) {
        this.driverID = UUID.randomUUID();
        this.name = name;
    }

    public UUID getDriverID() {
        return driverID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void updateDeliveryRequest(DeliveryRequest deliveryRequest) {
        this.latestDeliveryRequest = deliveryRequest;
    }

    public DeliveryRequest getDeliveryRequest() {
        return latestDeliveryRequest;
    }
}
