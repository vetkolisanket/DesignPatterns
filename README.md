# Design Patterns

### Creational Patterns

* [Factory Pattern](/src/creational/factory)

In Factory pattern, we create objects without exposing the creation logic to the client and refer to newly created object using a common interface.

* [Abstract Factory Pattern](/src/creational/abstract_factory)

Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories.
In Abstract Factory pattern, an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

* [Singleton Pattern](/src/creational/singleton)

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without instantiating the object of the class.

* [Builder Pattern](/src/creational/builder)

Builder pattern builds a complex object using simple objects and using a step by step approach.A Builder class builds the final object step by step. This builder is independent of other objects.

* [Prototype Pattern](/src/creational/prototype)

Prototype pattern refers to creating duplicate object while keeping performance in mind. This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, return its clone on next request and update the database as and when needed thus reducing database calls.

### Behavioral Patterns

* [Command Pattern](/src/behavioral/command)

Command pattern is a data driven design pattern and falls under behavioral pattern category. A request is wrapped under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes it.

* [Mediator Pattern](/src/behavioral/mediator)

Mediator pattern is used to reduce communication complexity between multiple objects or classes. This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling.

* [Observer Pattern](/src/behavioral/observer)

Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its dependent objects are to be notified automatically.

* [Strategy Pattern](/src/behavioral/strategy)

In Strategy pattern, a class behavior or its algorithm can be changed at run time. In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.


* [Chain Of Responsibility Pattern](/src/behavioral/chain_of_responsibility)

As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request. This pattern decouples sender and receiver of a request based on type of request. In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.

* [State Pattern](/src/behavioral/state)

In State pattern, a class behavior changes based on its state. In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.

* [Interpreter Pattern](/src/behavioral/interpreter)

Interpreter pattern provides a way to evaluate language grammar or expression. This pattern involves implementing an expression interface which tells to interpret a particular context. This pattern is used in SQL parsing, symbol processing engine etc.

### Structural Patterns

* [Adapter Pattern](/src/structural/adapter)

Adapter pattern works as a bridge between two incompatible interfaces.
This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.

* [Bridge Pattern](/src/structural/bridge)

Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them.
This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. Both types of classes can be altered structurally without affecting each other.

* [Composite Pattern](/src/structural/composite)

Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of a group of objects.
This pattern creates a class that contains a group of its own objects. This class provides ways to modify its group of same objects.

* [Decorator Pattern](/src/structural/decorator)

Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

* [Filter or Criteria Pattern](/src/structural/filter_or_criteria)

Filter pattern or Criteria pattern is a design pattern that enables developers to filter a set of objects using different criteria and chaining them in a decoupled way through logical operations. This type of design pattern comes under structural pattern as this pattern combines multiple criteria to obtain single criteria.

* [Facade Pattern](src/structural/facade)

Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.
This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.

* [Flyweight Pattern](src/structural/flyweight)

Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.

* [Proxy Pattern](/src/structural/proxy)

In proxy pattern, a class represents functionality of another class. In proxy pattern, we create object having original object to interface its functionality to outer world.