# Design Patterns

### Creational Patterns

* [Factory Pattern](/src/creational/factory)
* [Abstract Factory Pattern](/src/creational/abstract_factory)
* [Singleton Pattern](/src/creational/singleton)

### Behavioral Patterns

* [Command Pattern](/src/behavioral/command)
* [Mediator Pattern](/src/behavioral/mediator)
* [Observer Pattern](/src/behavioral/observer)
* [Strategy Pattern](/src/behavioral/strategy)
* [Chain Of Responsibility Pattern](/src/behavioral/chain_of_responsibility)
* [State Pattern](/src/behavioral/state)

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