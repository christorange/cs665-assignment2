
| CS-665       | Software Design & Patterns |
|--------------|----------------------------|
| Name         | Chenfei Yu                 |
| Date         | 10/10/2023                 |
| Course       | Fall                       |
| Assignment # | 2                          |

# Assignment Overview
A notification system for retailers to notify delivers about delivery requests.

# GitHub Repository Link:
https://github.com/christorange/cs665-assignment2

# Implementation Description 

- Flexibility: the `shop` class implements `IPublisher` interface, and 
any new shop can be added by implementing the `IPublisher` interface. The 'driver'
class implements `ISubscriber` interface, and any new driver can be added by implementing
this interface.
- Simplicity and Understandability: each class is documented and has getters and setters for each field.
The notification system is implemented by creating an array list of subscribed drivers in the `shop` class,
so adding and removing subscribers is easy.
- Avoiding duplicated code: publisher and subscriber classes are implemented as interfaces, necessary methods
are predefined in the interfaces, so there is no duplicated code.
- Design patterns: the observer pattern is used in this assignment. The `shop` class is the publisher, and the `driver`
class is the subscriber. The `shop` class has an array list of subscribed drivers, and the `driver` class has a list of
notifications. When a new delivery request is added to the `shop` class, the `shop` class will notify all subscribed drivers.


# Maven Commands

## Compile

```bash
mvn clean compile
```



## JUnit Tests

```bash
mvn clean test
```





