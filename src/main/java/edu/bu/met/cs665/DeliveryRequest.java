/**
 * Name: Chenfei Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: DeliveryRequest.java
 * Description: Delivery request class
 */
package edu.bu.met.cs665;
import java.util.UUID;

public class DeliveryRequest {

    private UUID orderID;
    private String name;
    private String address;
    private String phone;

    // Constructor, generate a random UUID for each order
    public DeliveryRequest( String name, String address, String phone) {
        this.orderID = UUID.randomUUID();
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public UUID getOrderID() {
        return orderID;
    }

    @Override
    public String toString() {
        return "DeliveryRequest{" +
                "order# " + orderID +
                "name: '" + name + '\'' +
                ", address: '" + address + '\'' +
                ", phone: '" + phone + '\'' +
                '}';
    }
}
