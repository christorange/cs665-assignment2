/**
 * Name: Chenfei Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: ISubscriber.java
 * Description: Interface for subscribers, delivers must implement this interface
 */
package edu.bu.met.cs665;

public interface ISubscriber {
    void updateDeliveryRequest(DeliveryRequest deliveryRequest);
}
