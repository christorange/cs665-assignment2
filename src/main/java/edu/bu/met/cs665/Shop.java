/**
 * Name: Chenfei Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: Shop.java
 * Description: Shop class, maintains a list of subscribers and notify them when a new delivery request is created
 */
package edu.bu.met.cs665;

import java.util.ArrayList;

public class Shop implements IPublisher{
    private String name;
    private String address;
    private String phone;
    private DeliveryRequest latestDeliveryRequest;
    private ArrayList<ISubscriber> deliverList = new ArrayList<ISubscriber>();

    public Shop(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void registerSubscriber(ISubscriber subscriber) {
        deliverList.add(subscriber);
    }

    public void removeSubscriber(ISubscriber subscriber) {
        deliverList.remove(subscriber);
    }

    // Update latestDeliveryRequest and notify subscribers
    public void updateDeliveryRequest(DeliveryRequest deliveryRequest) {
        this.latestDeliveryRequest = deliveryRequest;
        notifySubscribers();
    }

    // Call updateDeliveryRequest() of each subscriber
    public void notifySubscribers() {
        for (ISubscriber subscriber : deliverList) {
            subscriber.updateDeliveryRequest(this.latestDeliveryRequest);
        }
    }
}
