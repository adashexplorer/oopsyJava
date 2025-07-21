# Abstraction

## What is an Abstraction :-
> Process of hiding implementation details & only showing the essential details to the end user is called `Abstraction`.
> Focus is always on `What the object/feature does ?` instead of `How the object/feature does ?`

## Key features of Abstraction :-
 - It hides the underlying implementation and only shows what the feature does
 - It can contain both `abstract` and `concrete` methods.
 - The abstract methods in Abstract class has to be implemented in child / subclasses by `extending` it in case of `abstract` classes and
   by `implementing` it in case of `Interfaces`.
 - By abstracting functionality, changes in the implementation do not affect the code that depends on the abstraction as implementation
   is personal to the subclasses that is extending the Abstract classes.
 - In Java, Abstraction can be achieved by following two ways.
     - Abstract classes (Partial Abstraction)
     - Interface (`100%` Abstraction up-to `Java 7`.)
         - **Interfaces represents behavioural abstraction, but are no longer `100%` abstract after `Java 8`.**

## Abstract classes & Abstract methods :-
- Abstract class and abstract method both are defined with `abstract` keyword.
- An abstract method does not have any implementation body. Only declaration.
- An abstract class can contain both `abstract` & `concrete` methods.
- An abstract method must be redefined with implementation body in its subclass / child class by overriding it by `@Override` annotation
  or making a subclass / child class itself abstract.
- There can be no object created for an abstract class i.e one cannot instantiate abstract class object with `new` keyword. It can only be done 
  with subclass / child class reference.
- An abstract class can have both `default` & `parameterized` constructors.


## Real life use case :-
> Consider a man driving a car. When, he applies accelerator the car moves forward with a certain speed and once he applies brakes
> the car stops. What the man cares about is the car moving & stopping. It does not matter, how applying accelerator increases speed
> applying brakes reduces speed.
> 
> Consider a television remote. When you press the power button, the TV gets powered on. Similarly, when you press the power button
> again while TV is on its get switched off. One does not care about how that works internally to make the TV powered on & off.
> One is only interested in TV getting powered on and off.
> 
> That's what Abstraction are.


## In project what scenario Abstraction will be used :-


## When to use Abstraction :-


## What is the disadvantage if we don't use Abstraction :-





# Interfaces -
