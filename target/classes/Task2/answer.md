# TASK 2

I chose creative patterns for the first application. This design pattern provides alternative solutions to object creation from classes by hiding the logic of creating objects instead of creating objects directly using the new operator. This program provides flexibility and convenience in creating whatever object is needed in the stream. I decided to use factory method under this topic. The Factory design pattern abstracts object formation according to the information provided by the client, allowing us to control it from a central location. Classes are derived through the interface. This separates the client and the object that will do the job, ensuring loose loyalty. Similar objects are grouped by deriding from the same interface. The factory pattern also allows us to create examples of abstract classes that we define in our system. The factory pattern is one of the most used patterns in Java. Thanks to the large number of abstract classes, many functions are more easily separated. As the diagram shows, there are more than one function from the controller.

For the second application, I again chose to use abstract factroy method from creative patterns. Abstract Factory design pattern has similar characteristics to factory pattern. The difference from the factory is that it creates objects not from a single interface, but from a different interface for each product family. It has a very flexible and expandable structure because it performs object formation through interfaces. This method is used to isolate the client side with the product family you will use when we have to work with more than one product family. Since it will be used in more than one operating system in the desired project, multiple interfaces are required, but it can be done very easily with abstract classes because its basic logic is the same. as shown in the example, a separate class is created for all operating systems and is made by modifying abstract classes according to operating systems.

I selected behavioral patterns for the final application. This design pattern provides solutions for behaviors between objects at run time. I decided to do it with memento because it would be recorded in the transaction. The rememberive design pattern allows all or part of objects to be recorded at a specific moment and then recreated.