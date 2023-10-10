/**
 * Name: Chenfei Yu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/10/2023
 * File Name: IPublisher.java
 * Description: Interface for publishers, retailers must implement this interface
 */
package edu.bu.met.cs665;

public interface IPublisher {
    void registerSubscriber(ISubscriber subscriber);
    void removeSubscriber(ISubscriber subscriber);
    void notifySubscribers();
}
